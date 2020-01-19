package com.source.structure.patterns.adapter;

public class Circle implements Shapes {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
    @Override
    public void resize() {
        System.out.println("Resizing Circle");
    }
    @Override
    public String description() {
        return "Circle object";
    }
    @Override
    public boolean isHide() {
        return false;
    }

}
