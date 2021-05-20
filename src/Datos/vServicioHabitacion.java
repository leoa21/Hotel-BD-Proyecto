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
public class vServicioHabitacion {
    private String nom_servicio;
    private int id_servicio;
    private int cantidad_sh;
    private int fecha_sh;
    private float costo_servicio ;
    private int habitacion_id_s;
    private int id_emp_s ;

    public vServicioHabitacion() {
    }

    public vServicioHabitacion(String nom_servicio, int id_servicio, int cantidad_sh, int fecha_sh, float costo_servicio, int habitacion_id_s, int id_emp_s) {
        this.nom_servicio = nom_servicio;
        this.id_servicio = id_servicio;
        this.cantidad_sh = cantidad_sh;
        this.fecha_sh = fecha_sh;
        this.costo_servicio = costo_servicio;
        this.habitacion_id_s = habitacion_id_s;
        this.id_emp_s = id_emp_s;
    }

    public String getNom_servicio() {
        return nom_servicio;
    }

    public void setNom_servicio(String nom_servicio) {
        this.nom_servicio = nom_servicio;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public int getCantidad_sh() {
        return cantidad_sh;
    }

    public void setCantidad_sh(int cantidad_sh) {
        this.cantidad_sh = cantidad_sh;
    }

    public int getFecha_sh() {
        return fecha_sh;
    }

    public void setFecha_sh(int fecha_sh) {
        this.fecha_sh = fecha_sh;
    }

    public float getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(float costo_servicio) {
        this.costo_servicio = costo_servicio;
    }

    public int getHabitacion_id_s() {
        return habitacion_id_s;
    }

    public void setHabitacion_id_s(int habitacion_id_s) {
        this.habitacion_id_s = habitacion_id_s;
    }

    public int getId_emp_s() {
        return id_emp_s;
    }

    public void setId_emp_s(int id_emp_s) {
        this.id_emp_s = id_emp_s;
    }
}
