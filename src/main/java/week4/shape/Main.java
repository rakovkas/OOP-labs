package week4.shape;

public class Main {
    public static void main (String[] args){
        Circle circle = new Circle("red", FillType.FILLED, 2);
        Rectangle rectangle = new Rectangle("blue", FillType.NOT_FILLED, 3, 4);

        circle.displayInfo();
        rectangle.displayInfo();

    }

}
