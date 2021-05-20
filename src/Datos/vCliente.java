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
public class vCliente {
    
    private int cliente_id;
    private String nombre_cli;
    private String correo_cli;
    private String tel_cli;
    private float cuenta;
    private char tipopago;
    private int local_id_c;
    private int fecha_llegada;
    private int fecha_salida;

    public vCliente() {
    }

    public vCliente(int cliente_id, String nombre_cli, String correo_cli, String tel_cli, float cuenta, char tipopago, int local_id_c, int fecha_llegada, int fecha_salida) {
        this.cliente_id = cliente_id;
        this.nombre_cli = nombre_cli;
        this.correo_cli = correo_cli;
        this.tel_cli = tel_cli;
        this.cuenta = cuenta;
        this.tipopago = tipopago;
        this.local_id_c = local_id_c;
        this.fecha_llegada = fecha_llegada;
        this.fecha_salida = fecha_salida;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getCorreo_cli() {
        return correo_cli;
    }

    public void setCorreo_cli(String correo_cli) {
        this.correo_cli = correo_cli;
    }

    public String getTel_cli() {
        return tel_cli;
    }

    public void setTel_cli(String tel_cli) {
        this.tel_cli = tel_cli;
    }

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(float cuenta) {
        this.cuenta = cuenta;
    }

    public char getTipopago() {
        return tipopago;
    }

    public void setTipopago(char tipopago) {
        this.tipopago = tipopago;
    }

    public int getLocal_id_c() {
        return local_id_c;
    }

    public void setLocal_id_c(int local_id_c) {
        this.local_id_c = local_id_c;
    }

    public int getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(int fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public int getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(int fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
}
