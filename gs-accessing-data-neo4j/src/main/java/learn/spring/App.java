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

    @Bean
    CommandLineRunner demo(PersonRepo personRepo){
        return args -> {
            personRepo.deleteAll();

            Person greg = new Person("Greg");
            Person roy = new Person("Roy");
            Person craig = new Person("Craig");

            personRepo.save(greg);
            personRepo.save(roy);
            personRepo.save(craig);

            Person person = personRepo.findByName("Craig");
            System.out.println("Found person: " + person);
        };
    }

}
