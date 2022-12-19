package SimpleFactory.products;

public class VegBurger implements Burger{

    @Override
    public void orderBurger() {
        System.out.println("Veg");
    }
}
