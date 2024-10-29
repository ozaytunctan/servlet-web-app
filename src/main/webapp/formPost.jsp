<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>


<section class="form-section">
    <form name="registrationForm"
          method="post"
          action="${pageContext.request.contextPath}/request-post-form">
        <div>
            <div>
                <label>Ad:</label>
                <input type="text" name="firstName">
            </div>

            <div>
                <label>Soyad:</label>
                <input type="text" name="lastName">
            </div>

            <div>
                <label>Cinsiyet:</label>
                <select name="gender">
                    <option value="MALE" selected="selected">Erkek</option>
                    <option value="FEMALE">Bayan</option>
                </select>
            </div>

            <div>
                <label>Medeni Hali:</label>
                <input name="marialStatus"  type="checkbox" value="bekar" selected="selected">Bekar</input>
                <input name="marialStatus" type="checkbox" value="evli">Evli</input>
                <input name="marialStatus" type="checkbox" value="bosanmis">Boşanmış</input>
                <input name="marialStatus" type="checkbox" value="dul">Dul</input>
            </div>

            <button type="submit">Kaydet</button>

        </div>
    </form>
</section>

</body>
</html>