package com.otunctan.webapp._11.expLanguage.implicitobjects;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/implicit-objects")
public class ImplicitServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        Cookie cookie = new Cookie("username", "otunctan");
        resp.addCookie(cookie);
        RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/pages/implicit.jsp");
        dispatcher.forward(request, resp);
    }
}
