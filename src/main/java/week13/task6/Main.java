package week13.task6;

public class Main {
    public static void main(String[] args){
        CoffeeDirector director = new CoffeeDirector();

        EspressoBuilder espressoBuilder = new EspressoBuilder();
        director.constructCoffee(espressoBuilder);
        Coffee espresso = espressoBuilder.getResult();
        System.out.println("Espresso Order: " + espresso);

        LatteBuilder latteBuilder = new LatteBuilder();
        director.constructCoffee(latteBuilder);
        Coffee latte = latteBuilder.getResult();
        System.out.println("Latte Order: " + latte);


        CappuccinoBuilder cappuccinoBuilder = new CappuccinoBuilder();
        director.constructCoffee(cappuccinoBuilder);
        Coffee cappuccino = cappuccinoBuilder.getResult();
        System.out.println("Cappuccino Order: " + cappuccino);
    }
}
