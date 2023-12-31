package week13.task6;

public class CappuccinoBuilder implements CoffeeBuilder{
    private Coffee coffee;
    public CappuccinoBuilder(){
        this.coffee = new Coffee();
    }

    @Override
    public void buildType() {
        coffee.setType("Cappuccino");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Medium");
    }

    @Override
    public void buildToppings() {
        coffee.addTopping("Chocolate");
    }

    @Override
    public Coffee getResult() {
        return coffee;
    }
}
