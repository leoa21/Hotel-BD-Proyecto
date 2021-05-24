
package Logica;

import Datos.vDetalleEmpleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class fDetalleEmpleado {
    
    private conexion mysql= new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL= "";
    public Integer totalregistros;
    
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos= {"ID", "Nombre","Correo", "Teléfono", "Tipo Empleado", "Sueldo", "Turno", "Sexo", "País", "Estado", "Municipio", "Colonia", "Calle", "Local ID"};
        String [] registro = new String [14];
        
        totalregistros=0;
        
        modelo = new DefaultTableModel (null,titulos);
        
        sSQL="select id_emp, nombre_emp, correo_emp, tel_emp, id_tipoempleado_e,sueldo, turno, sexo_emp,pais, estado, municipio, colonia, calle, local_id_e"+
                " from empleado where id_emp like '"+buscar+"%'";
    
        try {
            Statement st = cn.createStatement();
            ResultSet rs= st.executeQuery(sSQL);
            
            while(rs.next()){
                registro [0]=rs.getString("id_emp");
                registro [1]=rs.getString("nombre_emp");
                registro [2]=rs.getString("correo_emp");
                registro [3]=rs.getString("tel_emp");
                registro [4]=rs.getString("id_tipoempleado_e");
                registro [5]=rs.getString("sueldo");
                registro [6]=rs.getString("turno");
                registro [7]=rs.getString("sexo_emp");
                registro [8]=rs.getString("pais");
                registro [9]=rs.getString("estado");
                registro [10]=rs.getString("municipio");
                registro [11]=rs.getString("colonia");
                registro [12]=rs.getString("calle");
                registro [13]=rs.getString("local_id_e");
                
                totalregistros++;
                modelo.addRow(registro);
                
                
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertar (vDetalleEmpleado dts){
        
        sSQL="insert into empleado (id_emp,nombre_emp, correo_emp, tel_emp, id_tipoempleado_e, sueldo, turno, sexo_emp,"+
                "pais,estado,municipio, colonia, calle)"+
                "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
     
        try {
            
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
            pst.setInt(1, dts.getId_emp());
            pst.setString(2, dts.getNombre_emp());
            pst.setString(3, dts.getCorreo_emp());
            pst.setString(4, dts.getTel_emp());
            pst.setInt(5, dts.getId_tipoempleado_e());
            pst.setDouble(6, dts.getSueldo());
            pst.setString(7, dts.getTurno());
            pst.setString(8, dts.getSexo_emp());
            pst.setString(9, dts.getPais());
            pst.setString(10, dts.getEstado());
            pst.setString(11, dts.getMunicipio());
            pst.setString(12, dts.getColonia());
            pst.setString(13, dts.getCalle());
            //pst.setInt(13, dts.getLocal_id_e());
            
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
    
    public boolean editar (vDetalleEmpleado dts){
        sSQL="update empleado set nombre_emp=?, correo_emp=?, tel_emp=?, id_tipoempleado_e=?, sueldo=?, turno=?, sexo_emp=?,"+
                "pais=?,estado=?,municipio=?, colonia=?, calle=?"+
                "where id_emp =?";
        try {
            
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNombre_emp());
            pst.setString(2, dts.getCorreo_emp());
            pst.setString(3, dts.getTel_emp());
            pst.setInt(4, dts.getId_tipoempleado_e());
            pst.setDouble(5, dts.getSueldo());
            pst.setString(6, dts.getTurno());
            pst.setString(7, dts.getSexo_emp());
            pst.setString(8, dts.getPais());
            pst.setString(9, dts.getEstado());
            pst.setString(10, dts.getMunicipio());
            pst.setString(11, dts.getColonia());
            pst.setString(12, dts.getCalle());
            //pst.setInt(13, dts.getLocal_id_e());
            pst.setInt(13, dts.getId_emp());
            
            
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
    
    public boolean eliminar (vDetalleEmpleado dts){
        sSQL="delete from empleado where id_emp=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
            pst.setInt(1, dts.getId_emp());
            
            
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
    
}
