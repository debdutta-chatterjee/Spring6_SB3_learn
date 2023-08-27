package learn.spring.conig.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean(name = "mysql")
    public DataSource mysql()
    {
        return new MySQLDataSource();
    }

    @Bean(name="postgres")
    public DataSource postgres()
    {
        return new PostgresSQLDataSource();
    }

    @Bean(name="emailService", initMethod = "init", destroyMethod = "destroy")
    public EmailService email()
    {
        return new EmailService(mysql());
    }
}
