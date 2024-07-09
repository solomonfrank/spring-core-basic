package com.example;

public class Square implements IShape {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double perimeter() {

        return 4 * this.length;
    }

    public double area() {

        return this.length * this.length;
    }

}
