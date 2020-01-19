package com.source.structure.patterns.adapter;

public class GeometricShapeObjectAdapter implements Shape {

    private GeometricShape geometricShape;

    public GeometricShapeObjectAdapter(GeometricShape geometricShape) {
        super();
        this.geometricShape = geometricShape;
    }

    @Override
    public void draw() {
    geometricShape.drawShape();
    }

    @Override
    public void resize() {
        System.out.println(description()+"cant't be resized . Please create new one with required values.");
    }



    @Override
    public String description() {
        if(geometricShape instanceof  Triangle){
            return  "Trinagle Object";
        }else  if(geometricShape instanceof  Rhombus){
            return "Rhombus onject";
        }else{
            return "Unknown object";
        }

    }

    @Override
    public boolean isHide() {
        return false;
    }
}
