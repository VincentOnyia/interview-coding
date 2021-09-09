package com.mastercard.interview;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class CodingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingApplication.class, args);
	}

	@Bean
	CommandLineRunner processArguments() {
		return args -> {
			SpecialIterator specialIterator = new SpecialIterator(args);
			while(specialIterator.hasNext()) {
				log.info(specialIterator.next().toString());
			}
		};
	}
}
