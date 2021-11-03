package com.company.dymrin7;

public class Main {

    public static void main(String[] args) {
        System.out.println("Общая площадь состовляет " + areaCalculation());
    }

    static Figure[] getFigures() {
        return new Figure[]{
                new Circle(30),
                new Triangle(35, 40, 20),
                new Square(30, 20)
        };


    }

    private static double areaCalculation() {
        Figure[] figures = getFigures();
        return figures[0].area() + figures[1].area() + figures[2].area();
    }

}
