package pl.coderslab.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
public SimpleCustomerLogger simpleCustomerLogger(){
    return new SimpleCustomerLogger();
}

}
