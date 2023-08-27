package learn.spring.config.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgresSQLDataSource implements  DataSource{
    @Override
    public String[] getEmails() {
        return new String[]{"PG1","PG2"};
    }
}
