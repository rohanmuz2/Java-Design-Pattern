package FactoryMethod.service;

import FactoryMethod.factory.BurgerFactory;
import FactoryMethod.products.Burger;
import FactoryMethod.products.VegBurger;

public class VegBurgerService extends BurgerFactory {
    @Override
    public Burger createBurger() {
        return new VegBurger();
    }
}
