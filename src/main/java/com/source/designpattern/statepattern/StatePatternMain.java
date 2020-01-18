package com.source.designpattern.statepattern;

public class StatePatternMain {
    public static void main(String[] args) {
        AlterStateContext alterStateContext = new AlterStateContext();
        alterStateContext.alert();
        alterStateContext.alert();
        alterStateContext.setState(new Silent());
        alterStateContext.alert();
        alterStateContext.alert();
        alterStateContext.alert();
    }
}
