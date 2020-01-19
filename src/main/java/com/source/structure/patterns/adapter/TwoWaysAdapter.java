package com.source.structure.patterns.adapter;

public class TwoWaysAdapter implements Shape,GeometricShape {

    private ShapeType shapeType;

    public TwoWaysAdapter() {
        this(ShapeType.TRIANGLE);
    }

    public TwoWaysAdapter(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        switch (shapeType) {
            case CIRCLE:
            case RECTAGLE:
                return 0.0d;
            case TRIANGLE:
                return new Triangle().perimeter();
            case RHOMBUS:
                return new Rhombus().perimeter();
        }
        return 0.0d;
    }

    @Override
    public void drawShape() {
        draw();
    }

    @Override
    public void draw() {
        switch (shapeType){
            case CIRCLE:
                new Circle().draw();
                break;
            case RHOMBUS:
                new Rhombus().drawShape();
                break;
            case RECTAGLE:
                new Rectangle().draw();
                break;
            case TRIANGLE:
                 new Triangle().drawShape();
                 break;
        }
    }

    @Override
    public void resize() {
        switch (shapeType){
            case TRIANGLE:
                System.out.println("Triangle can not be resized . Please create new one with required values ");
                break;
            case RECTAGLE:
                new Rectangle().resize();
                break;
            case RHOMBUS:
                System.out.println("Rhombus can not be resized, please create new one with required parameters");
                break;
            case CIRCLE:
                new Circle().resize();
                break;
        }
    }

    @Override
    public String description() {
        switch (shapeType){
            case CIRCLE:
            return new Circle().description();
            case RHOMBUS:
            return "Rhombus object";
            case RECTAGLE:
            return new Rectangle().description();
            case TRIANGLE:
            return "Triangle object";
        }
        return "Unknown object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
