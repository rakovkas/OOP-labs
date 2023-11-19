package week7.task1;

import week7.task1.Logger;

public record RecordLogger (String loggerName) implements Logger {

    @Override
    public void logMessage(LogMessageProvider messageProvider) {
        System.out.println("Record Loger " + loggerName + " : " + messageProvider.provideMessage());
    }
}
