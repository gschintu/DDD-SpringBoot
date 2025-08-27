package com.example.dddspringboot.application.service;

import com.example.dddspringboot.domain.model.ui.UIComponent;
import com.example.dddspringboot.domain.model.ui.UIComponentFactory;
import com.example.dddspringboot.domain.model.account.Account;
import com.example.dddspringboot.domain.model.account.AccountFactory;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class FormGeneratorService {
    
    public List<UIComponent> createUserRegistrationForm() {
        return Arrays.asList(
            UIComponentFactory.createInputBox("firstName", "First Name", "Enter your first name", "text"),
            UIComponentFactory.createInputBox("lastName", "Last Name", "Enter your last name", "text"),
            UIComponentFactory.createInputBox("email", "Email", "Enter your email", "email"),
            UIComponentFactory.createDatePicker("dob", "Date of Birth", "YYYY-MM-DD", "1900-01-01", "2023-12-31")
        );
    }
    
    public List<UIComponent> createBusinessRegistrationForm() {
        return Arrays.asList(
            UIComponentFactory.createInputBox("companyName", "Company Name", "Enter company name", "text"),
            UIComponentFactory.createInputBox("email", "Business Email", "Enter business email", "email"),
            UIComponentFactory.createInputBox("taxId", "Tax ID", "Enter tax ID", "text"),
            UIComponentFactory.createComboBox("businessType", "Business Type", 
                Arrays.asList("LLC", "Corporation", "Partnership", "Sole Proprietorship"), "LLC")
        );
    }
    
    public Account processUserRegistration(String email, String firstName, String lastName) {
        Account account = AccountFactory.createUserAccount(email, firstName, lastName);
        account.activate();
        return account;
    }
    
    public Account processBusinessRegistration(String email, String companyName, String taxId, String businessType) {
        Account account = AccountFactory.createBusinessAccount(email, companyName, taxId, businessType);
        account.activate();
        return account;
    }
}
