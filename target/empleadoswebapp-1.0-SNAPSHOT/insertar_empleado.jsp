<%-- 
    Document   : insertar_empleado
    Created on : Mar 16, 2018, 7:35:49 PM
    Author     : alvam
--%>

<%@page import="cr.ac.ucr.paraiso.progra2.empleadoswebapp.domain.Departamento"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar un nuevo empleado</title>
    </head>
    <body>
        <h1>Insertar un nuevo empleado</h1>
        <% List<Departamento> departamentos = 
                (List<Departamento>)request.getAttribute("departamentos"); %>
        <form action="./insertarEmpleado" method="POST">
            Nombre del empleado: <input name="nombreEmpleado" type="text"> <br>
            Apellidos del empleado: <input name="apellidosEmpleado" type="text"> <br>
            Seleccione un departamento:
            <select name="codDepto">
               <% for(Departamento depto:departamentos) {%>
               <option value="<%= depto.getCodDepto() %>">
                   <%= depto.getNombreDepartamento() %>
               </option>
               <% } %>
            </select>
            <br>
            <input name="btnSalvar" type="submit" value="Salvar">
        </form>
        
        
    </body>
</html>
