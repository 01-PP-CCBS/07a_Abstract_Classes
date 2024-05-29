package com.cc.java;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(radius, 2);
    }
    



}
