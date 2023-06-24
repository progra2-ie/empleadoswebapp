<%-- 
    Document   : listar_empleados
    Created on : Mar 16, 2018, 6:10:44 PM
    Author     : alvam
--%>

<%@page import="cr.ac.ucr.paraiso.progra2.empleadoswebapp.domain.Empleado"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar empleados</title>
    </head>
    <body>
        <h1>Listar empleados</h1>
        <%-- Scriptlets y expresiones, JSTL--%>
        <%-- Recuperar el objeto empleados que se encuentra en el contexto request --%>
        <% List<Empleado> empleados = (List<Empleado>) request.getAttribute("empleados"); %>

        <% for (Empleado empleadoActual : empleados) {%>
        <%-- EXPRESION es similar a un System.out.print --%>
        <%= empleadoActual.getApellidos()%> <br>
        <% } %>

        
        <%-- MOSTRAR LOS EMPLEADOS EN UN TABLA --%>
        <table border="1">
            <thead>
                <tr>
                    <th>Número de empleado</th>
                    <th>Nombre</th>
                    <th>Departamento</th>
                </tr>
            </thead>
            <tbody>
                <% for (Empleado empleadoActual : empleados) { %>
                <tr>
                    <td>
                        <a href="./ver_empleado.jsp?idEmpleado=<%= empleadoActual.getIdEmpleado() %>&nombreEmpleado=<%= empleadoActual.getNombre() + " " + empleadoActual.getApellidos() %>">
                            <%= empleadoActual.getIdEmpleado() %>
                        </a>
                        </td>
                    <td><%= empleadoActual.getNombre() + " " + empleadoActual.getApellidos() %></td>
                    <td><%= empleadoActual.getDepartamento().getNombreDepartamento() %></td>
                </tr>
                <% }%>
            </tbody>
        </table>
<%-- EJEMPLO DE HIPERVÍNCULO --%>
<a href="http://www.gmail.com">GMAIL</a>
    </body>
</html>
