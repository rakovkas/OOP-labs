package week13.task3;

public class CamelCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text) {
        String[] words = text.split(" ");
        String result = "";

        for(String word : words){
            if(!word.isEmpty()){
                result += Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }
            result += " ";
        }
        return result;
    }
}
