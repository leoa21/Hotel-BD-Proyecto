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
public class vTipoHabitacion {
    private int id_tipohabitacion;
    private String nombre_th;
    private String descripcion_th;
    private float precio;
    private int capacidad;

    public vTipoHabitacion() {
    }

    public vTipoHabitacion(int id_tipohabitacion, String nombre_th, String descripcion_th, float precio, int capacidad) {
        this.id_tipohabitacion = id_tipohabitacion;
        this.nombre_th = nombre_th;
        this.descripcion_th = descripcion_th;
        this.precio = precio;
        this.capacidad = capacidad;
    }

    public int getId_tipohabitacion() {
        return id_tipohabitacion;
    }

    public void setId_tipohabitacion(int id_tipohabitacion) {
        this.id_tipohabitacion = id_tipohabitacion;
    }

    public String getNombre_th() {
        return nombre_th;
    }

    public void setNombre_th(String nombre_th) {
        this.nombre_th = nombre_th;
    }

    public String getDescripcion_th() {
        return descripcion_th;
    }

    public void setDescripcion_th(String descripcion_th) {
        this.descripcion_th = descripcion_th;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
