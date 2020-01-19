package com.source.structure.patterns.adapter;

import java.util.ArrayList;
import java.util.List;


public class Drawing  {

    List<Shape> shapeList =  new ArrayList<>();

    public Drawing() {
        super();
    }

    public void addShape(Shape shape){
        shapeList.add(shape);
    }

    public List<Shape> getShapes(){
        return new ArrayList<Shape>(shapeList);
    }

    public void draw(){
        if(shapeList.isEmpty()){
            System.out.println("Nothing to draw");
        }else{
            shapeList.stream().forEach(shape -> shape.draw());
        }
    }

    public void resize(){
        if (shapeList.isEmpty()){
            System.out.println("Nothing to resize");
        }else {
            shapeList.stream().forEach(shape -> shape.resize());

        }
    }
}
