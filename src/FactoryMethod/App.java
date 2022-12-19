package FactoryMethod;

import FactoryMethod.service.NonVegBurgerService;
import FactoryMethod.service.VegBurgerService;

public class App {

    public static void main(String[] args) {
        NonVegBurgerService nonVegBurgerService = new NonVegBurgerService();
        nonVegBurgerService.createBurger().createBurger();

        VegBurgerService vegBurgerService = new VegBurgerService();
        vegBurgerService.createBurger().createBurger();
    }
}
