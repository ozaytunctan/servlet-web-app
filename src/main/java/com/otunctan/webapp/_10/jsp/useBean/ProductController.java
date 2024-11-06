package com.otunctan.webapp._10.jsp.useBean;

import com.otunctan.webapp.model.Product;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.math.BigDecimal;

@WebServlet(value = "/product-detail")
public class ProductController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        Product product = Product.of("Kot Pantolon (Large)", "Giyim", BigDecimal.valueOf(100), BigDecimal.valueOf(2));
        request.setAttribute("product", product);

//      RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/pages/product/product.jsp");
        RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/pages/product/productUseBean.jsp");
        dispatcher.forward(request, resp);

    }
}
