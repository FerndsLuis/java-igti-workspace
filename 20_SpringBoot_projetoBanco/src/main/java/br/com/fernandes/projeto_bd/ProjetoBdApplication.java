package br.com.fernandes.projeto_bd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ProjetoBdApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoBdApplication.class, args);
	}

}
