package FactoryMethod.products;

public class NonVegBurger implements Burger{
    @Override
    public void createBurger() {
        System.out.println("Non Veg");
    }
}
