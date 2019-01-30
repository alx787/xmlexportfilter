package ru.hlynov.xmlexport.servlet.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import javax.servlet.*;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class SearchRequestInterceptor implements Filter{
    private static final Logger log = LoggerFactory.getLogger(SearchRequestInterceptor.class);

    private static final ThreadLocal<HttpServletRequest> REQUEST_HOLDER = new ThreadLocal();

    private static final ThreadLocal<HttpServletResponse> RESPONSE_HOLDER = new ThreadLocal();


    public void init(FilterConfig filterConfig)throws ServletException{
    }

    public void destroy(){
    }


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException,ServletException{
        //do some custom handling here
        HttpServletRequest filtRequest = (HttpServletRequest)request;
        HttpServletResponse filtResponse = (HttpServletResponse)response;
        try {
            REQUEST_HOLDER.set(filtRequest);
            HttpServletResponse wrappedResponse = new XporterHTTPResponseWrapper(filtResponse);
            RESPONSE_HOLDER.set(wrappedResponse);

            chain.doFilter(request, wrappedResponse);
        } finally {
            REQUEST_HOLDER.remove();
            RESPONSE_HOLDER.remove();
        }

        log.warn(" == filtering ==");

        //continue the request
//        chain.doFilter(request,response);
    }


    public static HttpServletRequest getRequest()
    {
        return (HttpServletRequest)REQUEST_HOLDER.get();
    }

    public static HttpServletResponse getResponse()
    {
        return (HttpServletResponse)RESPONSE_HOLDER.get();
    }

}