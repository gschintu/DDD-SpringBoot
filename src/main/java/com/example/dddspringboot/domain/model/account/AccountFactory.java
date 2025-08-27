package com.example.dddspringboot.domain.model.account;

import java.util.UUID;

public class AccountFactory {
    
    public static Account createUserAccount(String email, String firstName, String lastName) {
        return new UserAccount(
            UUID.randomUUID().toString(),
            email,
            firstName,
            lastName
        );
    }
    
    public static Account createBusinessAccount(String email, String companyName, String taxId, String businessType) {
        return new BusinessAccount(
            UUID.randomUUID().toString(),
            email,
            companyName,
            taxId,
            businessType
        );
    }
    
    // You can add more factory methods for other account types
}
