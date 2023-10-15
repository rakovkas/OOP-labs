package week2;
//Create a method called drawStarsPiramid that will accept the number of rows
// as a parameter and print a half piramid shape where the number of rows
// will be dictated by the sent parameter.
// ex. drawStarsPiramid(5);
// *
// **
// ***
// ****
// *****
// How to print the inverted half piramid shape as shown in the image below?
// ****
// ***
// **
// *

public class ex8 {
    public static void drawStarsPiramid (int rows){
        for (int i = 1; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void drawStarsInvertedPiramd (int rows){
        for (int i = rows; i>=1; i--){
            for (int j = i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        drawStarsPiramid(5);
        System.out.println();
        drawStarsPiramid(10);
        System.out.println();
        drawStarsInvertedPiramd(10);
    }
}
