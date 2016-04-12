package com.simple.service;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/12
 */
public interface IGenericService<T> {

    void insert(T t);

    List<T> listAll();

}
