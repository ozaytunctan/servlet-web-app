package com.otunctan.webapp._06.response.cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.UUID;

@WebServlet(value = "/set-cookie-servlet")
public class ResponseSetCookieServlet extends HttpServlet {

    private static String SESSION_ID_COOKIE = "CSESSION_ID";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

        Cookie sessionCookie = new Cookie(SESSION_ID_COOKIE, UUID.randomUUID().toString());
        sessionCookie.setHttpOnly(true);//sadece http sunucu tarafından okunabilir.
        sessionCookie.setSecure(false);// canlı ortamda true ayarlanalıdır. true ise https ise cookie izin veririr.
//        sessionCookie.setDomain("www.ozaytunctan.com");
        response.addCookie(sessionCookie);


        //2.Yöntem
//        response.addHeader("Set-Cookie",SESSION_ID_COOKIE+"2="+UUID.randomUUID()+";HttpOnly;Secure=false;Path=/");
    }
}
