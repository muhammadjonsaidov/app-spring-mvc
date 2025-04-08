<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
<h2>All Users</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
        </tr>
    </c:forEach>
</table>
<a href="/users/new">Add New User</a>
</body>
</html>