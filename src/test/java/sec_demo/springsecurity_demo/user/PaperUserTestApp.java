package sec_demo.springsecurity_demo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
public class PaperUserTestApp {

    public static void main(String[] args) {
        SpringApplication.run(PaperUserTestApp.class, args);
    }

    @Configuration
    @ComponentScan("sec_demo.springsecurity_demo.user")
    @EnableJpaRepositories(basePackages = {
            "sec_demo.springsecurity_demo.user.repository"
    })
    @EntityScan(basePackages = {
            "sec_demo.springsecurity_demo.user.domain"
    })
    class Config {

    }

}
