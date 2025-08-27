package com.example.dddspringboot.domain.model.ui;

import java.util.List;

public class UIComponentFactory {
    
    public static UIComponent createInputBox(String id, String label, String placeholder, String type) {
        return new InputBox(id, label, placeholder, type);
    }
    
    public static UIComponent createComboBox(String id, String label, List<String> options, String selectedValue) {
        return new ComboBox(id, label, options, selectedValue);
    }
    
    public static UIComponent createDatePicker(String id, String label, String format, String minDate, String maxDate) {
        return new DatePicker(id, label, format, minDate, maxDate);
    }
    
    // You can add more factory methods for other UI components
}
