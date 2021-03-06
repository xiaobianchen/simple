package com.simple.maper;

import com.simple.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/4
 * 管理员管理
 */
public interface UserMapper extends IGenericMapper{

    void deleteUser(String id);

    User findByPrimaryKey(String id);

    void updateByPrimaryKey(User user);

    List<User> selectUserByUserName(@Param("username") String username);

}
