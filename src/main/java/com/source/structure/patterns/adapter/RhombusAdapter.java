package com.source.structure.patterns.adapter;

public class RhombusAdapter extends Rhombus implements Shape {
    public RhombusAdapter() {
        super();
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Rhombus can't be resize , Please create new one with required values ");
    }

    @Override
    public String description() {
        return "Rhombus object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
