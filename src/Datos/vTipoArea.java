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
public class vTipoArea {
   private String id_tipoa;
    private String nombre_ta;
    private String descripcion_ta;

    public vTipoArea() {
    }

    public vTipoArea(String id_tipoa, String nombre_ta, String descripcion_ta) {
        this.id_tipoa = id_tipoa;
        this.nombre_ta = nombre_ta;
        this.descripcion_ta = descripcion_ta;
    }

    public String getId_tipoa() {
        return id_tipoa;
    }

    public void setId_tipoa(String id_tipoa) {
        this.id_tipoa = id_tipoa;
    }

    public String getNombre_ta() {
        return nombre_ta;
    }

    public void setNombre_ta(String nombre_ta) {
        this.nombre_ta = nombre_ta;
    }

    public String getDescripcion_ta() {
        return descripcion_ta;
    }

    public void setDescripcion_ta(String descripcion_ta) {
        this.descripcion_ta = descripcion_ta;
    }
}
