package com.gsy.server.util;

import com.alibaba.fastjson.*;

public class JsonUtil {

    public static JSONObject strToJsonObject(String str){
        try{
            return JSON.parseObject(str);
        }catch (Exception e){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", "1");
            jsonObject.put("message", "获取Json数据失败");
            return jsonObject;
        }

    }
}
