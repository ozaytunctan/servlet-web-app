package com.otunctan.webapp._08.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AnnotationServletContextListenerImpl implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();

        System.out.println("servlet context started...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("servlet context destroyed...");
    }
}
