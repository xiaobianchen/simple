package com.simple.util;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.apache.commons.dbutils.handlers.BeanMapHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/21
 */
public final class DBUtil {
    private static final Logger logger = LoggerFactory.getLogger(DBUtil.class);

    public static <T> T queryEntity(Class<T> entityClass, String sql, Object... params) {
        T entity;
        try {
            entity = createQueryRunner().query(sql, new BeanHandler<T>(entityClass), params);
        } catch (SQLException e) {
            logger.error("", e);
            throw new RuntimeException(e);
        }
        printSQL(sql);
        return entity;
    }

    public static <T> List<T> queryEntityList(Class<T> entityClass, String sql, Object... params) {
        List<T> entityList;
        try {
            entityList = createQueryRunner().query(sql, new BeanListHandler<T>(entityClass), params);
        } catch (SQLException e) {
            logger.error("", e);
            throw new RuntimeException(e);
        }
        printSQL(sql);
        return entityList;
    }

    public static <K, V> Map<K, V> queryEntityMap(Class<V> entityClass, String sql, Object... params) {
        Map<K, V> entityMap;
        try {
            entityMap = createQueryRunner().query(sql, new BeanMapHandler<K, V>(entityClass), params);
        } catch (SQLException e) {
            logger.error("", e);
            throw new RuntimeException(e);
        }
        printSQL(sql);
        return entityMap;
    }

    public static Object[] queryArray(String sql, Object... params) {
        Object[] array;
        try {
            array = createQueryRunner().query(sql, new ArrayHandler(), params);
        } catch (SQLException e) {
            logger.error("", e);
            throw new RuntimeException(e);
        }
        printSQL(sql);
        return array;
    }

    public static List<Object[]> queryArrayList(String sql, Object... params) {
        List<Object[]> arrayList;
        try {
            arrayList = createQueryRunner().query(sql, new ArrayListHandler(), params);
        } catch (SQLException e) {
            logger.error("", e);
            throw new RuntimeException(e);
        }
        printSQL(sql);
        return arrayList;
    }

    public static Map<String, Object> queryMap(String sql, Object... params) {
        Map<String, Object> map;
        try {
            map = createQueryRunner().query(sql, new MapHandler(), params);
        } catch (SQLException e) {
            logger.error("", e);
            throw new RuntimeException(e);
        }
        printSQL(sql);
        return map;
    }

    public static List<Map<String, Object>> queryMapList(String sql, Object... params) {
        List<Map<String, Object>> fieldMapList;
        try {
            fieldMapList = createQueryRunner().query(sql, new MapListHandler(), params);
        } catch (SQLException e) {
            logger.error("", e);
            throw new RuntimeException(e);
        }
        printSQL(sql);
        return fieldMapList;
    }

    public static <T> T queryColumn(String sql, Object... params) {
        T entity;
        try {
            entity = createQueryRunner().query(sql, new ScalarHandler<T>(), params);
        } catch (SQLException e) {
            logger.error("", e);
            throw new RuntimeException(e);
        }
        printSQL(sql);
        return entity;
    }

    public static <T> List<T> queryColumnList(String sql, Object... params) {
        List<T> list;
        try {
            list = createQueryRunner().query(sql, new ColumnListHandler<T>(), params);
        } catch (SQLException e) {
            logger.error("", e);
            throw new RuntimeException(e);
        }
        printSQL(sql);
        return list;
    }

    public static <T> Map<T, Map<String, Object>> queryColumnMap(String column, String sql, Object... params) {
        Map<T, Map<String, Object>> map;
        try {
            map = createQueryRunner().query(sql, new KeyedHandler<T>(column), params);
        } catch (SQLException e) {
            logger.error("", e);
            throw new RuntimeException(e);
        }
        printSQL(sql);
        return map;
    }

    public static int update(String sql, Object... params) {
        int result;
        try {
            result = createQueryRunner().update(sql, params);
        } catch (SQLException e) {
            logger.error("", e);
            throw new RuntimeException(e);
        }
        printSQL(sql);
        return result;
    }

    // ----------------------------------------------------------------------------------------------------

    private static QueryRunner createQueryRunner() {
        return new QueryRunner(getDataSource());
    }

    private static DataSource getDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(PropsUtil.getProp("jdbc.driverClassName"));
        ds.setUrl(PropsUtil.getProp("jdbc.url"));
        ds.setUsername(PropsUtil.getProp("jdbc.username"));
        ds.setPassword(PropsUtil.getProp("jdbc.password"));
        return ds;
    }

    private static void printSQL(String sql) {
        logger.debug("SQL: {}", sql);
    }
}
