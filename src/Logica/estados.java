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
public class estados {
    
    private int id;
    private String nombre;

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
    
    public Vector<estados> mostrarEstados(){
        
           PreparedStatement ps = null;
        ResultSet rs = null;
    
        conexion mysql = new conexion();
        Connection con = mysql.conectar();
        
        Vector<estados> datos = new Vector<estados>();
        estados dat = null;
        
        try{
            String sql = "select estado_id, descripcion from pais_estado";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            dat = new estados();
            
            dat.setId(0);
            dat.setNombre("Selecciona estado"); //Primera opcion del combobox
            datos.add(dat);
            
            
            while(rs.next()){
                
                dat = new estados();
            
                dat.setId(rs.getInt("estado_id"));
                dat.setNombre(rs.getString("descripcion")); 
                datos.add(dat);
                
            }
            
            rs.close();
            
        } catch(SQLException e){
            JOptionPane.showConfirmDialog(null, e);
        }
        
        return datos;
    }
    
    
}
