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
public class vLocal {
    
    private int local_id;
    private String descripcion_local;
    private String tel_local;
    private String correo_local;
    private String pais;
    private String estado;
    private String municipio;
    private String colonia;
    private String calle;

    public vLocal() {
    }

    public vLocal(int local_id, String descripcion_local, String tel_local, String correo_local, String pais, String estado, String municipio, String colonia, String calle) {
        this.local_id = local_id;
        this.descripcion_local = descripcion_local;
        this.tel_local = tel_local;
        this.correo_local = correo_local;
        this.pais = pais;
        this.estado = estado;
        this.municipio = municipio;
        this.colonia = colonia;
        this.calle = calle;
    }

    public int getLocal_id() {
        return local_id;
    }

    public void setLocal_id(int local_id) {
        this.local_id = local_id;
    }

    public String getDescripcion_local() {
        return descripcion_local;
    }

    public void setDescripcion_local(String descripcion_local) {
        this.descripcion_local = descripcion_local;
    }

    public String getTel_local() {
        return tel_local;
    }

    public void setTel_local(String tel_local) {
        this.tel_local = tel_local;
    }

    public String getCorreo_local() {
        return correo_local;
    }

    public void setCorreo_local(String correo_local) {
        this.correo_local = correo_local;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
}
