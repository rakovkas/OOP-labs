package week2;

import java.util.Scanner;

public class ex2 {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.println("Typre the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.println("Type the second number: ");
        read = Integer.parseInt(reader.nextLine());
        sum +=  read;

        System.out.println("Type the third number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.println("Sum: " + sum);
    }
}
