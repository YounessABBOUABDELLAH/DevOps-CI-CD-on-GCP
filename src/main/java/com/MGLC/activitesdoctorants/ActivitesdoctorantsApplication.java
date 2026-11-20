package com.MGLC.activitesdoctorants;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages = {"com.MGLC.activitesdoctorants", "controllers", "services"})
@EntityScan(basePackages = {"entities"})
@EnableJpaRepositories(basePackages = {"repositories"})public class ActivitesdoctorantsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivitesdoctorantsApplication.class, args);
	}

}
