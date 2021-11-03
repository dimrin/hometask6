package com.company.dymrin7;

public class Square implements Figure{
    private final double firstSide;
    private final double secondSide;

    public Square(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double area() {
        return firstSide*secondSide;
    }
}
