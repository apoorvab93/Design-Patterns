package com.apoorva.designpatterns.ObserverPattern;

public class Main {

    public static void main(String[] args) {
        Subject mollyMoonNotifications = new Subject();

        CustomerObserver apoorva = new CustomerObserver("apoorva");
        CustomerObserver akshay = new CustomerObserver("akshay");

        SupplierObserver iceCreamConeSupplier = new SupplierObserver("SweetConeCompany");

        mollyMoonNotifications.registerObserver(apoorva);
        mollyMoonNotifications.registerObserver(akshay);
        mollyMoonNotifications.registerObserver(iceCreamConeSupplier);


        mollyMoonNotifications.notifyObservers("Free Icecream for all");

    }
}
