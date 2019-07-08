<%--
  Created by IntelliJ IDEA.
  User: wusd
  Date: 2019/7/8
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <form action="XssDemo" method="post">
        <input type="text" name="userName">
        <input type="submit">
    </form>
</body>
</html>
