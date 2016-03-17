package us.roff.sandbox.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateSandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateSandboxApplication.class, args);
		
		System.out.print("DONE!");
	}
}
