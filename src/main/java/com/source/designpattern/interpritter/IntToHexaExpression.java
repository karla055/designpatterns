package com.source.designpattern.interpritter;

public class IntToHexaExpression implements Expression {

    private int i;

    public IntToHexaExpression(int i) {
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getHexadecimalFormat(this.i);
    }
}
