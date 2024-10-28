package com.otunctan.webapp._03.servletconfig;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ConfigServlet extends HttpServlet {

//
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        String username = config.getInitParameter("username");
//        String credentials = config.getInitParameter("credentials");
//        System.out.println("Authorization Basic = " + String.join(":", username, credentials));
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        System.out.println(servletConfig.getInitParameter("username"));

    }
}
