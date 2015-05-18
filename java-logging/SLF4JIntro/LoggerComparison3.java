import java.io.IOException;
import java.util.logging.FileHandler;

/**
 * Created with IntelliJ IDEA.
 * User: sriram
 * Date: 6/10/13
 * Time: 10:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoggerComparison3 {
    static {
        // set a system property such that Simple Logger will include timestamp
        System.setProperty("org.slf4j.simpleLogger.showDateTime", "true");

        // set a system property such that Simple Logger will include timestamp in the given format
        System.setProperty("org.slf4j.simpleLogger.dateTimeFormat", "dd-MM-yy HH:mm:ss");

        // set minimum log level for SLF4J Simple Logger at warn
        System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "warn");

        // configure SLF4J Simple Logger to redirect output to a file
        System.setProperty("org.slf4j.simpleLogger.logFile", "SLF4J-File.log");
    }
    private static java.util.logging.Logger javaLogger = java.util.logging.Logger.getLogger("LoggerComparison3");
    private static org.slf4j.Logger slf4jLogger = org.slf4j.LoggerFactory.getLogger("LoggerComparison3");

    public static void main(String[] args)
    {
        // configure File Handler for JUL
        addFileHandlerToJavaLogger(javaLogger);

        // set minimum log level for JUL at WARNING
        javaLogger.setLevel(java.util.logging.Level.WARNING);

        javaLogger.severe("This SEVERE Log is from Java Util Logger.");
        javaLogger.info("This INFO Log from Java Util Logger should not be printed.");
        slf4jLogger.warn("This WARN Log is from SLF4J.");
        slf4jLogger.debug("This DEBUG Log from SLF4J should not be printed.");
    }

    private static void addFileHandlerToJavaLogger(java.util.logging.Logger logger)
    {
        try {
            logger.addHandler(new FileHandler("JUL-File.log"));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
