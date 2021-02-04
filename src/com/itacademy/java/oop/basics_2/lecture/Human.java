package com.itacademy.java.oop.basics_2.lecture;

public interface Human {

    int years = 100;

    void walk();
    void fly();
    void drive();

    default int eat(int foodCount) {
        return foodCount * 10;
    } // default metodai nurodo default kodą, jei nėra implementacijos
}
