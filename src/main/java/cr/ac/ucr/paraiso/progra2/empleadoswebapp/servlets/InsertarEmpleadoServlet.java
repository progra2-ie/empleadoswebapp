/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.paraiso.progra2.empleadoswebapp.servlets;

import cr.ac.ucr.paraiso.progra2.empleadoswebapp.domain.Departamento;
import cr.ac.ucr.paraiso.progra2.empleadoswebapp.domain.Empleado;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alvam
 */
public class InsertarEmpleadoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // se deberian traer los departamentos desde la base de datos
        List<Departamento> departamentos = new ArrayList<>();
        departamentos.add(new Departamento(100, "Contabilidad"));
        departamentos.add(new Departamento(200, "Informática"));
        departamentos.add(new Departamento(201, "Producción"));
        req.setAttribute("departamentos", departamentos);
        req.getRequestDispatcher("/insertar_empleado.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Empleado empleado = new Empleado();
        empleado.setNombre(req.getParameter("nombreEmpleado"));
        empleado.setApellidos(req.getParameter("apellidosEmpleado"));
        empleado.getDepartamento().setCodDepto(Integer.parseInt(
                req.getParameter("codDepto")));
        
        // deberiamos enviar el empleado para insertar a la b.d.
        //req.setAttribute("empleadoInsertado", empleado);
        req.getRequestDispatcher("/ver_empleado.jsp?idEmpleado="+empleado.getIdEmpleado() +
                "&nombreEmpleado="+empleado.getNombre() + " " + empleado.getApellidos()).forward(req, resp);
    }
    
    
}