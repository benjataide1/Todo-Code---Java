<%@page import="java.util.List"%>
<%@ page import="logic.User" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Update User</title>
</head>
<body>
    <h1>Update User Data</h1>
    
    <% 
        User user = (User) request.getSession().getAttribute("userUpdate");
    %>
    
    <form action="SvUpdate" method="POST">

        <p><label>DNI: </label>
        <input type="text" name="dni" value="<%= user.getDni() %>"></p>
        
        <p><label>Name: </label>
        <input type="text" name="name" value="<%= user.getName() %>"></p>
        
        <p><label>Lastname: </label>
        <input type="text" name="lastname" value="<%= user.getLastname() %>"></p>
        
        <p><label>Phone: </label>
        <input type="text" name="phone" value="<%= user.getPhone() %>"></p>
        
        <button type="submit">Save Changes</button>
    </form>
</body>
</html>
