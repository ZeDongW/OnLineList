<%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2019/6/25 0025
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" import="cn.zedongw.entity.Students" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生列表</title>
</head>
<body>
    <jsp:include page="../public/head.jsp"></jsp:include>
    <!-- 列表展示数据-->
    <table align="center" cellpadding="0" cellspacing="1" width="80%" border="1">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>年龄</td>
        </tr>
        <c:if test="${not empty requestScope.studentList}">
            <c:forEach var="stu" items="${requestScope.studentList}" varStatus="vs">
                <tr>
                    <td>${vs.count}</td>
                    <td>${stu.name}</td>
                    <td>${stu.age}</td>
                </tr>
            </c:forEach>
        </c:if>
    </table>
</body>
</html>
