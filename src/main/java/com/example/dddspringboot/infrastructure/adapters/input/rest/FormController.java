package com.example.dddspringboot.infrastructure.adapters.input.rest;

import com.example.dddspringboot.application.service.FormGeneratorService;
import com.example.dddspringboot.domain.model.ui.UIComponent;
import com.example.dddspringboot.domain.model.account.Account;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/forms")
public class FormController {
    
    private final FormGeneratorService formGeneratorService;
    
    public FormController(FormGeneratorService formGeneratorService) {
        this.formGeneratorService = formGeneratorService;
    }
    
    @GetMapping("/user-registration")
    public List<UIComponent> getUserRegistrationForm() {
        return formGeneratorService.createUserRegistrationForm();
    }
    
    @GetMapping("/business-registration")
    public List<UIComponent> getBusinessRegistrationForm() {
        return formGeneratorService.createBusinessRegistrationForm();
    }
    
    @PostMapping("/user-registration")
    public Account registerUser(@RequestParam String email, 
                              @RequestParam String firstName, 
                              @RequestParam String lastName) {
        return formGeneratorService.processUserRegistration(email, firstName, lastName);
    }
    
    @PostMapping("/business-registration")
    public Account registerBusiness(@RequestParam String email,
                                  @RequestParam String companyName,
                                  @RequestParam String taxId,
                                  @RequestParam String businessType) {
        return formGeneratorService.processBusinessRegistration(email, companyName, taxId, businessType);
    }
}
