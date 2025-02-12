package dhc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DhcRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DhcRestApiApplication.class, args);
		System.out.println("High Court Of Delhi");
	}

}
