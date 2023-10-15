package week2;
import java.util.Objects;
import java.util.Scanner;
//Create a program that asks the user for a password. If the password is right,
// a secret message is shown to the user.

public class ex1 {
    public static void main (String[] args){
        Scanner reader =  new Scanner(System.in);
        String password = "carrot";
        String secret = "jryy qbar";

        System.out.println("Type the password: ");
        String word = reader.nextLine();

        if (Objects.equals(word, password)){
            System.out.println("Right!");
            System.out.println("The secret is: " + secret + " !");
        }
        else {
            System.out.println("Wrong!");
        }

    }
}
