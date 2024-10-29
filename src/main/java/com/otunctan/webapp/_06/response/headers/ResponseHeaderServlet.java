package com.otunctan.webapp._06.response.headers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Base64;
import java.util.UUID;


@WebServlet(value = "/response-headers")
public class ResponseHeaderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("username", "tes-user");
        response.addHeader("Auhorization", "Basic " + UUID.randomUUID().toString());
    }
}
