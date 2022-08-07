<%--
  Created by IntelliJ IDEA.
  User: liupinggang-dell
  Date: 2022/7/31
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/style.css"/> ">
</head>
<body>
    <h1>欢迎来到 Spittr</h1>
    <a href="<c:url value="/spittles" />">spittles</a>
    <a href="<c:url value="/spitter/register"/>">register</a>
</body>
</html>
