<%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2019/6/25 0025
  Time: 8:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<h3 align="center">
    欢迎您，${loginInfo.userName} <br>
    <a href="${pageContext.request.contextPath}/admin?method=logout">退出</a>
    <a href="${pageContext.request.contextPath}/page/online.jsp">在线列表</a>
</h3>
