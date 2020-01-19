package com.source.structure.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    List<Shapes> shapes = new ArrayList<Shapes>();
    public Drawing() {
        super();
    }
    public void addShape(Shapes shape) {
        shapes.add(shape);
    }
    public List<Shapes> getShapes() {
        return new ArrayList<Shapes>(shapes);
    }
    public void draw() {
        if (shapes.isEmpty()) {
            System.out.println("Nothing to draw!");
        } else {
            shapes.stream().forEach(shape -> shape.draw());
        }
    }
    public void resize() {
        if (shapes.isEmpty()) {
            System.out.println("Nothing to resize!");
        } else {
            shapes.stream().forEach(shape -> shape.resize());
        }
    }
}
