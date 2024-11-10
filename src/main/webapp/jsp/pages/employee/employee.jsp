<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 10.11.2024
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Expression Language</title>
</head>
<body>

<div class="employee-container">
    <div>
        <h2>Employee Details</h2>
        <p>Adı:${employee.firstName}</p>
        <p>Soyadı:${employee.lastName}</p>
        <p>Yaşı:${employee.age}</p>
        <p>Çalıştığı birim id:${employee.department.id}</p>
        <p>Çalıştığı birim:${employee.department.name}</p>
        <p>Çalıştığı birim kodu:${employee.department.code}</p>
    </div>
</div>
</body>
</html>
