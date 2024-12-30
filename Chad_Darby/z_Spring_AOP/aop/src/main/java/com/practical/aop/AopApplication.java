package com.practical.aop;

import com.practical.aop.dao.AccountDAO;
import com.practical.aop.dao.MembershipDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO, MembershipDAO membershipDAO){
		return args1 -> {

			theBeforeAdvice(accountDAO , membershipDAO);
		};
	}

	private void theBeforeAdvice(AccountDAO theAccountDAO ,MembershipDAO theMembershipDAO) {

		Account account = new Account("ahamed","level(9)");
		theAccountDAO.addAccount(account);

		theMembershipDAO.addSillyMember();
	}



}
