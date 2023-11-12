package week6.library;

public class StringUtils {

    public static boolean included(String word, String searched){
        if (word==null || searched==null)
            return false;

        String updatedWord = word.toUpperCase().trim();
        String updatedSearched = searched.toUpperCase().trim();

        return updatedWord.contains(updatedSearched);
    }
}
