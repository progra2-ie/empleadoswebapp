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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alvam
 */
import java.io.IOException;
import java.io.PrintWriter;
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
public class ListarEmpleadosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // aqui deberíamos traer los empleados desde la bd
        List<Empleado> empleados= new LinkedList();
        empleados.add(new Empleado("10", "Juan", "Mora", new Departamento(100, "Contabilidad")));
        empleados.add(new Empleado("11", "Danny", "Roque", new Departamento(100, "Informatica")));
        
        // Adiciona el objeto empleados en el contexto request
        req.setAttribute("empleados", empleados);
        // redirigir el flujo de ejecución hacia el JSP
        req.getRequestDispatcher("listar_empleados.jsp").forward(req, resp);
    }

    
}
