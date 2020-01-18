package com.source.designpattern.mediator;

public class MediatorDesignPattern {

    public static void main(String[] args) {
        IATCMediator iatcMediator =  new ATCMediator();
        Flight flight = new Flight(iatcMediator);
        Runway runway = new Runway(iatcMediator);
        iatcMediator.registerFlight(flight);
        iatcMediator.registerRunway(runway);
        flight.getReady();
        runway.land();
        flight.land();
    }
}
