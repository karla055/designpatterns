package com.source.designpattern.interpritter;

public class InterPriterClient {

    public InterpreterContext interpreterContext;

    public InterPriterClient(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }

    public String interpret(String string){
        Expression expression = null;
        if(string.contains("Hexadecimal")){
            expression =  new IntToHexaExpression(Integer.parseInt(string.substring(0,string.indexOf(" "))));
        }else if (string.contains("Binary")){
            expression =  new IntToBinrayExpression(Integer.parseInt(string.substring(0,string.indexOf(" "))));
        }else{
            return string;
        }

        return expression.interpret(interpreterContext);

    }

    public static void main(String[] args) {

        String stringOne = "28 in Binary";
        String stringTwo = "28 in Hexadecimal" ;
        InterPriterClient interPriterClient =  new InterPriterClient(new InterpreterContext());
        System.out.println(stringOne+"="+interPriterClient.interpret(stringOne));
        System.out.println(stringTwo+"="+interPriterClient.interpret(stringTwo));

    }
}
