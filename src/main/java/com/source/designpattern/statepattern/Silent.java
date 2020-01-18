package com.source.designpattern.statepattern;

public class Silent implements MobileAlertState {
    @Override
    public void alert(AlterStateContext ctx) {
        System.out.println("Silent  .....");
    }
}
