package week13.task6;

public class LatteBuilder implements CoffeeBuilder{
    private Coffee coffee;
    public LatteBuilder (){
        this.coffee = new Coffee();
    }

    @Override
    public void buildType() {
        coffee.setType("Latte");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Large");
    }

    @Override
    public void buildToppings() {
        coffee.addTopping("Caramel");
    }

    @Override
    public Coffee getResult() {
        return coffee;
    }
}
