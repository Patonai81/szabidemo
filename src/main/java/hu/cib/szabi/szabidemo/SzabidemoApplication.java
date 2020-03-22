package hu.cib.szabi.szabidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


/**
 * 1 - Adding devtools to your project
 * <dependency>
 *     <groupId>org.springframework.boot</groupId>
 *     <artifactId>spring-boot-devtools</artifactId>
 * </dependency>
 *
 * 2- Enabling automatic build
 * Open the Settings --> Build-Execution-Deployment --> Compiler and enable :
 *
 *
 * Build Project Automatically.
 * 3- Update the value of compiler.automake.allow.when.app.running
 * press ctrl+shift+A and search for the registry. In the registry, enable :
 *
 * compiler.automake.allow.when.app.running
 *
 */

@EnableAutoConfiguration
public class SzabidemoApplication {



	public static void main(String[] args) {

		SpringApplication.run(SzabidemoApplication.class, args);
	}

}
