package learn.spring;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class App {

    public static void main(String[] args)  {
       SpringApplication.run(App.class, args);
       System.exit(0);
    }

}
