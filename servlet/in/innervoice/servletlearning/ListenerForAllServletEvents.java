package in.innervoice.servletlearning;

import org.slf4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created with IntelliJ IDEA.
 * User: sriram
 * Date: 25/8/13
 * Time: 1:09 AM
 * To change this template use File | Settings | File Templates.
 */

@WebListener
public class ListenerForAllServletEvents implements ServletContextListener, ServletRequestListener,
		HttpSessionListener, HttpSessionActivationListener,
		HttpSessionAttributeListener, HttpSessionBindingListener {

    Logger logger = null;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.setProperty("org.slf4j.simpleLogger.showDateTime","true");
        System.setProperty("org.slf4j.simpleLogger.defaultLogLevel","info");
        System.setProperty("org.slf4j.simpleLogger.dateTimeFormat", "yyyy-MM-dd::HH-mm-ss-SSS");
        logger = getLogger(this.getClass().getName());
        logger.error("I have hit contextInitialized: "+servletContextEvent.getServletContext().toString());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger. debug("I have hit contextDestroyed.");
    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        logger.debug("I have hit sessionCreated: "+
                    httpSessionEvent.getSession().getServletContext().getServletContextName());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        httpSessionEvent.getSession().getServletContext().log("I have hit sessionDestroyed: "+
                httpSessionEvent.getSession().getServletContext().getServletContextName());
    }

    @Override
    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
        httpSessionEvent.getSession().getServletContext().log("I have hit sessionWillPassivate");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
        httpSessionEvent.getSession().getServletContext().log("I have hit sessionDidActivate");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("I have hit attributeAdded: "+httpSessionBindingEvent.getName());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("I have hit attributeRemoved: "+httpSessionBindingEvent.getName());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        httpSessionBindingEvent.getSession().getServletContext().log("I have hit attributeReplaced");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        logger.error("I have hit requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        logger.debug("I have hit requestInitialized");
    }

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        httpSessionBindingEvent.getSession().getServletContext().log("I have hit valueBound");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        httpSessionBindingEvent.getSession().getServletContext().log("I have hit valueUnbound");
    }
}
