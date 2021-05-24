
package Logica;

import Datos.vCheckIn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class fCheckOut {
    
    private conexion mysql= new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL= "";
    public Integer totalregistros;
    
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos= {"Nombre","Teléfono","Sexo","Correo","Fecha CheckIn", "No.Habitación", "Precio","Tipo Pago"};
        String [] registro = new String [8];
        
        totalregistros=0;
        
        modelo = new DefaultTableModel (null,titulos);
        
        sSQL="select *from Cliente_Habitacion where num="+buscar;
                
    
        try {
            Statement st = cn.createStatement();
            ResultSet rs= st.executeQuery(sSQL);
            
            while(rs.next()){
                registro [0]=rs.getString("nombre_cli");
                registro [1]=rs.getString("tel_cli");
                registro [2]=rs.getString("sexo_cli");
                registro [3]=rs.getString("correo_cli");
                registro [4]=rs.getString("fecha_llegada");
                registro [5]=rs.getString("num");
                registro [6]=rs.getString("cuenta");
                registro [7]=rs.getString("tipopago");
                
                
                totalregistros++;
                modelo.addRow(registro);
                
                
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
 
    public boolean eliminar (vCheckIn dts){
        sSQL="update Cliente_Habitacion set num=0 where num=?";
                
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
            pst.setInt(1, dts.getNum());
            
            
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
