package com.otunctan.webapp._08.listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.http.HttpServletRequest;

//@WebListener
public class ServletRequestListenerImpl implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Request initialized...");

        HttpServletRequest request = (HttpServletRequest)sre.getServletRequest();

        String path = request.getServletPath();
        String address = request.getRemoteAddr();

    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request destroyed...");
    }
}
