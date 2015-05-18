import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

/**
 * Created with IntelliJ IDEA.
 * User: sriram
 * Date: 7/9/13
 * Time: 3:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoggerMain {
    private static Logger logger = Logger.getLogger(LoggerMain.class.getName());
    public static void main(String[] args) throws InterruptedException {
        customizeLoggers();
        logger.warning("This is the bare minimum Java Logger");
        logger.fine("This should not be printed");
        logger.info("And this should be printed");
    }

    private static void customizeLoggers()
    {
        try {
            logger.addHandler(new FileHandler("Test.log"));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        ConsoleHandler nextConsoleHandler = new ConsoleHandler();
        nextConsoleHandler.setFormatter(new XMLFormatter());
        logger.addHandler(nextConsoleHandler);
    }
}
