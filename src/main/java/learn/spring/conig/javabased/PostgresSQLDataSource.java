package learn.spring.conig.javabased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class PostgresSQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        return new String[]{"PG1","PG2"};
    }
}
