package com.simple.maper;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/12
 */
public interface IGenericMapper<T> {
    void insert(T t);

    List<T> listAll();
}
