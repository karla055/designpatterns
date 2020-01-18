package com.source.designpattern.chainofresp;

public class ZeroProcessor implements Chain {

    private Chain nextInChain;
    public void setNext(Chain nextInChain) {
        this.nextInChain=nextInChain;
    }

    public void process(Number request) {
        if(request.getNumber()==0){
            System.out.println("Zero Processor "+request.getNumber());
        }else {
            nextInChain.process(request);
        }
    }
}
