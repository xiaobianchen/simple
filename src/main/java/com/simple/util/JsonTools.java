package com.simple.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.TypeReference;
import net.sf.json.JSONSerializer;
import net.sf.json.xml.XMLSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/11
 */
public final class JsonTools {
    public static final Logger logger = LoggerFactory.getLogger(JsonTools.class);

    /**
     * convert object to json
     * @param obj object
     * @param <T> object type
     */
    public static <T> String toJson(T obj) {
        return JSON.toJSONString(obj, true);
    }

    /**
     * convert List to json
     *
     * @param list list
     * @param <T>  object type
     */
    public static <T> String toJson(List<T> list) {
        return JSON.toJSONString(list, true);
    }

    /**
     * convert Map to json
     *
     * @param map Map
     */
    public static <K, V> String toJson(Map<K, V> map) {
        return JSON.toJSONString(map, true);
    }

    /**
     * convert array to json
     *
     * @param arrs Array
     * @param <T>  Type of the Array
     */
    public static <T> String toJson(T[] arrs) {
        return JSON.toJSONString(arrs, true);
    }

    /**
     * convert xml to json
     */
    public static String xml2Json(String xml) {
       XMLSerializer xmlSerializer = new XMLSerializer();
       return xmlSerializer.read(xml).toString();
    }

    /**
     * convert json to object
     *
     * @param json  jsonString
     * @param clazz ClassType
     * @param <T>   Object
     */
    public static <T> T fromJson(String json, Class<T> clazz) {
        T obj;
        try {
            obj = JSON.parseObject(json, clazz);
        } catch (Exception e) {
            logger.error("convert JSON to Object failure", e);
            throw new RuntimeException(e);
        }
        return obj;
    }

    /**
     * convert json to array
     * @param json jsonString
     */
    public static JSONArray fromJson(String json) {
        JSONArray jsonArray;
        try {
            jsonArray = JSON.parseArray(json);
        } catch (Exception e) {
            logger.error("convert JSON to Array failure", e);
            throw new RuntimeException(e);
        }
        return jsonArray;
    }

    /**
     * convert json to List
     * @param json jsonString
     * @param <T>  type
     */
    public static <T> List<T> fromJson2List(String json, Class<T> clazz) {
        List<T> tList;
        try {
            tList = JSON.parseArray(json, clazz);
        } catch (Exception e) {
            logger.error("convert JSON to List failure", e);
            throw new RuntimeException(e);
        }
        return tList;
    }

    /**
     * convert json to map
     *
     * @param json jsonString
     */
    public static List<Map<String, Object>> fromJson2Map(String json) {
        List<Map<String, Object>> map;
        try {
            map = JSON.parseObject(json, new TypeReference<List<Map<String, Object>>>() {
            });
        } catch (Exception e) {
            logger.error("convert JSON to Map failure", e);
            throw new RuntimeException(e);
        }
        return map;
    }

    /**
     * convert json to XML
     * @param json jsonString
     */
    public static String fromJson2XML(String json) {
        XMLSerializer serializer = new XMLSerializer();
        net.sf.json.JSON jsonObject = JSONSerializer.toJSON(json);
        return serializer.write(jsonObject);
    }
}
