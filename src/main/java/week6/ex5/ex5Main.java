package week6.ex5;

import java.util.Arrays;
import java.util.Scanner;

public class ex5Main {
    public static void main (String[] args){
        //testing binary search

        int[] array = {-3,2,3,4,7,8,12};
        Scanner reader = new Scanner(System.in);

        System.out.println("Values of the array: " + Arrays.toString(array));
        System.out.println();

        System.out.println("Enter searched numbber: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        int result = BinarySearch.search(array, Integer.parseInt(searchedValue));

        if (result<0){
            System.out.println("Value " + searchedValue + " is not in the array.");
        }
        else {
            System.out.println("Value " + searchedValue + " is in array");
        }
    }
}
