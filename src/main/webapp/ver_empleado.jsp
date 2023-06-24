<%-- 
    Document   : ver_empleado
    Created on : Mar 16, 2018, 7:16:25 PM
    Author     : alvam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Información del empleado</title>
    </head>
    <body>
        <h1>Información del empleado</h1>
        <% String idEmpleado = request.getParameter("idEmpleado"); 
            String nombreEmpleado = request.getParameter("nombreEmpleado");
        %>
        Número de empleado: <%= idEmpleado %>
        Nombre de empleado: <%= nombreEmpleado %>
    </body>
</html>
