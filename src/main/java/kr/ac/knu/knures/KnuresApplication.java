package kr.ac.knu.knures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
public class KnuresApplication {

    public static void main(String[] args) {
        SpringApplication.run(KnuresApplication.class, args);
    }

}
