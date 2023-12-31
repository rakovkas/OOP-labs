package week13.task3;

public class TextEditor {
    private TextFormatter textFormatter;

    public void setFormatter (TextFormatter textFormatter){
        this.textFormatter = textFormatter;
    }

    //Method to format text using the current text formatter
    public  String formatText (String text){
        if (textFormatter == null){
            throw  new IllegalStateException("Text formtter is not set!");
        }
        return textFormatter.formatText(text);
    }

}
