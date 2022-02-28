package sec_demo.springsecurity_demo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("sec_demo.springsecurity_demo.user")
@EnableJpaRepositories(basePackages = {
        "sec_demo.springsecurity_demo.user.repository"
})
@EntityScan(basePackages = {
        "sec_demo.springsecurity_demo.user.domain"
})
public class PaperUserModule {



}
