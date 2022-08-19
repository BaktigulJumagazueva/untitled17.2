package com.company;

public class Main {
    public static void main(String[] args) {

Shape shape= new Square(4);
        System.out.println(shape.getPerimeter());
        Shape shape1= new Triangle(5,6,8);
        System.out.println(shape1.getPerimeter());
        Shape shape2= new Ball(4,3.14);
        System.out.println(shape2.getPerimeter());
        Shape shape3= new Rhombus(6,7,7,9);
        System.out.println(shape3.getPerimeter());
        Shape shape4= new Quadrilateral(8,7,6,10);
        System.out.println(shape4.getPerimeter());

    }
}