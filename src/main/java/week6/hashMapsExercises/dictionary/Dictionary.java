package week6.hashMapsExercises.dictionary;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> dictionary = new HashMap<>();

    public void add(String word, String translation){
        this.dictionary.put(word,translation);
    }

    public String translate(String word){
        return this.dictionary.get(word);
    }

    public int amountOfWords(){
        return this.dictionary.size();
    }

    public ArrayList<String> translationList (){
        ArrayList<String> translation = new ArrayList<>();
        for (String key : dictionary.keySet()){
            translation.add(key + " = " + dictionary.get(key));
        }
        return translation;
    }

}
