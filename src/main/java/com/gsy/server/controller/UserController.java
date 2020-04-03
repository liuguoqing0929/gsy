package com.gsy.server.controller;

import com.gsy.server.enums.ResultCode;
import com.gsy.server.model.WechatUser;
import com.gsy.server.sevice.UserService;
import com.gsy.server.util.Result;
import com.gsy.server.util.StringUtil;
import com.gsy.server.util.WechatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @PostMapping("/getUserOpenId")
    public Result getUserOpenId(@RequestBody() WechatUser wechatUser){
        if(StringUtil.isNull(wechatUser.getCode())){
            // 参数为空
            return Result.failure(ResultCode.PARAM_IS_INVALID);
        }
        // 根据code 获取openId
        Map<Object, String> wxResult = restTemplate.getForObject(WechatUtil.getOpenIdUrl.replace("USERCODE", wechatUser.getCode()), new HashMap<>().getClass());
        if(!StringUtil.isNull(wxResult.get("errcode"))){
            String errCode = wxResult.get("errcode");
            if(errCode == null || "".equals(errCode))
                errCode = "0000";
            return Result.failure(Integer.parseInt(errCode), wxResult.get("errmsg"));
        }else{
            if(StringUtil.isNull(wxResult.get("openid")))
                return Result.failure(Integer.parseInt("0000"), "未获取到openId");
            // String openId = wxResult.get("openid");
            // WechatUser wechatUser1 = userService.getUserByOpenId(openId);
            return Result.success(wxResult.get("openid"));
        }
    }

    @RequestMapping("/addWechatUser")
    public Result addWechatUser(@RequestBody() WechatUser wechatUser){
        // 先去判断当前是否已经存在openId的用户了
        if(StringUtil.isNull(wechatUser.getOpenId())){
            return Result.failure(ResultCode.PARAM_NOT_OPENID);
        }
        // 根据 openId 判断用户是否已经存在
        WechatUser openIdUser = userService.getUserByOpenId(wechatUser.getOpenId());
        // 用户不存在
        if(openIdUser == null){
            int result = userService.addWechatUser(wechatUser);
            if(result > 0){
                return Result.success();
            }else{
                return Result.failure("添加用户失败");
            }
        }else{
            // 用户已经存在 更新微信信息
            int result = userService.editWechatUserByOpenId(wechatUser);
            return null;
        }
    }
}
