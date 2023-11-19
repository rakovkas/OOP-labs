package week7.task1;

public class Main {
    public static void main(String[] args){
        RecordLogger recordLogger = new RecordLogger("Record");
        recordLogger.logMessage(()-> "Logging with lambda function");
        ClassLogger classLogger = new ClassLogger("Class");
        classLogger.logMessage(()->"Logging with lambda function in a class.");
    }
}
