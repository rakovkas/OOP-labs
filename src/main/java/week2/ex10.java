package week2;
//Guessing Game
//STEP 1: The program that comes with the exercise contains a command called drawNumber.
// It draws a number, which is in the range 0 to 100 (both 0 and 100 are possible).
// Create a program that draws a number. Then the user has the chance to guess once,
// what the number is. The program should print "The number is lesser", "The number is greater"
// or "Congratulations, your guess is correct!" depending on the number the user typed.

//STEP 2: Develop your program by adding the following functionality: the guessing should be made repeatedly
// until the user types the right number. Note that you need to draw the number by using the drawNumber command
// before the repetition.
// Why? What happens if you draw the number inside the repetition?

import java.util.Random;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int drawNumber = (int)Math.floor(Math.random()*101);
        System.out.println("Guess a number: ");
        int num;
        int count = 0;
        while (true){
            num = Integer.parseInt(reader.nextLine());
            count++;
            if(num==drawNumber){
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            else if (num<drawNumber){
                System.out.println("The number is greater, guesses made: " + count);
            }
            else{
                System.out.println("The number is lesser, guesses made: " + count);
            }
        }




    }
}
