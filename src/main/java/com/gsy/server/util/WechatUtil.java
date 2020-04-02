package com.gsy.server.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class WechatUtil {

    public static String appId = "****";
    public static String appSecret = "**********";
    public static String grantType = "authorization_code";
    public static String getOpenIdUrl = "https://api.weixin.qq.com/sns/jscode2session?appid="+appId
            +"&secret="+appSecret+"&js_code=USERCODE&grant_type=" + grantType;
}
