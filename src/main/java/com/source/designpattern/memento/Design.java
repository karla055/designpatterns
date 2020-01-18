package com.source.designpattern.memento;

import com.source.designpattern.commandpattern.Light;

import java.util.ArrayList;
import java.util.List;

public class Design {
    public static void main(String[] args) {
        List<Life.Memento> mementoList =  new ArrayList<Life.Memento>();
        Life life = new Life();
        life.set("1000 B.C");
        mementoList.add(life.saveToMemento());
        life.set("1000 A.D");
        mementoList.add(life.saveToMemento());
        life.set("2000 A.D");
        mementoList.add(life.saveToMemento());
        life.set("4000 A.D");

        life.restoreFromMemnto(mementoList.get(0));
    }
}
