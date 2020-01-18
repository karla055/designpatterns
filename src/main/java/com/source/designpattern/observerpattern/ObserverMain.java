package com.source.designpattern.observerpattern;

public class ObserverMain {
    public static void main(String[] args) {
        AverageScoreDisplay averageScoreDisplay =  new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay =  new CurrentScoreDisplay();
        CricketData cricketData = new CricketData(currentScoreDisplay,averageScoreDisplay);
        cricketData.dataChanged();

    }

}
