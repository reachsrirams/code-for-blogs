package in.innervoice.servletlearning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.SimpleLogger;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: sriram
 * Date: 31/8/13
 * Time: 3:45 PM
 * To change this template use File | Settings | File Templates.
 */
@WebFilter("/*")
public class TestServletFilter implements Filter {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public void init(FilterConfig filterConfig) throws ServletException {
        logger.error("I have hit FilterInit: " + filterConfig.getServletContext().getContextPath());

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.debug("I have hit doFilter: " + ServletUtils.getHttpServletRequestInfo(servletRequest));
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        logger.debug("I have hit destroy() in ServletFilter");
    }
}