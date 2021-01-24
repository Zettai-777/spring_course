package ru.zettai.spring.spring_introduction.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.zettai.spring.spring_introduction.beans.Cat;
import ru.zettai.spring.spring_introduction.beans.Dog;
import ru.zettai.spring.spring_introduction.beans.Person;
import ru.zettai.spring.spring_introduction.beans.Pet;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfigWithoutCompScan {

    @Bean
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        Person person = new Person(catBean());
        person.setPet2(dogBean());
        return person;
    }

    @Bean
    public Pet dogBean(){
        return new Dog();
    }

}
