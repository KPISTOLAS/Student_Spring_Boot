package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Mark = new Student(
                    "Mark",
                    "mark@gmail.com",
                    LocalDate.of(2000, Month.AUGUST, 3));
            Student George = new Student(
                    "George",
                    "George@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 2));
            Student Maria = new Student(
                    "Maria",
                    "Maria@gmail.com",
                    LocalDate.of(2003, Month.MARCH, 13));
            Student Joe = new Student(
                    "Joe",
                    "Joe@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 11));
            repository.saveAll(
                    List.of(Mark, George, Maria, Joe));
        };

    }
}
