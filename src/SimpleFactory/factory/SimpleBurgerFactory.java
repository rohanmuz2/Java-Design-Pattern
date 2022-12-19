package SimpleFactory.factory;

import SimpleFactory.products.Burger;
import SimpleFactory.products.NonVegBurger;
import SimpleFactory.products.VegBurger;

public class SimpleBurgerFactory {

    private SimpleBurgerFactory(){

    }

    public static Burger createBurger(String type){
        Burger burger;
        switch (type){
            case "veg":
                burger = new VegBurger();
                break;
            case "nonVeg":
                burger = new NonVegBurger();
                break;
            default:
                burger = null;
        }

        return burger;
    }
}
