package com.otunctan.webapp._09.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/http-session")
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = req.getSession();
        //yapılan ilk istekte
        if (session.isNew()) {
            response.getWriter().println("No available session!");
        } else {
            PrintWriter pw = response.getWriter();
            pw.println("Current session id :" + session.getId());
            pw.println("Session creation time:" + session.getCreationTime());

//            session.invalidate();

        }
    }
}
