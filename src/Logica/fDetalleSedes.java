/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.vLocal;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leo21
 */
public class fDetalleSedes {
    
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    public DefaultTableModel mostrar(String buscar){
        
        DefaultTableModel modelo;
        
        String [] titulos= {"Local ID", "Descripción", "Teléfono", "Correo", "País", "Estado", "Municipio", "Colonia", "Calle"};
        String [] registro = new String [10];
        
        modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "select * from loc where estado like '%" + buscar + "%' or municipio like '%" + buscar + "%' order by local_id";
        
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
                
                registro [0] =rs.getString("local_id");
                registro [1] =rs.getString("descripcion_local");
                registro [2] =rs.getString("tel_local");
                registro [3] =rs.getString("correo_local");
                registro [4] =rs.getString("pais");
                registro [5] =rs.getString("estado");
                registro [6] =rs.getString("municipio");
                registro [7] =rs.getString("colonia");
                registro [8] =rs.getString("calle");
                
                modelo.addRow(registro);
            }
            
         return modelo;
  
        }   catch(Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
        
    }
    
    
    public boolean insertar(vLocal dts){
     
       
        sSQL="insert into loc (descripcion_local, tel_local,correo_local, pais,estado,municipio,colonia,calle, local_id)"+
                "values (?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1,dts.getDescripcion_local());
            pst.setString(2,dts.getTel_local());
            pst.setString(3,dts.getCorreo_local());
            pst.setString(4,dts.getPais());
            pst.setString(5,dts.getEstado());
            pst.setString(6,dts.getMunicipio());
            pst.setString(7,dts.getColonia());
            pst.setString(8,dts.getCalle());
            pst.setInt(9,dts.getLocal_id());
            
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
    
    public boolean editar(vLocal dts){
        sSQL="update loc set descripcion_local=?,tel_local=?,correo_local=?, pais=?,estado=?,municipio=?,colonia=?,calle=?"+
                "where local_id=?";
        try {
     
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1,dts.getDescripcion_local());
            pst.setString(2,dts.getTel_local());
            pst.setString(3,dts.getCorreo_local());
            pst.setString(4,dts.getPais());
            pst.setString(5,dts.getEstado());
            pst.setString(6,dts.getMunicipio());
            pst.setString(7,dts.getColonia());
            pst.setString(8,dts.getCalle());
            pst.setInt(9,dts.getLocal_id());
            
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
    
    public boolean eliminar(vLocal dts){
        sSQL="delete from loc where local_id=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
            pst.setInt(1,dts.getLocal_id());
            
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
