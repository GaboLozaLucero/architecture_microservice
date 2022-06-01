package project.backend.mssales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsSalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSalesApplication.class, args);
	}

}
