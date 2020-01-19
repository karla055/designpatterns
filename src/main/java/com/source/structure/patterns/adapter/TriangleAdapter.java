package com.source.structure.patterns.adapter;

public class TriangleAdapter extends Triangle implements Shape {

    public TriangleAdapter() {
        super();
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Triangle can't be resized , please create new one with required values");
    }

    @Override
    public String description() {
        return "Triangle object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}