<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 09/04/2025
  Time: 01:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
<h2>Add New User</h2>
<%--@elvariable id="user" type="uz.pdp"--%>
<form:form method="POST" action="/users" modelAttribute="user">
    <table>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Save"/>
            </td>
        </tr>
    </table>
</form:form>
<%
    String name = request.getParameter("name");
    if (name != null && !name.isEmpty()) {
        out.println("<p>Entered name: " + name + "</p>");
    } else {
        out.println("<p>Please enter a name!</p>");
    }
%>
</body>
</html>