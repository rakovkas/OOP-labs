package week6;

public class ex1 {
    public static int smallest (int[] array){
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static void main (String [] args){
        int [] values = {6,5,8,7,11};
        System.out.println("Smallest: " + smallest(values));
    }
}
