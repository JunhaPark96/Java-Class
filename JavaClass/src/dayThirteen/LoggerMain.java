package dayThirteen;

public class LoggerMain {

    public static void main(String[] args) {
        MyLogger logger1 = MyLogger.getInstance();
        logger1.log("first");
        MyLogger logger2 = MyLogger.getInstance();
        logger2.log("second");
    }

}
