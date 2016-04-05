package test;

import com.simple.model.User;
import com.simple.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/4
 * 测试框架 增删改查操作
 */
public class IUserServiceImplTest {

    private static final Logger logger = Logger.getLogger(IUserServiceImplTest.class);

    @Autowired
    private IUserService userService;

    @Before
    public void before() {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
        userService = (IUserService)context.getBean("userService");
    }

    @Test
    public void testInsertUser() throws Exception {

        User user = new User();
        user.setId(4);
        user.setName("xiaobian");
        user.setAge(27);

        userService.insertUser(user);
        logger.info("insert user successfully!");
    }

    @Test
    public void testDeleteUser() throws Exception {
        userService.deleteUser(4);
        logger.info("delete user successfully!");
    }

    @Test
    public void testListAllUsers() throws Exception{
        List<User> users = userService.listAll();
        logger.info("list all users size:" + users.size());
    }

    @Test
    public void testFindByPrimaryKey() throws Exception{
        User user = userService.findByPrimaryKey(2);
        logger.info("current user info:" + user);
    }

    @Test
    public void testUpdateByPrimaryKey() throws Exception{
        User user = userService.findByPrimaryKey(2);
        logger.info("current user info:" + user);
        user.setName("xiaobianchen");
        user.setAge(28);

        userService.updateByPrimaryKey(user);
        logger.info("update user info:" + user);
    }

}