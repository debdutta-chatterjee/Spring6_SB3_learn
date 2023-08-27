package learn.spring.config.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements  DataSource{
    @Override
    public String[] getEmails() {
        return new String[]{"MS1","MS2"};
    }
}
