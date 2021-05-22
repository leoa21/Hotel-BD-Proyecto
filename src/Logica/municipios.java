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
public class municipios {
    
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
    
    public Vector<municipios> mostrarMunicipios(Integer idEstado){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
    
        conexion mysql = new conexion();
        Connection con = mysql.conectar();
        
        Vector<municipios> datos = new Vector<municipios>();
        municipios dat = null;
        
        try{
            String sql = "select * from estado_municipio where estado_id =" +idEstado;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            dat = new municipios();
            
            dat.setId(0);
            dat.setNombre("Seleccione el municipio"); //Primera opcion del combobox
            datos.add(dat);
            
            
            while(rs.next()){
                
                dat = new municipios();
            
                dat.setId(rs.getInt("municipio_id"));
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
