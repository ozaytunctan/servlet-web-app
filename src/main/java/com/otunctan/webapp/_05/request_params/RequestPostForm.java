package com.otunctan.webapp._05.request_params;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

@WebServlet(value = "/request-post-form")
public class RequestPostForm extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String gender = req.getParameter("gender");
        String[] marialStatus = req.getParameterValues("marialStatus");

        Map<String, String[]> parameterMap = req.getParameterMap();
        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + Arrays.asList(entry.getValue()));
        }

        pw.println("<html><body>");
        pw.println("<h2>Post edilen form datası:</h2>");
        pw.println("<div>Adı:" + firstName + "</div>");
        pw.println("<div>Soyadı:" + lastName + "</div>");
        pw.println("<div>Cinsiyet:" + gender + "</div>");
        pw.println("</html></body>");

        resp.setStatus(200);
    }


}
