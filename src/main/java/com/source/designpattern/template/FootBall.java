package com.source.designpattern.template;

public class FootBall extends Game {
    @Override
    void initialize() {
        System.out.println("FootBall Game Started, Enjoy  the game !");
    }

    @Override
    void startPlay() {
        System.out.println("FootBall game Started . Enjoy the game");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
