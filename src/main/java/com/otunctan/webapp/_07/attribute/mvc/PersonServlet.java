package com.otunctan.webapp._07.attribute.mvc;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/person-servlet")
public class PersonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String message="request.attribute.message.value";
        //
        // db den veriyi çek request attribute olarak koy sonra view e dispacth et.
        request.setAttribute("requestAttrMessage",message);

        // dispatch
        // view tarafından kullanılcak şekilde ayarlabiliriz.
        RequestDispatcher dispatcher = request.getRequestDispatcher("person.jsp");
        dispatcher.forward(request,response);

    }
}