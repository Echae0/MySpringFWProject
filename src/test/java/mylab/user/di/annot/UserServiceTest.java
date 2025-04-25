package mylab.user.di.annot;

import static org.junit.jupiter.api.Assertions.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mylab-user-di.xml");

        UserService userService = context.getBean(UserService.class);

        System.out.println((userService != null));
        System.out.println((userService.getUserRepository() != null));
        System.out.println("MySQL".equals(userService.getUserRepository().getDbType()));
        System.out.println((userService.getSecurityService() != null));
        System.out.println(userService.registerUser("hong123", "홍길동", "1234"));
    }
}
