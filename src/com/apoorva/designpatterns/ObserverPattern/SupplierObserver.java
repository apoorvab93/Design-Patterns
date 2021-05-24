package com.apoorva.designpatterns.ObserverPattern;

public class SupplierObserver implements IObserver {
    String name;
    SupplierObserver(String str)
    {
        name=str;
    }

    @Override
    public void update(String message) {
        System.out.println("Supplier of name :"+name+" received this -> "+message);
    }
}
