package com.source.designpattern.mediator;

public class Runway implements Command {

    private IATCMediator iatcMediator;

    public Runway(IATCMediator iatcMediator) {
        this.iatcMediator = iatcMediator;
        iatcMediator.setLandingStatus(true);
    }

    @Override
    public void land() {
        System.out.println("Landing permission granted");
        iatcMediator.setLandingStatus(true);
    }
}
