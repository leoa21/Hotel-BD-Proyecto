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
public class vCargoExtra {
        
     private int id_cargoextra;
    private String nombre_cargoextra;
    private float costo;
    private int fecha_ce;
    private int cantidad_ce;

    public vCargoExtra() {
    }

    public vCargoExtra(int id_cargoextra, String nombre_cargoextra, float costo, int fecha_ce, int cantidad_ce) {
        this.id_cargoextra = id_cargoextra;
        this.nombre_cargoextra = nombre_cargoextra;
        this.costo = costo;
        this.fecha_ce = fecha_ce;
        this.cantidad_ce = cantidad_ce;
    }

    public int getId_cargoextra() {
        return id_cargoextra;
    }

    public void setId_cargoextra(int id_cargoextra) {
        this.id_cargoextra = id_cargoextra;
    }

    public String getNombre_cargoextra() {
        return nombre_cargoextra;
    }

    public void setNombre_cargoextra(String nombre_cargoextra) {
        this.nombre_cargoextra = nombre_cargoextra;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getFecha_ce() {
        return fecha_ce;
    }

    public void setFecha_ce(int fecha_ce) {
        this.fecha_ce = fecha_ce;
    }

    public int getCantidad_ce() {
        return cantidad_ce;
    }

    public void setCantidad_ce(int cantidad_ce) {
        this.cantidad_ce = cantidad_ce;
    }
}
