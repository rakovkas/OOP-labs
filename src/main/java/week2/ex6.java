package week2;

import java.util.Scanner;

//Create a method printText that prints the following string of characters:
// "In the beginning there were the swamp, the hoe and Java." and a line break.
//Develop the program by adding the following feature: the main program should ask the user
// how many times the text should be printed (meaning how many times the method is called).
public class ex6 {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times the text should be printed?");
        int n = Integer.parseInt(reader.nextLine());

        for (int i = 0; i<n; i++){
            printText();
        }
    }

    public static void printText(){
        System.out.println("In the beginning there were he swamp, hoe and Java.");
        System.out.println();
    }
}
