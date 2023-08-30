package org.example;

public class Rectangle extends Shape {
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double sideD;

    public Rectangle(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void erase() {
        super.erase();
    }

    @Override
    public double calculateArea() {
        area = ((sideA + sideC) * (sideB + sideD)) / 4;
        System.out.println("Area of the rectangle: " + area);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = sideA + sideB + sideC + sideD;
        System.out.println("Perimeter of the rectangle: " + perimeter);
        return perimeter;
    }
}
