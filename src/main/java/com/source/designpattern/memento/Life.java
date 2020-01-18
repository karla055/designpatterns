package com.source.designpattern.memento;

public class Life {

    private String time;
    public void set(String time){
        System.out.println("Setting time to  "+time);
        this.time =  time;

    }

    public Memento saveToMemento(){
        System.out.println("Save time to memento");
        return  new Memento(time);
    }

    public void restoreFromMemnto(Memento memento){
        time =  memento.getSavedTime();
        System.out.println("Time Restored from Memento "+time);
    }

    public static class Memento{
        private final String time;

        public Memento(String time) {
            this.time = time;
        }

        public String getSavedTime(){
            return  time;
        }
    }
}
