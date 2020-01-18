package com.source.designpattern.template;

public class TemplatepatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        game =  new FootBall();
        game.play();
    }
}
