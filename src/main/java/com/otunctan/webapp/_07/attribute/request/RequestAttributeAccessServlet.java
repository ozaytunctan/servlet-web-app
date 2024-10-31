package com.otunctan.webapp._07.attribute.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/get-request-attribute")
public class RequestAttributeAccessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Object attribute = req.getAttribute("requestAttribute");
        // farklı bir istek olduğu için attribute değeri null olacaktır.
        PrintWriter pw = resp.getWriter();
        pw.println("Rquest attribute value:" + attribute);


    }
}
