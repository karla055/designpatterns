package com.source.structure.patterns.adapter;


public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing rectable");
    }

    @Override
    public void resize() {
        System.out.println("resize rectable ");
    }

    @Override
    public String description() {
        return "rectable description";
    }


    @Override
    public boolean isHide() {
        return false;
    }
}
