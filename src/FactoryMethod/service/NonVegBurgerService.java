package FactoryMethod.service;

import FactoryMethod.factory.BurgerFactory;
import FactoryMethod.products.Burger;
import FactoryMethod.products.NonVegBurger;

public class NonVegBurgerService extends BurgerFactory {

    @Override
    public Burger createBurger() {
        return new NonVegBurger();
    }
}
