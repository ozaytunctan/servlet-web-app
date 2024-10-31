package com.otunctan.webapp._07.attribute.context;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/get-attributes")
public class ContextAttributeAccessServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object attributeValue = getServletContext().getAttribute("contextAttribute");
        Integer value = (Integer) attributeValue;

        PrintWriter pw = resp.getWriter();
        pw.println(value);

    }
}
