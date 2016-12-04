<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: script
  Date: 12/4/16
  Time: 6:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PageNotFound</title>
</head>
<body>
<%--alert alert-danger--%>
<div class="alert alert-danger">
    <br>
    <h4>HTTP Status 404 - Page Not Found</h4>
    <p>The page you requested is not available. You might try returning to the <a
            href="<c:url value="/home"/>">home page</a>.</p>
</div>
</body>
</html>
