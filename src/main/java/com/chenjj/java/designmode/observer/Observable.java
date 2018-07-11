package com.chenjj.java.designmode.observer;

import java.util.Vector;

public class Observable implements Subject{

    Vector<Observer> vector = new Vector<Observer>();

    public void registerObserver(Observer o) {
        vector.add(o);
    }

    public void removeObserver(Observer o) {
        vector.remove(o);
    }

    public void notifyObserver(String message) {
        for (Observer o: vector) {
            o.update(this,message);
        }
    }
}
