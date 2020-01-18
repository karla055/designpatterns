package com.source.designpattern.mediator;

public class Flight implements Command {

    private IATCMediator iatcMediator;

    public Flight(IATCMediator iatcMediator) {
        this.iatcMediator = iatcMediator;
    }

    @Override
    public void land() {
        if(iatcMediator.isLandingOk()){
            System.out.println("Successful Landing" );
            iatcMediator.setLandingStatus(true);
        }else {
            System.out.println("Waiting for landing");
        }
    }

    public  void getReady(){
        System.out.println("Ready for landing");
    }
}
