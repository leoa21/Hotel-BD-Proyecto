/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Leo21
 */
public class habitacion {

    private int id_habitacion;
    private String numeroHabitacion;

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }
    
      public String toString(){
        return this.numeroHabitacion;
    }
  
    
     public Vector<habitacion> mostrarHabitacion(){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
    
        conexion mysql = new conexion();
        Connection con = mysql.conectar();
        
        Vector<habitacion> datos = new Vector<habitacion>();
        habitacion dat = null;
        
        try{
            
            String sql = "select habitacion_id, numero from habitacion";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            dat = new habitacion(); 
            dat.setId_habitacion(0);
            dat.setNumeroHabitacion("Seleccione el numero de habitación"); 
            datos.add(dat);
            
            
            while(rs.next()){
                
                dat = new habitacion();
                dat.setId_habitacion(rs.getInt("habitacion_id"));
                dat.setNumeroHabitacion(rs.getString("numero")); 
                datos.add(dat);
                
            }
            
            rs.close();
            
        } catch(SQLException e){
            JOptionPane.showConfirmDialog(null, e);
        }
        
        return datos;
    }
     
  
    
}
