package com.source.structure.patterns.adapter;

public class Rectangle implements Shapes{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
    @Override
    public void resize() {
        System.out.println("Resizing Rectangle");
    }
    @Override
    public String description() {
        return "Rectangle object";
    }
    @Override
    public boolean isHide() {
        return false;
    }
}
