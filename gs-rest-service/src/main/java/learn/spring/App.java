package learn.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {
        return args -> {
            String url = "https://jsonplaceholder.typicode.com/users";
            User[] response = restTemplate.getForObject(url, User[].class);
            log.info("response:{}", Arrays.toString(response));
        };
    }
}
