package com.apoorva.designpatterns.ObserverPattern;

import java.util.ArrayList;

public class Subject implements ISubject {
    ArrayList<IObserver> listOfObservers = new ArrayList<>();
    @Override
    public void registerObserver(IObserver observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        listOfObservers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (IObserver each: listOfObservers) {
            each.update(message);
        }
    }
}
