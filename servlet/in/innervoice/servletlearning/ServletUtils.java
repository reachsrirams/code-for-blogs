package in.innervoice.servletlearning;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: sriram
 * Date: 1/9/13
 * Time: 1:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ServletUtils {

    public static String getHttpServletRequestInfo(ServletRequest request)
    {
        StringBuffer httpServletRequestInfo = new StringBuffer(request.getLocalName());
        if(request instanceof HttpServletRequest)
        {
            HttpServletRequest httpRequest = (HttpServletRequest)request;
            httpServletRequestInfo.append("::");
            httpServletRequestInfo.append(httpRequest.getPathInfo());
            httpServletRequestInfo.append("::");
            httpServletRequestInfo.append(httpRequest.getRequestURL());
            httpServletRequestInfo.append("::");
            httpServletRequestInfo.append(httpRequest.getServletPath());
            httpServletRequestInfo.append("::");
        }
        return httpServletRequestInfo.toString();
    }
}
