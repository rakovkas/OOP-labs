package week13.task3;

public class Main {
    public static void main(String[] args){
        TextEditor textEditor = new TextEditor();

        textEditor.setFormatter(new UpperCaseFormatter());
        String upperCaseText = textEditor.formatText("Hello, World!");
        System.out.println("Upper Case: " + upperCaseText);

        textEditor.setFormatter(new LowerCaseFormatter());
        String lowerCaseText = textEditor.formatText("Hello, World!");
        System.out.println("Lower Case: " + lowerCaseText);

        textEditor.setFormatter(new CamelCaseFormatter());
        String camelCaseText = textEditor.formatText("hello, World!");
        System.out.println("Camel Case: " + camelCaseText);

    }
}
