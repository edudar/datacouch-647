package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.auditing.CurrentDateTimeProvider;
import org.springframework.data.auditing.DateTimeProvider;
import org.springframework.data.couchbase.repository.auditing.EnableCouchbaseAuditing;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

@SpringBootApplication
@EnableCouchbaseRepositories
@EnableCouchbaseAuditing
@EnableConfigurationProperties
public class Application {

    @Bean
    AuditorAware<?> auditorAware() {
        return Optional::empty;
    }

    @Bean
    DateTimeProvider dateTimeProvider() {
        return CurrentDateTimeProvider.INSTANCE;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}