package com.otunctan.webapp._02.lifecycle;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/lifecycle")
public class LifecycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        // configurasyon yapılabilir
        System.out.println("LifecycleServlet.init()");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter pw = resp.getWriter();
        pw.println("<html><body>");
        pw.println("<div>LifecycleServlet$<b>doGet()</b></div>");
        pw.println("</html></body>");

        System.out.println("LifecycleServlet.doGet() method is called");
    }

    @Override
    public void destroy() {
        System.out.println("onDestroyed servlet...");
    }
}
