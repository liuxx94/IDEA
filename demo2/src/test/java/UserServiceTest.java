/**
 * Created by LENOVO on 2016/7/24.
 */

import com.smart.demo2.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    private BeanFactory factory = null;

    @Before
    public void before() {

        factory = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testSpring() {

        UserService userService = (UserService) factory.getBean("userService");
        userService.saveUser(null);
    }
}
