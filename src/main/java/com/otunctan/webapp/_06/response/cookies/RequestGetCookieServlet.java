package com.otunctan.webapp._06.response.cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet(value = "/get-cookie-servlet")
public class RequestGetCookieServlet extends HttpServlet {

    private static final String SESSION_ID_COOKIE = "CSESSION_ID";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sessionId = resolveSessionIdCookie(request);
        System.out.println("SESSION ID : " + sessionId);
        PrintWriter pw = response.getWriter();
        pw.println("session is valid " + Objects.nonNull(sessionId) + " value:" + sessionId);
    }

    private String resolveSessionIdCookie(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return null;
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(SESSION_ID_COOKIE)) {
                return cookie.getValue();
            }
        }

        return null;
    }
}
