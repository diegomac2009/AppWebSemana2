<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Datos</title>
<link rel="stylesheet" href="estilo2.css">
</head>

<body>
    <form class="form-login">
       
        <div class="logo" style="float: left">
            <img src="utec.png" width="50" height="40">
            </div>
            <div class="logo" style="float: right">
              <img src="lti.png" width="50" height="40">          
              </div>
              <br>  
       
        <h5>
            BIENVENIDO</h5>
           <h4> <%=request.getParameter("txtNombre")%></h4>
           <br>
    
         
    
        <!-- ${pageScope.request.contextPath}  -->
        <table id="tabla">
         <tr>
                <th>Identificador</th>
                <td>${requestScope.p.identificador}</td>
            </tr>
            <tr>
                <th>Nombre</th>
                <td>${requestScope.p.nombre}</td>
            </tr>
             <tr>
                <th>Edad</th>
                <td>${requestScope.p.edad}</td>
            </tr>
            <tr>
                <th>Dirección</th>
                <td>${requestScope.p.direccion}</td>
            </tr>		
            <tr>
                <th>Teléfono</th>
                <td>${requestScope.p.tel}</td>
            </tr>	         
                        
    
        </table>
        <br>
       
  <a href="index.jsp"><input class="buttons" type="button" name="" value="Volver Atrás"></a>
  
  
    </form>





</body>
</html>