<%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2019/6/25 0025
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" import="cn.zedongw.entity.Admin" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>在线用户列表</title>
</head>
<body>
<jsp:include page="../public/head.jsp"></jsp:include>
<!-- 列表展示数据-->
<table align="center" cellpadding="0" cellspacing="1" width="80%" border="1">
    <tr>
        <td colspan="2" align="center"><h3>在线列表展示：</h3></td>
    </tr>
    <tr>
        <td>编号</td>
        <td>姓名</td>
    </tr>
    <c:if test="${not empty applicationScope.onLineSet}">
        <c:forEach var="admin" items="${applicationScope.onLineSet}" varStatus="vs">
            <tr>
                <td>${vs.count}</td>
                <td>${admin.userName}</td>
            </tr>
        </c:forEach>
    </c:if>
</table>
</body>
</html>
