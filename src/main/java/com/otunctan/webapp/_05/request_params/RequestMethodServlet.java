package com.otunctan.webapp._05.request_params;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;


@WebServlet(value = "/request-headers")
public class RequestMethodServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Locale locale = req.getLocale();
        int localPort = req.getLocalPort();
        int serverPort = req.getServerPort();
        String remoteAddr = req.getRemoteAddr();
        ServletContext servletContext = req.getServletContext();// tüm servlet ler için ortak olarka tanımlanmış prarametrelere erişim sağlar.

        Enumeration<String> headerNames = req.getHeaderNames();
        Iterator<String> iterator = headerNames.asIterator();
        while (iterator.hasNext()) {
            String headerName = iterator.next();
            String headerValue = req.getHeader(headerName);
            System.out.println(headerName + ":" + headerValue);
        }
    }
}
