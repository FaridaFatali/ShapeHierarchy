package org.example;

public class Shape {
    protected double area;
    protected double circumference;
    protected double perimeter;

    public Shape() {
    }

    public void draw() {
        System.out.println("The shape has been drawn.");
    }

    public void erase() {
        System.out.println("The shape has been erased.");
    }

    public double calculateArea() {
        return area;
    }

    public double calculateCircumference() {
        return circumference;
    }

    public double calculatePerimeter() {
        return perimeter;
    }

}
