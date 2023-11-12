package week6;

public class ex3 {
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int min = array[index];
        int ind = index;
        for (int i = index; i< array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                ind = i;
            }
        }
        return ind;
    }

    public static void main (String [] args){
        int [] values = {-1,6,9,8,12};
        System.out.println("index of smallest: " + indexOfTheSmallestStartingFrom(values,1));
        System.out.println("index of smallest: " + indexOfTheSmallestStartingFrom(values,2));
        System.out.println("index of smallest: " + indexOfTheSmallestStartingFrom(values,4));

    }
}
