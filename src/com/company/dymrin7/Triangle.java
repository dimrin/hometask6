package com.company.dymrin7;

public class Triangle implements Figure{
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double triangleCalculation = (a + b + c)/2.0;
        return Math.sqrt(triangleCalculation*(triangleCalculation- a)*(triangleCalculation- b)*(triangleCalculation- c));
    }
}
