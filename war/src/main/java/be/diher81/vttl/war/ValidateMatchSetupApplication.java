package be.diher81.vttl.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "be.diher81.vttl")
public class ValidateMatchSetupApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidateMatchSetupApplication.class, args);
	}
}
