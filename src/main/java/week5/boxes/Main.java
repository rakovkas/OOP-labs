package week5.boxes;

public class Main {
    public static void main (String[] args){
        /*
        MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(new Thing("Saludo", 5));
        coffeeBox.add(new Thing("Pirkka", 5));
        coffeeBox.add(new Thing("Kopi Luwak", 5));
        System.out.println(coffeeBox.isInTheBox(new Thing("Saludo")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Pirkka")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak")));
        */

        /*
        OneThingBox box = new OneThingBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));
        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));

         */
        /*
        BlackHoleBox box = new BlackHoleBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));
        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));

         */

        //UPCASTING

        Box upBox = new MaxWeightBox(10);

        upBox.add(new Thing("MIX",5));
        upBox.add(new Thing("White", 5));

        //DOWNCASTING

        if (upBox instanceof MaxWeightBox){
            MaxWeightBox maxWeightBox = (MaxWeightBox) upBox;
            System.out.println(maxWeightBox.isInTheBox(new Thing("MIX")));
            System.out.println(maxWeightBox.isInTheBox(new Thing("White")));
        }

        Box box = new OneThingBox();
        box.add(new Thing("Black", 5));

        if (box instanceof OneThingBox){
            OneThingBox oneThingBox = (OneThingBox) box;
            System.out.println(oneThingBox.isInTheBox(new Thing("Black")));
            System.out.println(oneThingBox.isInTheBox(new Thing("BW")));
        }

        Box blackHoleBox = new BlackHoleBox();
        blackHoleBox.add(new Thing("Black",5));

        if (blackHoleBox instanceof BlackHoleBox){
            BlackHoleBox bhBox = (BlackHoleBox) blackHoleBox;
            System.out.println(bhBox.isInTheBox(new Thing("Black")));
            System.out.println(bhBox.isInTheBox(new Thing("White")));
        }

    }
}
