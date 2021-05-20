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
public class vEmpleado {
    private int id_emp ;
    private String nombre_emp;
    private String correo_emp;
    private String tel_emp;
    private float sueldo;
    private String pais;
    private String estado;
    private String municipio;
    private String colonia ;
    private String calle;
    private int local_id_e;
    private int id_tipoempleado_e;

    public vEmpleado() {
    }

    public vEmpleado(int id_emp, String nombre_emp, String correo_emp, String tel_emp, float sueldo, String pais, String estado, String municipio, String colonia, String calle, int local_id_e, int id_tipoempleado_e) {
        this.id_emp = id_emp;
        this.nombre_emp = nombre_emp;
        this.correo_emp = correo_emp;
        this.tel_emp = tel_emp;
        this.sueldo = sueldo;
        this.pais = pais;
        this.estado = estado;
        this.municipio = municipio;
        this.colonia = colonia;
        this.calle = calle;
        this.local_id_e = local_id_e;
        this.id_tipoempleado_e = id_tipoempleado_e;
    }

    public int getId_emp() {
        return id_emp;
    }

    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }

    public String getNombre_emp() {
        return nombre_emp;
    }

    public void setNombre_emp(String nombre_emp) {
        this.nombre_emp = nombre_emp;
    }

    public String getCorreo_emp() {
        return correo_emp;
    }

    public void setCorreo_emp(String correo_emp) {
        this.correo_emp = correo_emp;
    }

    public String getTel_emp() {
        return tel_emp;
    }

    public void setTel_emp(String tel_emp) {
        this.tel_emp = tel_emp;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
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

    public int getLocal_id_e() {
        return local_id_e;
    }

    public void setLocal_id_e(int local_id_e) {
        this.local_id_e = local_id_e;
    }

    public int getId_tipoempleado_e() {
        return id_tipoempleado_e;
    }

    public void setId_tipoempleado_e(int id_tipoempleado_e) {
        this.id_tipoempleado_e = id_tipoempleado_e;
    }
}
