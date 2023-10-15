package week2;

import java.util.Scanner;

//Create a program that asks the user for the first number and the last number
// and then prints all numbers between those two.
// Use a while loop.
//If the first number is greater than the last number, the program prints nothing.
public class ex4 {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());

        if (first>last){
            System.out.println();
        } else {
            for (int i = first; i<= last; i++){
                System.out.println(i);
            }
        }
    }
}
