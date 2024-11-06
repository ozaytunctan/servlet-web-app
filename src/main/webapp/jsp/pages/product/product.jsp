<%--
  Created by IntelliJ IDEA.
  User: ozay.tunctan
  Date: 6.11.2024
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.otunctan.webapp.model.Product" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    Product product = (Product) request.getAttribute("product");
%>

<%--                 --%>
<div class="product-container">
    <h2>Product Details</h2>
    <div class="details-container">
        <p><%=product.getName()%></p>
        <p><%=product.getCategoryName()%></p>
        <p><%=product.getBasePrice()%></p>
        <p><%=product.getQuantity()%></p>
    </div>
</div>


</body>
</html>
