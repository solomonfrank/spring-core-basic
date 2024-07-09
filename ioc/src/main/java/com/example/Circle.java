package com.example;

public class Circle implements IShape {
    private double radius;

    private String creator;
    private Address address;

    public String getCreator() {

        return this.creator;
    }

    public void setAddress(Address location) {
        this.address = location;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Circle(double radius) {
        this.radius = radius;

    }

    public double area() {
        return Math.PI * radius;
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'perimeter'");
    }

}
