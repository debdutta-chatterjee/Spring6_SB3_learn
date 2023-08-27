package learn.spring.conig.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService = applicationContext.getBean(EmailService.class);
        emailService.senEmail();
        ((ConfigurableApplicationContext)applicationContext).close();
    }
}
