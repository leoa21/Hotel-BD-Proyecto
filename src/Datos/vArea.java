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
public class vArea {
    
    private int id_area;
    private int id_tipoar;
    private String nombre_a;

    public vArea() {
    }

    public vArea(int id_area, int id_tipoar, String nombre_a) {
        this.id_area = id_area;
        this.id_tipoar = id_tipoar;
        this.nombre_a = nombre_a;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public int getId_tipoar() {
        return id_tipoar;
    }

    public void setId_tipoar(int id_tipoar) {
        this.id_tipoar = id_tipoar;
    }

    public String getNombre_a() {
        return nombre_a;
    }

    public void setNombre_a(String nombre_a) {
        this.nombre_a = nombre_a;
    }

}
