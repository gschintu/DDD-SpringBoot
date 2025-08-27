package com.example.dddspringboot.domain.model.ui;

import java.util.List;

public class ComboBox extends AbstractUIComponent {
    private final List<String> options;
    private final String selectedValue;

    public ComboBox(String id, String label, List<String> options, String selectedValue) {
        super(id, label);
        this.options = options;
        this.selectedValue = selectedValue;
    }

    public List<String> getOptions() {
        return options;
    }

    public String getSelectedValue() {
        return selectedValue;
    }

    @Override
    public String render() {
        StringBuilder sb = new StringBuilder()
            .append(String.format("<select id=\"%s\" label=\"%s\">", getId(), getLabel()));
        
        for (String option : options) {
            sb.append(String.format("<option value=\"%s\" %s>%s</option>",
                    option,
                    option.equals(selectedValue) ? "selected" : "",
                    option));
        }
        
        return sb.append("</select>").toString();
    }
}
