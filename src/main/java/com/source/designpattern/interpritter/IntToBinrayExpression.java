package com.source.designpattern.interpritter;

public class IntToBinrayExpression implements Expression {
    private int i;

    public IntToBinrayExpression(int i) {
        this.i = i;
    }


    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getBinaryFormat(this.i);
    }
}
