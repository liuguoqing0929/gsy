package com.gsy.server.controller;

import com.gsy.server.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class TestHelloController {

    @Autowired
    private RestTemplate restTemplate;

//     private String appId = "wxbe576a2d19d9aa08";
    // private String openid = "owi0B5es4exNz3zfGWX_BUmkePEw";
    private String appId = "wx7a0c173792e4ebc6";

//     private String appSecret = "d8f1686e2ee44ca31c8802ec27b62e97";
    private String appSecret = "4de80d3a0fea72f516a218d8c5d33c7c";

    // 授权（必填）
    String grant_type = "authorization_code";

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello(@RequestBody() User user){
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid="+appId
                +"&secret="+appSecret+"&js_code="+user.getId()+"&grant_type=" + grant_type;
        // Object response = restTemplate.getForObject(url, new Object().getClass());
        return restTemplate.getForObject(url, new Object().getClass()).toString();
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.POST)
    public String hello2(){

        return "hello2";
    }
}
