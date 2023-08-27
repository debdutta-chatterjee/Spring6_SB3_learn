package learn.spring.config.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class EmailService
{
    private DataSource dataSource;

    @Autowired
    //public EmailService(@Qualifier("mySQLDataSource") DataSource dataSource)
    public EmailService(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    public void senEmail()
    {
        System.out.println(Arrays.toString(dataSource.getEmails()));
    }
}
