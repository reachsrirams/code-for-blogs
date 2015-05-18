package in.innervoice.servletlearning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: sriram
 * Date: 25/8/13
 * Time: 1:02 AM
 * To change this template use File | Settings | File Templates.
 */
@javax.servlet.annotation.WebServlet(name = "TestServlet", urlPatterns = {"/myservlet"})
public class TestServlet extends javax.servlet.http.HttpServlet {
    Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        logger.error("About to hit getSession()");
//        request.getSession().setMaxInactiveInterval(10);
        logger.error("I have hit getSession()");
        logger.error("Let me see - "+System.getProperty("org.slf4j.simpleLogger.showDateTime"));
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
             /*
              * TODO output your page here. You may use following sample code.
              */
            out.println("<html>");
            out.println("<head>");
            out.println("<title<Servlet SimpleServlet</title<");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Servlet SimpleServlet at " + request.getContextPath() + "</h2>");
            out.println("<br/>Look ma, no WEB-XML!");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }

    }
}
