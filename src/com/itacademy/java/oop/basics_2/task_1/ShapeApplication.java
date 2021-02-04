package com.itacademy.java.oop.basics_2.task_1;

public class ShapeApplication {
    public static void main(String[] args) {
        Shape square = new Square(2);
        Shape circle = new Circle(2);
        System.out.println(square.toString());
        System.out.println(circle.toString());
    }
}
