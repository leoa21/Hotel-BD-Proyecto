/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Leo21
 */
public class conexion {
    
    public String url = "jdbc:mysql://localhost:3306/hotel";
    public String user = "root";
    public String pass = "B1oodb4nk";

    public conexion() {
    }
    
    public Connection conectar(){
        Connection link = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        
        return link;
    }
}
