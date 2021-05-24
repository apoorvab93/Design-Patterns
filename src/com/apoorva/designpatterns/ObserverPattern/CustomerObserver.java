package com.apoorva.designpatterns.ObserverPattern;
public class CustomerObserver implements IObserver {
    String name;
    CustomerObserver(String str)
    {
        name=str;
    }

    @Override
    public void update(String message) {
        System.out.println("Customer of name: "+name+" received this "+message);
    }
}
