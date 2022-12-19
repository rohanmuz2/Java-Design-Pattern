package SimpleFactory.products;

public class NonVegBurger implements Burger{
    @Override
    public void orderBurger() {
        System.out.println("Non Veg");
    }
}
