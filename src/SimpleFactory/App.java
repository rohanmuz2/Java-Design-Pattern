package SimpleFactory;

import SimpleFactory.factory.SimpleBurgerFactory;

public class App {

    public static void main(String args[]){

        SimpleBurgerFactory.createBurger("veg").orderBurger();
        SimpleBurgerFactory.createBurger("nonVeg").orderBurger();
    }

}