package com.simple.model;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/4
 * 定义用户类
 */
public class User {

    private String id;//身份证号码
    private String username;//登录名
    private String password;//登录密码
    private String realName;//真实姓名
    private String phone;//手机号码

    public User() {

    }

    public User(String id, String username, String password, String realName, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.realName = realName;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", phone=" + phone;
    }
}
