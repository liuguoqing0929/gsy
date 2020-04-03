package com.gsy.server.controller;

import com.gsy.server.enums.ResultCode;
import com.gsy.server.model.User;
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

    @PostMapping("getUserOpenId")
    public Result getUserOpenId(@RequestBody() User user){
        if(StringUtil.isNull(user.getCode())){
            // 参数为空
            return Result.failure(ResultCode.PARAM_IS_INVALID);
        }
        // 根据code 获取openId
        Map<Object, String> wxResult = restTemplate.getForObject(WechatUtil.getOpenIdUrl.replace("USERCODE", user.getCode()), new HashMap<>().getClass());
        if(!StringUtil.isNull(wxResult.get("errcode"))){
            String errCode = wxResult.get("errcode");
            if(errCode == null || "".equals(errCode))
                errCode = "0000";
            return Result.failure(Integer.parseInt(errCode), wxResult.get("errmsg"));
        }else{
            if(StringUtil.isNull(wxResult.get("openid")))
                return Result.failure(Integer.parseInt("0000"), "未获取到openId");
             return Result.success(wxResult.get("openid"));
        }
    }
}
