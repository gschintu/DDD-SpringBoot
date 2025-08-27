package com.example.dddspringboot.domain.model.ui;

public abstract class AbstractUIComponent implements UIComponent {
    private final String id;
    private final String label;
    
    protected AbstractUIComponent(String id, String label) {
        this.id = id;
        this.label = label;
    }
    
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public String getLabel() {
        return label;
    }
    
    @Override
    public abstract String render();
}
