package week6.birdwatchersDatabase;

import java.util.Scanner;

public class Main extends StringUtils{
    //execution of program
    /*
    The program should implement the following commands:
Add - adds a bird
Observation - adds an observation
Statistics - prints all the birds
Show - prints one bird
Quit - terminates the program

     */
   public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       Birdwatchers birdwatcher = new Birdwatchers();

       while(true){
           System.out.print("? ");
           String input = reader.nextLine();

           //quit
           if (StringUtils.included(input, "Quit")){
               break;
           }
           else if (StringUtils.included(input, "Add")){
               System.out.print("Name: ");
               String name = reader.nextLine();
               System.out.print("Latin Name: ");
               String latin = reader.nextLine();

               birdwatcher.addBird(new Bird(name, latin));
               continue;
           }
           else if (StringUtils.included(input, "Observation")){
               System.out.print("What was observed? ");
               String name = reader.nextLine();

               birdwatcher.addObservation(name);
               continue;
           }
           else if (StringUtils.included(input, "Statistics")){
               birdwatcher.statistics();
               continue;
           }
           else if (StringUtils.included(input, "Show")){
               System.out.print("What? ");
               String name = reader.nextLine();

               birdwatcher.show(name);
               continue;
           }
           else {
               System.out.println("Wrong input! Try again.");
               continue;
           }
       }
   }


}
