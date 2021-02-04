package com.itacademy.java.oop.basics_2.task_1;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side + ", " +
                "perimeter=" + calculatePerimeter() + ", " +
                "area=" + calculateArea() +
                '}';
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}
