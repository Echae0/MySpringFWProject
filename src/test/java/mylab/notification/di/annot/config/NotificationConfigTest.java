package mylab.notification.di.annot.config;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import mylab.notification.di.annot.NotificationManager;

public class NotificationConfigTest {

    @Test
    public void testNotificationManager() {
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(NotificationConfig.class);
        
        NotificationManager manager = context.getBean(NotificationManager.class);

        assertNotNull(manager); 
        assertNotNull(manager.getEmailService()); 
        assertNotNull(manager.getSmsService());  

        manager.sendNotificationByEmail("안녕하세요, 이메일 알림입니다!");
        manager.sendNotificationBySms("안녕하세요, SMS 알림입니다!");

        context.close();
    }
}