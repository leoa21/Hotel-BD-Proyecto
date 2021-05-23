/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.vCargoExtra;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leo21
 */
public class fHabitacionesRecepcion_CargoExtra {
    
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public float totalConsumo;
    
    public DefaultTableModel mostrar(int buscar){
        
        DefaultTableModel modelo;
        
        String [] titulos= {"ID Cargo Extra", "id_habitacion", "id_cargoextra", "descripcion", "precio", "cantidad", "fecha"};
        String [] registro = new String [8];
        
        totalConsumo = 0;
        
        modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "select ce.id_cargoextra, ce.habitacion_id_ce, ce.c_cargoextra_id,cce.descripcion_c, cce.precio_c, ce.cantidad_ce ,ce.fecha_ce from cargoextra ce inner join catalog_cargoextra cce on ce.c_cargoextra_id = cce.c_cargoextra_id where habitacion_id_ce= " + buscar + " order by id_cargoextra desc";
        
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
                
                registro [0] =rs.getString("id_cargoextra");
                registro [1] =rs.getString("habitacion_id_ce");
                registro [2] =rs.getString("c_cargoextra_id");
                registro [3] =rs.getString("descripcion_c");
                registro [4] =rs.getString("precio");
                registro [6] =rs.getString("cantidad_ce");
                registro [7] =rs.getString("fecha_c");
                
                totalConsumo = totalConsumo + (rs.getFloat("cantidad_ce") * rs.getFloat("PrecioUnitario"));
                
                modelo.addRow(registro);
               
            }
            
         return modelo;
  
        }   catch(Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
        
    }
    
    
    public boolean insertar(vCargoExtra dts){
     
       
        sSQL="insert into cargoextra (id_cargoextra,habitacion_id_ce, c_cargoextra_id, costo, fecha_ce, cantidad_ce)"+
                "values (?,?,?,?,?,?)";
        
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getId_cargoextra());
            pst.setInt(2, dts.getHabitacion_id());
            pst.setInt(3, dts.getCce_cargoextra());
            pst.setFloat(4, dts.getC_cargoextra());
            pst.setString(5, dts.getFecha_ce());
            pst.setInt(6, dts.getCantidad_ce());
            
            
            
            int n=pst.executeUpdate();
            
            if(n!=0){
                return true;
            }
            else{
                return false;
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        
    }
   
    
    public boolean eliminar(vCargoExtra dts){
        sSQL="delete from cargoextra where id_cargoextra=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
            pst.setInt(1,dts.getId_cargoextra());
            
            int n=pst.executeUpdate();
            
            if(n!=0){
                return true;
            }
            else{
                return false;
            }
        } catch (Exception e) {
           JOptionPane.showConfirmDialog(null,e);  
           return false;
        }
    }
   
    
    
}
