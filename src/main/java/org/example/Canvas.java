package org.example;

// To create messages for drawn and erased random shapes

public class Canvas {

    public void drawShape() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.createShape();

        if (shape instanceof Circle circle) {
            System.out.println("The circle has been drawn."
                    + "\n--------------------------");
            System.out.println("Radius: " + circle.radius
                    + ", Diameter: " + circle.diameter);

            circle.calculateArea();
            circle.calculateCircumference();
            System.out.println("--------------------------");
            System.err.println("The circle has been erased.");
        }
        else if (shape instanceof Rectangle rectangle) {
            System.out.println("The rectangle has been drawn."
                    + "\n--------------------------");
            System.out.println("Sides: " + rectangle.sideA
                    + ", " + rectangle.sideB
                    + ", " + rectangle.sideC
                    + ", " + rectangle.sideD);

            rectangle.calculateArea();
            rectangle.calculatePerimeter();
            System.out.println("--------------------------");
            System.err.println("The rectangle has been erased.");
        }
        else if (shape instanceof Square square) {
            System.out.println("The square has been drawn."
                    + "\n--------------------------");
            System.out.println("Each side: " + square.side);

            square.calculateArea();
            square.calculatePerimeter();

            System.out.println("--------------------------");
            System.err.println("The square has been erased.");
        }
        else {
            Triangle triangle = new Triangle(10, 12, 13);
            System.out.println("The triangle has been drawn."
                    + "\n--------------------------");
            System.out.println("Sides: "
                    + triangle.sideA + ", "
                    + triangle.sideB + ", "
                    + triangle.sideC);

            triangle.calculateArea();
            triangle.calculatePerimeter();

            System.out.println("--------------------------");
            System.err.println("The triangle has been erased.");
        }
    }

    public void eraseShape() {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.createShape();

        if (shape instanceof Circle circle) {
            System.err.println("The circle has been erased.");
        } else if (shape instanceof Rectangle rectangle) {
            System.err.println("The rectangle has been erased.");
        } else if (shape instanceof Square square) {
            System.err.println("The square has been erased.");
        } else {
            System.err.println("The triangle has been erased.");
        }
    }
}
