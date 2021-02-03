package com.itacademy.java.oop.basics3;

public class ShapeApplication {
    public static void main(String[] args) {
        Square square1 = new Square(2, 3);
        Square square2 = new Square(4, 5);
        Square[] squares = {square1, square2};
        int i = 1;
        for (Square square : squares) {
            System.out.println("Square no. " + i);
            if (square.getLength() <= 0) {
                System.out.println("Length is negative! Value: " + square.getLength());
            } else if (square.getWidth() <= 0) {
                System.out.println("Width is negative! Value: " + square.getWidth());
            } else {
                System.out.println("Area: " + square.getArea() + "\nPerimeter: " + square.getPerimeter());
            }
            i++;
        }
    }
}
