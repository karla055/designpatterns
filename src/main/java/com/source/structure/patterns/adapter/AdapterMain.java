package com.source.structure.patterns.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        System.out.println("Creating draw of shapes ...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        System.out.println("drawing ....");
        drawing.draw();
        System.out.println("Resize ......");
        drawing.resize();
    }
}
