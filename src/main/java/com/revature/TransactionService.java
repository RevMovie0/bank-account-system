package com.revature;

import org.springframework.stereotype.Component;

@Component
public class TransactionService {
    public void processTransaction() {
        System.out.println("Processing transaction...");
    }
}
