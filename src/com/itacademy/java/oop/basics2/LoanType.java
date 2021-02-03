package com.itacademy.java.oop.basics2;

public enum LoanType {
    LEASING("Leasing"), CONSUMER("Consumer");

    private String displayValue;

    public String getDisplayValue() {
        return displayValue;
    }

    LoanType(String displayValue) {
        this.displayValue = displayValue;
    }

    public static LoanType fromDisplayName(String displayValue) {
        for (LoanType type : values()) {
            if (type.displayValue.equals((displayValue))) {
                return type;
            }
        }
        throw new IllegalArgumentException(
                String.format("Loan type with display name: %s does not exist.", displayValue)
        );
    }
}
