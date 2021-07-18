package com.sbi.benefits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.sbi.benefits")
@EntityScan(basePackages = "com.sbi.benefits.models")
@EnableJpaRepositories(basePackages = "com.sbi.benefits.repository")
@SpringBootApplication
public class BenefitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BenefitsApplication.class, args);
	}

}
