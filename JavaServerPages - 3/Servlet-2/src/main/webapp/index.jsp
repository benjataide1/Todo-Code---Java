<html>

<body>
  <h2>Datos User!</h2>
  <form action="SvUser" method="post"> <!--! De este formulario , al ejecutarlo se va a enviar la informacion a mi Servlet "SvUser"-->
    <p><Label>DNI:</Label><input type="text" name="dni"></p>

    <p><Label>Name:</Label><input type="text" name="name"></p>

    <p><Label>Lastname:</Label><input type="text" name="lastname"></p>

    <p><Label>Phone:</Label><input type="text" name="phone"></p>
    <button type="submit">Send</button>

  </form>

  <br>

  <h1>See list of Users</h1>
  <p>Para ver los datos de los Usuarios cargados haga click en el siguiente boton</p>

  <form action="SvUser" method="get">
    <button type="submit">Get User</button>



  </form>
</body>

</html>