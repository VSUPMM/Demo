/*
package payroll.repository;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import payroll.model.AbstractTask;
import payroll.repository.AbstractTaskRepository;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(AbstractTaskRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new AbstractTask("Question1", 33)));
            log.info("Preloading " + repository.save(new AbstractTask("Question1", 4)));

        };
    }
}*/
