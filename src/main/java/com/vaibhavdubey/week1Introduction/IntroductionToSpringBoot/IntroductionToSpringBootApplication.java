package com.vaibhavdubey.week1Introduction.IntroductionToSpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
		System.out.println("Hello World");
	}

	@Override
	public void run(String... args) throws Exception {
		stdBean().displayDetails();
	}
	@Bean
	public Student stdBean(){
		return new  Student("Vaibhav",100,99.9f);
	}
}
