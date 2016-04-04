package test;

import com.simple.model.User;
import com.simple.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/4
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
        user.setId(1);
        user.setName("zhangsan");
        user.setAge(20);

        userService.insertUser(user);
        logger.info("insert user successfully!");

    }
}