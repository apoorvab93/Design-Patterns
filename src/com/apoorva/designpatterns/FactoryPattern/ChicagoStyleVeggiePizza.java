package com.apoorva.designpatterns.FactoryPattern;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese and Assorted Veggies");
    }
    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}