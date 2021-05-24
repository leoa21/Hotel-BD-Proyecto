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
    private float costo;
    private String fecha_ce;
    private int cantidad_ce;
    private int habitacion_id;
    private int cce_cargoextra;

    public vCargoExtra(int id_cargoextra, float costo, String fecha_ce, int cantidad_ce, int habitacion_id, int cce_cargoextra) {
        this.id_cargoextra = id_cargoextra;
        this.costo = costo;
        this.fecha_ce = fecha_ce;
        this.cantidad_ce = cantidad_ce;
        this.habitacion_id = habitacion_id;
        this.cce_cargoextra = cce_cargoextra;
    }
    
    public vCargoExtra(){
        
    }

    public int getId_cargoextra() {
        return id_cargoextra;
    }

    public void setId_cargoextra(int id_cargoextra) {
        this.id_cargoextra = id_cargoextra;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getFecha_ce() {
        return fecha_ce;
    }

    public void setFecha_ce(String fecha_ce) {
        this.fecha_ce = fecha_ce;
    }

    public int getCantidad_ce() {
        return cantidad_ce;
    }

    public void setCantidad_ce(int cantidad_ce) {
        this.cantidad_ce = cantidad_ce;
    }

    public int getHabitacion_id() {
        return habitacion_id;
    }

    public void setHabitacion_id(int habitacion_id) {
        this.habitacion_id = habitacion_id;
    }

    public int getCce_cargoextra() {
        return cce_cargoextra;
    }

    public void setCce_cargoextra(int cce_cargoextra) {
        this.cce_cargoextra = cce_cargoextra;
    }
    
    

    
    
   
    
}
