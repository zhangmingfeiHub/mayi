package com.zebra.print.utils;

import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * json工具类
 */
public class JsonUtils {

    /**
     * json转为object
     *
     * @param jsonStr
     * @param clz
     * @param <T>
     * @return
     * @throws IOException
     */
    public static <T> T jsonToBean(String jsonStr, Class<T> clz)
            throws IOException {
        try {
            return JSONObject.parseObject(jsonStr, clz);
        } catch (Exception e) {
            throw new IOException("jsonToBean异常", e);
        }
    }

    /**
     * json转为List
     *
     * @param jsonStr
     * @param clz
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> List<T> jsonToList(String jsonStr, Class<T> clz) throws IOException {
        try {
            return JSONObject.parseArray(jsonStr, clz);
        } catch (Exception e) {
            throw new IOException("jsonToList", e);
        }

    }

    /**
     * object转成JsonString
     *
     * @param obj
     * @return
     */
    public static String objectToJsonString(Object obj) {
        return JSONObject.toJSONString(obj);
    }

    /**
     * json转为map
     *
     * @param jsonStr
     * @return
     * @throws Exception
     */
    public static Map<String, Object> jsonToMap(String jsonStr)
            throws Exception {
        return (Map) JSONObject.parse(jsonStr);
    }
}

