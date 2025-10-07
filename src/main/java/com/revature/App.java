package com.revature;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Classes: AccountService, TransactionService, InterestCalculator
 * Spring injects TransactionService and InterestCalculator into AccountService.
 * Spring manages all these dependencies.
 *
 * 
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AccountService accountService = context.getBean(AccountService.class);
        accountService.performAccountOperations();

        context.close();
    }
}
