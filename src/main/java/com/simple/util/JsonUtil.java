package com.simple.util;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;
import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/6
 */
public final class JsonUtil {

    private static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /**
     * 将POJO转换为JSON
     */
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

    /**
     * 将JSON转换为POJO
     */
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

    /**
     * 将XML转换为json
     */
    public static String convertXMLtoJSON() {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("select.xml");
        String xml;
        JSON json = null;
        try {
            xml = IOUtils.toString(is);
            XMLSerializer xmlSerializer = new XMLSerializer();
            json = xmlSerializer.read(xml);
            System.out.println(json.toString(1));
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert json != null;
        return json.toString();
    }

    public static void main(String[] args) {
        String json =  convertXMLtoJSON();
        System.out.println(json);
    }
}
