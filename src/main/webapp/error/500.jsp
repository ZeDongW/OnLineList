<%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2019/6/25 0025
  Time: 8:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" isErrorPage="true" %>
<html>
<head>
    <title>系统出错</title>
</head>
<body>
    <center>亲，系统出现了一点小小的错误，程序猿小哥哥正在紧急维护中，请耐心等待！错误原因：${pageContext.exception.message}</center>
</body>
</html>
