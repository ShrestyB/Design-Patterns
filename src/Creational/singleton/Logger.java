package Creational.singleton;

import java.time.LocalDateTime;

public class Logger {

    private static volatile Logger instance;

    private Logger() {
        System.out.println(" Logger initialized");
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }


    public void log(String message, LogLevel level) {
        String formatted = String.format("[%s] [%s]: %s", LocalDateTime.now(), level.name(), message);
        System.out.println(formatted);
    }
}
