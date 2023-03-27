package dayThirteen;

import java.io.*;


public class MyLogger {
    private static MyLogger instance = null;
    private FileWriter writer;

    private MyLogger() {
        try {
            writer = new FileWriter("dummylog.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static MyLogger getInstance() {
        if (instance == null) {
            instance = new MyLogger();
        }
        return instance;
    }

    public void log(String message) {
        try {
            writer.write(message + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
