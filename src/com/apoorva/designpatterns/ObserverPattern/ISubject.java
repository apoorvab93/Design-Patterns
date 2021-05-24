package com.apoorva.designpatterns.ObserverPattern;
public interface ISubject {
    public void registerObserver(IObserver observer);

    public void removeObserver(IObserver observer);

    public void notifyObservers(String message);
}
