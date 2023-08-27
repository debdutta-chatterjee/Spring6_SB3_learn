package learn.spring.conig.javabased;

import org.springframework.stereotype.Component;

public class MySQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        return new String[]{"MS1","MS2"};
    }
}
