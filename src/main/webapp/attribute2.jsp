<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Page Attribute Result</title>
</head>
<body>

<%

    Object reqAttribute1 = request.getAttribute("reqAttribute1");
    Object sessionAttribute1 = session.getAttribute("sessionAttribute1");
    Object applicationAttribute1 = application.getAttribute("applicationAttribute1");
    Object pageContextAttribute1 = pageContext.getAttribute("pageContextAttribute1");


%>

<p><%=reqAttribute1%></p>
<p><%=sessionAttribute1%></p>
<p><%=applicationAttribute1%></p>
<p><%=pageContextAttribute1%></p>

</body>
</html>
