package com.example.dddspringboot.domain.model.account;

import lombok.Getter;

@Getter
public class UserAccount extends AbstractAccount {
    private final String firstName;
    private final String lastName;

    public UserAccount(String id, String email, String firstName, String lastName) {
        super(id, email);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
