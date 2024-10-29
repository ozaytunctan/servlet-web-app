package com.otunctan.webapp._06.response.encoding;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

@WebServlet(value = "/response-encoding")
public class ResponseEncodingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Türkçe karakter sorunu:
        // 1)  Kullanilan karakterler charset tarafından destekleniyor mu.
        // 2) Her iki uçta kullanılan charset encoding aynı mı ?
        // 3) ISO 8859-1 Default kullanıldığı içindir.

        String defaultEncoding = resp.getCharacterEncoding();
        System.out.println(defaultEncoding);

//        resp.setCharacterEncoding("ISO-8859-9");//Türkçe karakter setini destekler.
         resp.setCharacterEncoding(StandardCharsets.UTF_8.name());

        PrintWriter pw = resp.getWriter();
        pw.println("<html><body>");
//        pw.println("<head><meta charset='ISO-8859-9'></head>");
        pw.println("<head><meta charset='UTF-8'></head>");
        pw.println("<span>İiŞşçÇiöüğĞ</span>");
        pw.println("</body></html>");
    }
}
