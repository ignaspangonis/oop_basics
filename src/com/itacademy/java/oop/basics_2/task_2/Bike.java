package com.itacademy.java.oop.basics_2.task_2;

public enum Bike {
    MOUNTAIN("Mountain"), ROAD("Road");

    private final String displayValue;

    Bike(String displayValue) {
        this.displayValue = displayValue;
    }

    public static Bike fromDisplayName(String displayValue) {
        for (Bike type : values()) {
            if (type.displayValue.equals((displayValue))) {
                return type;
            }
        }
        throw new IllegalArgumentException(
                String.format("Bike type with display name: %s does not exist.", displayValue)
        );
    }
}
