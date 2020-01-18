package com.source.designpattern.template;

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket game Initialized! Start Playing");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game started Enjoy the game");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket game finished");
    }
}
