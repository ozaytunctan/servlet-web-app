package com.otunctan.webapp._08.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ServletContextListenerImpl implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().setInitParameter("THEME_VALUE","dark");
//        System.out.println("Servlet context started...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
//        System.out.println("Servlet context destroyed...");
    }
}
