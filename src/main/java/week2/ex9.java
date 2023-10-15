package week2;
//Modify the previously created starts piramid in a way that now you are not
// printing the starts but in each row numbers from 1 to the current row count.

public class ex9 {
    public static void drawNumberPiramid (int rows){
        for (int i = 1; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
    public static void drawPiramdWithSameNumberInRow (int rows){
        for (int i = 1; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+"");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        drawNumberPiramid(5);
        System.out.println();
        drawNumberPiramid(10);
        System.out.println();
        drawPiramdWithSameNumberInRow(10);
    }
}
