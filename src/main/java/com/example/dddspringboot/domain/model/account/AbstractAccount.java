package com.example.dddspringboot.domain.model.account;

public abstract class AbstractAccount implements Account {
    private final String id;
    private final String email;
    private boolean active;

    protected AbstractAccount(String id, String email) {
        this.id = id;
        this.email = email;
        this.active = false;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public void activate() {
        this.active = true;
    }

    @Override
    public void deactivate() {
        this.active = false;
    }
}
