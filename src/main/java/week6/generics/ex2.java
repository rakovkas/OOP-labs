package week6.generics;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to create a generic method
// that takes a list of any type and returns
// it as a new list with the elements in reverse order.
public class ex2 {
    public static <T> List <T> reversed (List<T> orginalList){
        List<T> reversedList = new ArrayList<>();

        for (int i = orginalList.size()-1; i >= 0; i--){
            reversedList.add(orginalList.get(i));
        }

        return reversedList;
    }
}
