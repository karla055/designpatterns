package com.source.designpattern.chainofresp;

public class ObserverMain {
    public static void main(String[] args) {
        Chain chainNegative =  new NegativeProcessor();
        Chain chainZero = new ZeroProcessor();
        Chain chainPositive  =   new PositiveProcess();
        chainNegative.setNext(chainZero);
        chainZero.setNext(chainPositive);
        chainNegative.process(new Number(10));
        chainNegative.process(new Number(-50));
        chainNegative.process(new Number(0));
        chainNegative.process(new Number(91));
    }
}
