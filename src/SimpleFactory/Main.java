package SimpleFactory;

import SimpleFactory.factory.SimpleBurgerFactory;

public class Main {

    public static void main(String args[]){

        SimpleBurgerFactory.createBurger("veg").orderBurger();
        SimpleBurgerFactory.createBurger("nonVeg").orderBurger();
    }

}