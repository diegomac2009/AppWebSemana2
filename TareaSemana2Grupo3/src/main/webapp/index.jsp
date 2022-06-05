<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.Optional"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="estilo1.css">
</head>

	
	

<body>
	
	

    <form class="form-login" action="validar" method=post>
    <div class="logo" style="float: left">
        <img src="utec.png" width="50" height="40">
        </div>
        <div class="logo" style="float: right">
          <img src="lti.png" width="50" height="40">          
          </div>
          <br>
    
      <h5>Ingreso de Persona</h5>
  
	
	   
	<!-- Se usan diferentes formas de mostrar el parametro errorMessage que vino en el request 
	<c:out value="${errorMessage}"/> (2)<br>
	${requestScope.errorMessage} (3)<br>
	
	-->

      <input class="controls" type="text" name="txtNombre" value="" placeholder="Nombre">
      <input class="controls" type="number" name="txtEdad" value="" placeholder="Edad" required>
      <input class="controls" type="text" name="txtDireccion" value="" placeholder="Dirección">
      <input class="controls" type="number" name="txtTel" value="" placeholder="Teléfono" required>
      <input class="buttons" type="submit" name="Enviar" value="Enviar">
       	
          <h4><c:out value="${errorMessage}"/> </h4>	
      <p></p>

    </form>

</body>
</html>