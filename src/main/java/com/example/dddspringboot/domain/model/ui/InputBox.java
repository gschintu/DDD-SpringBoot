package com.example.dddspringboot.domain.model.ui;

public class InputBox extends AbstractUIComponent {
    private final String placeholder;
    private final String type;  // text, password, email, etc.

    public InputBox(String id, String label, String placeholder, String type) {
        super(id, label);
        this.placeholder = placeholder;
        this.type = type;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public String getType() {
        return type;
    }

    @Override
    public String render() {
        return String.format("<input type=\"%s\" id=\"%s\" placeholder=\"%s\" label=\"%s\">",
                type, getId(), placeholder, getLabel());
    }
}
