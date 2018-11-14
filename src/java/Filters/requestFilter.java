/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filters;

/**
 *
 * @author Jasper
 */
import java.io.*;
import javax.servlet.*;


/**
 *
 * @author U3
 */
public class requestFilter implements Filter{

public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException,ServletException
{

response.getWriter().println("BEFORE");
chain.doFilter(request,response);
response.getWriter().println("After");
}

public void init(FilterConfig filterConfig) throws ServletException{}

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    

} 