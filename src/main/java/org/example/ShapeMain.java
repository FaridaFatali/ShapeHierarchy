package org.example;

/**
 * @author Farida Fatali
 * Practice about Polymorphism, hierarcy and instanceof operator in Java
 */

public class ShapeMain {
    public static void main(String[] args) {

        // To understand polymorphism
//        ShapeFactory factory = new ShapeFactory();
//        Shape shape = factory.createShape();
//
//        System.out.println("--------------------------");
//        System.out.println(shape.calculateArea());
//        System.out.println(shape.calculatePerimeter());
//        System.out.println(shape.calculateCircumference());

        // To understand relation among the classes, drawing random shape
        Canvas canvas = new Canvas();
        canvas.drawShape();

        // To erase random shape
//        System.out.println("--------------------------");
//        canvas.eraseShape();

    }
}