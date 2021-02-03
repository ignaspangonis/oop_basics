package com.itacademy.java.oop.basics;

public enum ContractType {
    FULL_TIME("Full-time"), PART_TIME("Part-time");

    private final String displayValue;

    public String getDisplayValue() {
        return displayValue;
    }

    ContractType(String displayValue) {
        this.displayValue = displayValue;
    }

    public static ContractType fromDisplayName(String displayValue) {
        for (ContractType type : values()) {
            if (type.displayValue.equals((displayValue))) {
                return type;
            }
        }
        throw new IllegalArgumentException(
                String.format("Contract type with display name: %s does not exist.", displayValue)
        );
    }
}
