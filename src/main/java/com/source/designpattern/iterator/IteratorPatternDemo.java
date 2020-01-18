package com.source.designpattern.iterator;

public class IteratorPatternDemo {


    public static void main(String[] args) {
    NameRepository nameRepository =new NameRepository();
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
            String naem = (String)iterator.next();
            System.out.println("Name is     "+naem);
        }
    }
}
