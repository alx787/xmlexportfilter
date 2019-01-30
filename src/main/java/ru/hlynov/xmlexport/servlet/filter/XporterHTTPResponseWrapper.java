package ru.hlynov.xmlexport.servlet.filter;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class XporterHTTPResponseWrapper
        implements HttpServletResponse
{
    private final HttpServletResponse response;

    public XporterHTTPResponseWrapper(HttpServletResponse response)
    {
        this.response = response;
    }

    public PrintWriter getWriter() throws IOException {
        return new PrintWriter(new OutputStreamWriter(this.response
                .getOutputStream(), this.response.getCharacterEncoding()));
    }

    public void addCookie(Cookie cookie)
    {
        this.response.addCookie(cookie);
    }

    public boolean containsHeader(String s)
    {
        return this.response.containsHeader(s);
    }

    public String encodeURL(String s)
    {
        return this.response.encodeURL(s);
    }

    public String encodeRedirectURL(String s)
    {
        return this.response.encodeRedirectURL(s);
    }

    public String encodeUrl(String s)
    {
        return this.response.encodeUrl(s);
    }

    public String encodeRedirectUrl(String s)
    {
        return this.response.encodeRedirectUrl(s);
    }

    public void sendError(int i, String s) throws IOException
    {
        this.response.sendError(i, s);
    }

    public void sendError(int i) throws IOException
    {
        this.response.sendError(i);
    }

    public void sendRedirect(String s) throws IOException
    {
        this.response.sendRedirect(s);
    }

    public void setDateHeader(String s, long l)
    {
        this.response.setDateHeader(s, l);
    }

    public void addDateHeader(String s, long l)
    {
        this.response.addDateHeader(s, l);
    }

    public String getHeader(String s) {
        return this.response.getHeader(s);
    }

    public void setHeader(String s, String s1)
    {
        this.response.setHeader(s, s1);
    }

    public void addHeader(String s, String s1)
    {
        this.response.addHeader(s, s1);
    }

    public void setIntHeader(String s, int i)
    {
        this.response.setIntHeader(s, i);
    }

    public void addIntHeader(String s, int i)
    {
        this.response.addIntHeader(s, i);
    }

    public Collection<String> getHeaders(String s)
    {
        return this.response.getHeaders(s);
    }

    public Collection<String> getHeaderNames()
    {
        return this.response.getHeaderNames();
    }

    public void setStatus(int i)
    {
        this.response.setStatus(i);
    }

    public int getStatus()
    {
        return this.response.getStatus();
    }

    public void setStatus(int i, String s)
    {
        this.response.setStatus(i, s);
    }

    public String getCharacterEncoding()
    {
        return this.response.getCharacterEncoding();
    }

    public void setCharacterEncoding(String s)
    {
        this.response.setCharacterEncoding(s);
    }

    public ServletOutputStream getOutputStream() throws IOException
    {
        return this.response.getOutputStream();
    }

    public void setContentLength(int i)
    {
        this.response.setContentLength(i);
    }

    public String getContentType()
    {
        return this.response.getContentType();
    }

    public void setContentType(String s)
    {
        this.response.setContentType(s);
    }

    public void setBufferSize(int i)
    {
        this.response.setBufferSize(i);
    }

    public int getBufferSize()
    {
        return this.response.getBufferSize();
    }

    public void flushBuffer() throws IOException
    {
        this.response.flushBuffer();
    }

    public void resetBuffer()
    {
        this.response.resetBuffer();
    }

    public boolean isCommitted()
    {
        return this.response.isCommitted();
    }

    public void reset()
    {
        this.response.reset();
    }

    public void setLocale(Locale locale)
    {
        this.response.setLocale(locale);
    }

    public Locale getLocale()
    {
        return this.response.getLocale();
    }

//    public void setContentLengthLong(long len)
//    {
//        this.response.setContentLengthLong(len);
//    }
}