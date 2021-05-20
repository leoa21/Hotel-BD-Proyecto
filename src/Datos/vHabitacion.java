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
public class vHabitacion {
    
    private int habitacion_id;
    private int id_tipohabitacion_h;
    private int local_id_h ;
    private int id_cliente_h;
    private int id_servicio_h;
    private int numero;
    private int num_camas;
    private char disponibilidad;

    public vHabitacion() {
    }

    public vHabitacion(int habitacion_id, int id_tipohabitacion_h, int local_id_h, int id_cliente_h, int id_servicio_h, int numero, int num_camas, char disponibilidad) {
        this.habitacion_id = habitacion_id;
        this.id_tipohabitacion_h = id_tipohabitacion_h;
        this.local_id_h = local_id_h;
        this.id_cliente_h = id_cliente_h;
        this.id_servicio_h = id_servicio_h;
        this.numero = numero;
        this.num_camas = num_camas;
        this.disponibilidad = disponibilidad;
    }

    public int getHabitacion_id() {
        return habitacion_id;
    }

    public void setHabitacion_id(int habitacion_id) {
        this.habitacion_id = habitacion_id;
    }

    public int getId_tipohabitacion_h() {
        return id_tipohabitacion_h;
    }

    public void setId_tipohabitacion_h(int id_tipohabitacion_h) {
        this.id_tipohabitacion_h = id_tipohabitacion_h;
    }

    public int getLocal_id_h() {
        return local_id_h;
    }

    public void setLocal_id_h(int local_id_h) {
        this.local_id_h = local_id_h;
    }

    public int getId_cliente_h() {
        return id_cliente_h;
    }

    public void setId_cliente_h(int id_cliente_h) {
        this.id_cliente_h = id_cliente_h;
    }

    public int getId_servicio_h() {
        return id_servicio_h;
    }

    public void setId_servicio_h(int id_servicio_h) {
        this.id_servicio_h = id_servicio_h;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNum_camas() {
        return num_camas;
    }

    public void setNum_camas(int num_camas) {
        this.num_camas = num_camas;
    }

    public char getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(char disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
