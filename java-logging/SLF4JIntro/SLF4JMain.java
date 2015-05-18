import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: sriram
 * Date: 9/9/13
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class SLF4JMain {
    static {
        customizeLoggers();
    }
    private static Logger logger = LoggerFactory.getLogger(SLF4JMain.class.getName());
    public static void main(String[] args)
    {

        logger.error("This is the bare minimum Java Logger");
        logger.debug("This should not be printed");
        logger.info("And this should be printed");
    }

    private static void customizeLoggers()
    {
        System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
        System.setProperty("org.slf4j.simpleLogger.logFile", "Test.log");
    }


}
