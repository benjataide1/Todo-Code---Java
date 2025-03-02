<%@page import="java.util.List"%>
<%@ page import="logic.User" %>

<!DOCTYPE html>
<html>

<head>
  <meta charset='utf-8'>
  <meta http-equiv='X-UA-Compatible' content='IE=edge'>
  <title>Show User</title>
</head>

<body>

  <h1>List of User</h1>
  <!-- ! implemento codigo java,manejo los datos enviados por el 'Servlet SvUser' -->

  <% 
    List<User> listUser = (List<User>) request.getSession().getAttribute("userList");//! Me tragigo el atributo que configure anteriormente en mi Servlet
      int count = 1;
      for(User s: listUser){
  %>

   <p><b>Cliente N°: <%= count %></b></p>
   <p>DNI: <%= s.getDni() %></p>
   <p>Nombre: <%= s.getName() %></p>
   <p>Apellido: <%= s.getLastname() %></p>
   <p>Teléfono: <%= s.getPhone() %></p>
   <p>-----------------------</p>
  <% count++; %>


  <%

    }
  %>
</body>

</html>