package com.source.designpattern.commandpattern;

public class LightOnCommand implements  Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        System.out.println("lights on");
        light.switchOn();

    }
}
