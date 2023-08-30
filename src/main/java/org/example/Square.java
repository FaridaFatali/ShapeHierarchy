package org.example;

public class Square extends Shape {
    protected double side;

    public Square(double side) {
        this.side = side;
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
        area = Math.pow(side, 2);
        System.out.println("The area of the square: " +  area);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        perimeter = 4 * side;
        System.out.println("Perimeter of the square: " + perimeter);
        return perimeter;
    }
}
