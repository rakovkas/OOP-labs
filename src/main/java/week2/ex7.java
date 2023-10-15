package week2;
//Create a method printStars that prints the given amount of stars and a line break.
public class ex7 {
    private static void printStars(int amount){
        for (int i = 0; i<amount; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main (String[] args){
        printStars(5);
        printStars(3);
        printStars(9);
    }
}
