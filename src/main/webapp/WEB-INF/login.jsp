<%--
  Created by IntelliJ IDEA.
  User: tigen
  Date: 2024-06-04
  Time: 오후 5:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:if test="${param.result == 'error'}">
    <h1>로그인 에러</h1>
</c:if>

    <form action="/login" method="post">
        <input type="text" name="mid">
        <input type="password" name="mpw">
        <input type="checkbox" name="auto">
        <button type="submit">LOGIN</button>
    </form>

</body>
</html>
