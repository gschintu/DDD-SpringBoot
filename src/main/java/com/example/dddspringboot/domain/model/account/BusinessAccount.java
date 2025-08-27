package com.example.dddspringboot.domain.model.account;

import lombok.Getter;

@Getter
public class BusinessAccount extends AbstractAccount {
    private final String companyName;
    private final String taxId;
    private final String businessType;

    public BusinessAccount(String id, String email, String companyName, String taxId, String businessType) {
        super(id, email);
        this.companyName = companyName;
        this.taxId = taxId;
        this.businessType = businessType;
    }
}
