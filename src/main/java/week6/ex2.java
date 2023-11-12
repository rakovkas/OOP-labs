package week6;

public class ex2 {
    public static int indexOfTheSmallest (int[] array){
        int min = array[0];
        int ind = 0;
        for (int i = 0; i< array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                ind = i;
            }
        }
        return ind;
    }

    public static void main (String [] args){
        int [] values = {6,5,8,7,11};
        System.out.println("index of smallest: " + indexOfTheSmallest(values));
    }
}
