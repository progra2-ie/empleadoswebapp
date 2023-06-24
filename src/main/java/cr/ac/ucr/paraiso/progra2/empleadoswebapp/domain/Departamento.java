/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.paraiso.progra2.empleadoswebapp.domain;

import java.util.List;

/**
 *
 * @author alvam
 */
public class Departamento {
    private int codDepto;
    private String nombreDepartamento;

    public Departamento() {
    }

    public Departamento(int codDepto, String nombreDepartamento) {
        this.codDepto = codDepto;
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getCodDepto() {
        return codDepto;
    }

    public void setCodDepto(int codDepto) {
        this.codDepto = codDepto;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    
    
        
    
}
