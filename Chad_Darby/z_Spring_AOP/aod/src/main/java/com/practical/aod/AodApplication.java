package com.practical.aod;

import com.practical.aod.dao.AccountDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AodApplication {

	public static void main(String[] args) {
		SpringApplication.run(AodApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO){
		return args1 -> {

			theBeforeAdvice(accountDAO);
		};
	}

	private void theBeforeAdvice(AccountDAO theAccountDAO) {

		theAccountDAO.addAccount();
	}



}
