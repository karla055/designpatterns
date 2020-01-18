package com.source.designpattern.observerpattern;

public class AverageScoreDisplay {

    private float runRate;
    private int predicateScore;

    public void update(int runs,int wickets,float overs){
        this.runRate =(float)runs/overs;
        this.predicateScore=(int)(this.runRate*50);
        display();
    }
     public void display(){
         System.out.println("\n Average Score Display :\n"+"Run Rate"+runRate+"\n Predicted Score "+predicateScore);
     }
}
