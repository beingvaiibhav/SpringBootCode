package com.vaibhavdubey.week1Introduction.IntroductionToSpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CommandLineRunner cmdLineRunner(){
       return new CommandLineRunner() {
           @Override
           public void run(String... args) throws Exception {
               stdBean1().displayDetails();
               System.out.println("-----------------------");
               stdBean2().displayDetails();
           }
       };
    }
    @Bean
    public Student stdBean1(){
        return new  Student("Vaibhav",100,99.9f);
    }
    @Bean
    public Student stdBean2(){
        return new  Student("Vaibhav",100,99.9f);
    }
}
