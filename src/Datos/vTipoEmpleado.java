/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Leo21
 */
public class vTipoEmpleado {
    
    private String nombre_tipoemp;
    private int horastrabajo;
    private float salariomin;
    private float salariomax;
    private int id_tipoempleado;

    public vTipoEmpleado() {
    }
    
    public vTipoEmpleado(String nombre_tipoemp, int horastrabajo, float salariomin, float salariomax, int id_tipoempleado) {
        this.nombre_tipoemp = nombre_tipoemp;
        this.horastrabajo = horastrabajo;
        this.salariomin = salariomin;
        this.salariomax = salariomax;
        this.id_tipoempleado = id_tipoempleado;
    }

    public String getNombre_tipoemp() {
        return nombre_tipoemp;
    }

    public void setNombre_tipoemp(String nombre_tipoemp) {
        this.nombre_tipoemp = nombre_tipoemp;
    }

    public int getHorastrabajo() {
        return horastrabajo;
    }

    public void setHorastrabajo(int horastrabajo) {
        this.horastrabajo = horastrabajo;
    }

    public float getSalariomin() {
        return salariomin;
    }

    public void setSalariomin(float salariomin) {
        this.salariomin = salariomin;
    }

    public float getSalariomax() {
        return salariomax;
    }

    public void setSalariomax(float salariomax) {
        this.salariomax = salariomax;
    }

    public int getId_tipoempleado() {
        return id_tipoempleado;
    }

    public void setId_tipoempleado(int id_tipoempleado) {
        this.id_tipoempleado = id_tipoempleado;
    }
    
}
