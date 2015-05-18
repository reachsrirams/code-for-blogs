/**
 * Created with IntelliJ IDEA.
 * User: sriram
 * Date: 6/10/13
 * Time: 10:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoggerComparison1 {

    private static java.util.logging.Logger javaLogger = java.util.logging.Logger.getLogger("LoggerComparison1");
    private static org.slf4j.Logger slf4jLogger = org.slf4j.LoggerFactory.getLogger("LoggerComparison1");

    public static void main(String[] args)
    {
        javaLogger.severe("This message is from Java Util Logger");
        javaLogger.finer("This is a finer message from Java Util Logger");
        slf4jLogger.warn("This message is from SLF4J Logger");
        slf4jLogger.debug("This is a debug log from SLF4J Logger");
    }

}
