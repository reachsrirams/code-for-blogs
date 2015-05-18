import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: sriram
 * Date: 7/2/13
 * Time: 9:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoggerTest {

    private static Logger logger = Logger.getLogger("LoggerTest");
    public static void main(String[] args) {
        logger.setLevel(Level.INFO);
        ClassCastException exception = new ClassCastException("Test");
        for(int i = 0; i < 5; i++) {
            long startTime = System.nanoTime();
            if (false)
            {
                logger.finer(getLogMessage(exception));
            }

            long finalTime = System.nanoTime();
            System.out.println((finalTime - startTime));
        }
    }

    private static String getLogMessage(int i)
    {
        return String.valueOf(i);
    }

    private static String getLogMessage(Throwable t)
    {
        return ("Invalid Value: "+t.getMessage());
    }
}
