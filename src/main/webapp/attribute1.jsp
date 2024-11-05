
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <%

      request.setAttribute("reqAttribute1","request attribute value");
      session.setAttribute("sessionAttribute1","session attribute value");
      application.setAttribute("applicationAttribute1","application attribute value");
      pageContext.setAttribute("applicationAttribute1","application attribute value");

  %>

</body>
</html>
