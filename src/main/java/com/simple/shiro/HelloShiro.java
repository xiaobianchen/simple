package com.simple.shiro;


import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;


/**
 * @author xiaobianchen
 * @version 1.0 2016/4/19
 */
public class HelloShiro {

    private static final Logger logger = Logger.getLogger(HelloShiro.class);

    public static void main(String[] args) {

        Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        //获取当前用户
        Subject currentUser = SecurityUtils.getSubject();

        //登录
        UsernamePasswordToken token = new UsernamePasswordToken("shiro", "201314");
        try {
            currentUser.login(token);
        } catch (AuthenticationException e) {
            logger.info("login failure!");
            return;
        }

        logger.info("login success! Hello  " + currentUser.getPrincipal());

        //注销
        currentUser.logout();
    }
}
