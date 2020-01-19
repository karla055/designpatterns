package com.source.structure.patterns.adapter;

public class Triangle implements GeometricShape {

    private final double a;
    private final double b;
    private final double c;


    public Triangle() {
        this(1.0d,1.0d,1.0d);
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        //Hero's Formula
        //Area  = (Squareroot(s*(s-a)*(s-b)*(s-c))
        //where s=(a+b+c)/2 or 1/2 of the perimeter of the triangle
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing Trinalge with area :"+area()+" and perimeter"+perimeter());
    }
}
