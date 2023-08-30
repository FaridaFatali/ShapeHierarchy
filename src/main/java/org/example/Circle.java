package org.example;

public class Circle extends Shape {
    protected double radius;
    protected double diameter;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
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
        area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
        return area;
    }

    @Override
    public double calculateCircumference() {
        circumference = diameter * Math.PI;
        System.out.println("Circumference of the circle: " + circumference);
        return circumference;
    }
}
