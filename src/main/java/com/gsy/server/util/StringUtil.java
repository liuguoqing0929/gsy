package com.gsy.server.util;

public class StringUtil {

    /**
     * 判断一下 str 是否为空
     * @param str
     * @return
     */
    public static boolean isNull(String str){
        if (str == null || str == "" || "".equals(str))
            return true;
        return false;
    }


    /**
     * 转换成字符串
     * @param object
     * @return
     */
    public static String objectToStr(Object object){

        return String.valueOf(object);
    }
}
