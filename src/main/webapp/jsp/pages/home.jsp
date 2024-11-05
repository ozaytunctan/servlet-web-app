<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Arrays,java.util.ArrayList"%>

<html>
<head>
    <title>Anasayfa </title>
</head>
<body>

<div>
    <h2>Merhaba,</h2>
    <p>JSP Eğitimlerine Başlıyoruz.</p>
    <%
        System.out.println("Html java kodu çalıştı...");
        String user = "admin tunctan";//local değişken
    %>

    <%=application.getAttribute("contextAttribute")%>

    <p>
        <%=application.getInitParameter("THEME_VALUE")%>
    </p>

    <span><%=user%></span>

    <span>
     <%--  JSP Declaration --%>
     <%!
         public int topla(int a, int b) {
             return a + b;
         }
     %>
     <%=topla(20, 50)%>
    </span>

</div>
</body>
</html>
