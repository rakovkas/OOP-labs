package week6.ex5;

public class BinarySearch {
    public static int search (int[] arr, int searchedValue){
        int left = 0, right = arr.length-1;
        while (left<=right){
            int middle = left+(right-left)/2;

            //is value in the middle
            if (arr[middle] == searchedValue){
                return middle;
            }
            //if value is greater than middle, ignore left half
            if (arr[middle]<searchedValue){
                left = middle+1;
            }
            //if value is smaller, ignore right half
            else {
                right = middle-1;
            }
        }
        //if the value is not present
        return -1;
    }
}
