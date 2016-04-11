/*
package com.simple.util;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.xml.XMLSerializer;
import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

*/
/**
 * @author xiaobianchen
 * @version 1.0 2016/4/6
 *//*

public final class JsonUtil {

    private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    */
/**
     * 将数组转换为JSON
     *//*

    public static <T> String toJson(String[] array) {
        String json;
        try {
            json = OBJECT_MAPPER.writeValueAsString(array);
        } catch (Exception e) {
            logger.error("convert Array to JSON failure", e);
            throw new RuntimeException(e);
        }
        return json;
    }


    */
/**
     * 将POJO转换为JSON
     *//*

    public static <T> String toJson(T obj) {
        String json;
        try {
            json = OBJECT_MAPPER.writeValueAsString(obj);
        } catch (Exception e) {
            logger.error("convert POJO to JSON failure", e);
            throw new RuntimeException(e);
        }

        return json;
    }

    */
/**
     * 将List转换为JSON
     *//*

    public static <T> String fromList2Json(List<T> list) {
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    */
/**
     * 将Map转换为JSON
     *//*

    public static  String fromMap2Json(Map map ){
        String json;
        try {
            json = OBJECT_MAPPER.writeValueAsString(map);
        } catch (IOException e) {
            logger.error("convert MAP to JSON failure", e);
            throw new RuntimeException(e);
        }
        return json;
    }

    */
/**
     * 将SET转换为JSON
     *//*

    public static String fromSet2Json(Set set){
        String json;
        try {
            json = OBJECT_MAPPER.writeValueAsString(set);
        } catch (IOException e) {
            logger.error("convert SET to JSON failure", e);
            throw new RuntimeException(e);
        }
        return json;
    }

    */
/**
     * 将XML转换为JSON
     *//*

    public static String convertXML2JSON(String fileName) {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
        String xml;
        JSON json = null;
        try {
            xml = IOUtils.toString(is);
            XMLSerializer xmlSerializer = new XMLSerializer();
            json = xmlSerializer.read(xml);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert json != null;
        return json.toString();
    }


    */
/**
     * 将JSON转换为POJO
     *//*

    public static <T> T fromJson(String json, Class<T> type) {
        T pojo;
        try {
            pojo = OBJECT_MAPPER.readValue(json, type);
        } catch (Exception e) {
            logger.error("convert JSON to POJO failure", e);
            throw new RuntimeException(e);
        }

        return pojo;
    }

    */
/**
     * 将JSON转换为List
     *//*

    @SuppressWarnings("unchecked")
    public static <T> List<T> fromJson2List(String json, Class<T> type) {
        JSONArray jsonArray = JSONArray.fromObject(json);
        JSONObject jsonObject;
        T t;
        int size = jsonArray.size();
        List<T> tList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            jsonObject = jsonArray.getJSONObject(i);
            t = (T) JSONObject.toBean(jsonObject, type);
            tList.add(t);
        }
        return tList;
    }


    */
/**
     * 将JSON转换为XML
     *//*

    public static String toXml(String json) {
        JSON result = JSONSerializer.toJSON(json);
        XMLSerializer xmlSerializer = new XMLSerializer();
        xmlSerializer.setForceTopLevelObject(true);
        xmlSerializer.setTrimSpaces(true);
        return xmlSerializer.write(result);
    }
}
*/
