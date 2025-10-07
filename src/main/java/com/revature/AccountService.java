package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountService {
    private TransactionService transactionService;
    private InterestCalculator interestCalculator;

    @Autowired
    public AccountService(TransactionService transactionService, InterestCalculator interestCalculator) {
        this.transactionService = transactionService;
        this.interestCalculator = interestCalculator;
    }

    public void performAccountOperations() {
        transactionService.processTransaction();
        interestCalculator.calculateInterest();

        System.out.println("Account operations performed.");
    }

}
