<html>

<body>
  <h2>Datos User!</h2>
  <form action="SvUser" method="post">
    <!--! De este formulario , al ejecutarlo se va a enviar la informacion a mi Servlet "SvUser"-->
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


  <h1> Delete Users</h1>
  <p>Enter User ID</p>

  <form action="SvDelete" method="post">
    <p><label>ID: </label><input type="text" name="id_user"></p>  <!--! El parametro que mandamos es el valor del input y ese valor lo tomamos atraves del name 'id_user'-->
    <button type="submit">Delete User</button>

  </form>

  <h1>Update User</h1>
  <p>Enter User ID</p>

  <form action="SvUpdate" method="get">
    <p><label>ID: </label><input type="text" name="id_userUp"></p>
    <button type="submit">Update User</button>
  </form>

</body>

</html>