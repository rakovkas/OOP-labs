package week13.task1;

public class Logger {
    private static Logger instance;

    //private constructor to prevent external instantiation
    private Logger(){
    }

    // Public method to provide a single point of access to the Logger instance
    public static Logger getInstance(){
        synchronized (Logger.class){
            if(instance==null){
                instance=new Logger();
            }
        }

        return instance;
    }

    public void log (String message){
        System.out.println("LOG:" + message);
    }

    public void logInfo(String message){
        System.out.println("INFO: " + message);
    }

    public void logWarning(String message){
        System.out.println("WARNING: " + message);
    }
    public void logError(String message){
        System.out.println("ERROR: " + message);
    }


}
