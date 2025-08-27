package com.example.dddspringboot.domain.model.ui;

public class DatePicker extends AbstractUIComponent {
    private final String format;
    private final String minDate;
    private final String maxDate;

    public DatePicker(String id, String label, String format, String minDate, String maxDate) {
        super(id, label);
        this.format = format;
        this.minDate = minDate;
        this.maxDate = maxDate;
    }

    public String getFormat() {
        return format;
    }

    public String getMinDate() {
        return minDate;
    }

    public String getMaxDate() {
        return maxDate;
    }

    @Override
    public String render() {
        return String.format(
            "<input type=\"date\" id=\"%s\" label=\"%s\" format=\"%s\" min=\"%s\" max=\"%s\">",
            getId(), getLabel(), format, minDate, maxDate);
    }
}
