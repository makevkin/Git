package app.config;

import app.model.Animal;
import app.model.AnimalsCage;
import app.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean
    public Animal dogBean() {
        return new Dog();
    }
    @Bean
    public AnimalsCage animalCage() {
        return new AnimalsCage(dogBean());
    }
}
