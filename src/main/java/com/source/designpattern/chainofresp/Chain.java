package com.source.designpattern.chainofresp;

public interface Chain {
    public void setNext(Chain nextInChain);
    public void process(Number request);
}
