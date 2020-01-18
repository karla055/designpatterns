package com.source.designpattern.commandpattern;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        System.out.println("Lights Off");
        light.switchOff();
    }
}
