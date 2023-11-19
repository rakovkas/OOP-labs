package week7.task1;

public class ClassLogger implements Logger {

    private String name;
    public ClassLogger (String name){
        this.name=name;
    }

    @Override
    public void logMessage(LogMessageProvider messageProvider) {
        System.out.println("Class logger  " + name + " : " +messageProvider.provideMessage()) ;
    }
}
