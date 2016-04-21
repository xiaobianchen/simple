package com.simple.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/21
 */
public final class PropsUtil {

    private static final Logger logger = LoggerFactory.getLogger(PropsUtil.class);

    private static final Properties properties = new Properties();

    static {
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            logger.error("", e);
            throw new RuntimeException(e);
        }
    }

    public static String getProp(String key) {
        String prop = "";
        if (properties.containsKey(key)) {
            prop = properties.getProperty(key);
        }
        return prop;
    }
}
