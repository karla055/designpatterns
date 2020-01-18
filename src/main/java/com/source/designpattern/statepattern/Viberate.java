package com.source.designpattern.statepattern;

public class Viberate implements MobileAlertState {
    @Override
    public void alert(AlterStateContext ctx) {
        System.out.println("Vibrating  .... ... 1");
    }
}
