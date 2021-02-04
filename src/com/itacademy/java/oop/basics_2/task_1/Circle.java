package com.itacademy.java.oop.basics_2.task_1;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + ", " +
                "perimeter=" + calculatePerimeter() + ", " +
                "area=" + calculateArea() +
                '}';
    }

    @Override
    public double calculateArea() {
        return Math.pow(Math.PI, 2) * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
