<%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2019/6/25 0025
  Time: 8:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
    <form name="loginForm" method="post" action="${pageContext.request.contextPath}/admin?method=login">
        <table align="center" border="1" cellspacing="0" cellpadding="1" width="20%">
            <tr>
                <td>用户名</td>
                <td><input type="text" name="userName"/></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="passWord"/> </td>
            </tr>
            <tr>
                <td align="center" colspan="2"><input type="submit" value="登录"/> </td>
            </tr>
        </table>
    </form>
</body>
</html>
