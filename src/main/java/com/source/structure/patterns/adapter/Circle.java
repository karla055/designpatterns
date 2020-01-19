package com.source.structure.patterns.adapter;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw circle ");
    }

    @Override
    public void resize() {
        System.out.println("resize the circle");
    }

    @Override
    public String description() {
        return "Circle";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
