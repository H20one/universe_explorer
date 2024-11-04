package com.h20one.universe_explorer;



import com.h20one.universe_explorer.command.CommandProcessor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UniverseExplorerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniverseExplorerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ApplicationContext context) {
		return args -> {
			CommandProcessor commandProcessor = context.getBean(CommandProcessor.class);
			commandProcessor.start();
		};
	}
}