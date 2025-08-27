package com.example.dddspringboot.domain.model.account;

public interface Account {
    String getId();
    String getEmail();
    boolean isActive();
    void activate();
    void deactivate();
}
