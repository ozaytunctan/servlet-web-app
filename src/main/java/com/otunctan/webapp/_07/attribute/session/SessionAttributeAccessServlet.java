package com.otunctan.webapp._07.attribute.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

@WebServlet(value = "/get-session-attribute")
public class SessionAttributeAccessServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = request.getSession();
        Object sessionAttribute = session.getAttribute("sessionAttribute");
        String sessionValue = (String) sessionAttribute;

        PrintWriter pw = resp.getWriter();
        pw.println("Session attribute value:" + sessionValue);

    }
}
