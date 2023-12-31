package week13.task1;

import week13.task1.Logger;

public class Main {
    public static void main(String[] args){
        //Logger instantiation
        Logger logger = Logger.getInstance();

        logger.log("Start");
        logger.logInfo("Information");
        logger.logWarning("Warniing");
        logger.logError("Error");

        Logger anotherLogger = Logger.getInstance();
        System.out.println("Is the first logger the same as the second one? "
                + (logger == anotherLogger));


    }
}
