package learn.spring.conig.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;


public class EmailService
{
    private DataSource dataSource;

    public EmailService(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    public void senEmail()
    {
        System.out.println(Arrays.toString(dataSource.getEmails()));
    }

    public void init()
    {
        System.out.println("Initialized Email service");
    }

    public void destroy()
    {
        System.out.println("Destroy Email service");
    }
}
