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
public class cargoExtra {
    private int id;
    private float precio;
    private String nombre;

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString(){
        return this.nombre;
    }
    
    public Vector<cargoExtra> mostrarCargoExtra(){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
    
        conexion mysql = new conexion();
        Connection con = mysql.conectar();
        
        Vector<cargoExtra> datos = new Vector<cargoExtra>();
        cargoExtra dat = null;
        
        try{
            String sql = "select c_cargoextra_id, descripcion_c from catalog_cargoextra";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            dat = new cargoExtra();
            
            dat.setId(0);
            dat.setNombre("Selecciona cargo"); //Primera opcion del combobox
            datos.add(dat);
            
            
            while(rs.next()){
                
                dat = new cargoExtra();
                dat.setId(rs.getInt("c_cargoextra_id"));
                dat.setNombre(rs.getString("descripcion_c")); 
                datos.add(dat);
                
            }
            
            rs.close();
            
        } catch(SQLException e){
            JOptionPane.showConfirmDialog(null, e);
        }
        
        return datos;
    }
    
     public Vector<cargoExtra> mostrarPrecioUnitario(){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
    
        conexion mysql = new conexion();
        Connection con = mysql.conectar();
        
        Vector<cargoExtra> datos = new Vector<cargoExtra>();
        cargoExtra dat = null;
        
        try{
            String sql = "select c_cargoextra_id, precio_c from catalog_cargoextra";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            dat = new cargoExtra();
            
            dat.setId(0);
            dat.setNombre("Selecciona cargo"); //Primera opcion del combobox
            datos.add(dat);
            
            
            while(rs.next()){
                
                dat = new cargoExtra();
                dat.setId(rs.getInt("c_cargoextra_id"));
                dat.setPrecio(rs.getFloat("precio_c")); 
                datos.add(dat);
                
            }
            
            rs.close();
            
        } catch(SQLException e){
            JOptionPane.showConfirmDialog(null, e);
        }
        
        return datos;
    }
    
    
    
    
    
    
}
