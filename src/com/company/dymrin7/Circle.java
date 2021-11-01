package com.company.dymrin7;

public class Circle implements Figure{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }
}
