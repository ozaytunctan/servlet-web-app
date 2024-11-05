<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Jsp attribute</title>
</head>
<body>

<%

    request.setAttribute("reqAttribute1", "request attribute value");
    session.setAttribute("sessionAttribute1", "session attribute value");
    application.setAttribute("applicationAttribute1", "application attribute value");
    pageContext.setAttribute("pageContextAttribute1", "application attribute value");

    boolean showSpan = true;
    request.setAttribute("showSpan", showSpan);

%>

</body>
</html>
