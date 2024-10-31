package com.otunctan.webapp._06.response.download;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@WebServlet(value = "/download")
public class DownloadServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=text.xlsx");
        try (InputStream in = getServletContext().getResourceAsStream("temp/notlar.xlsx")) {
            int read;
            byte[] bytes = new byte[1024];
            ServletOutputStream os = response.getOutputStream();
            while ((read = in.read(bytes)) != -1) {
                os.write(bytes, 0, read);
            }
        }
    }
}
