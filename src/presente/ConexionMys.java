/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presente;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Driver;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Jonathan
 */
public class ConexionMys {
    /*
    Connection cn;
    
    public Connection conectar()  {
            
        String host = "jdbc:mysql://190.1.0.131/";
        String user = "22progb01";
        String pass = "userJonathan";
        String bd = "22progb01";
        
        
        try {
            cn=DriverManager.getConnection (host+bd, user, pass);
            
          } 
        catch(SQLException ex){
                           

            JOptionPane.showMessageDialog(null, "ERROR!!"+ex.getMessage());
            System.out.println(ex.getCause()+"ERROR!!!");
                
        }
        return cn;
     }      
    
    */
    private Connection cn;

    public Connection conectar() {

        String host = "jdbc:mysql://localhost/";
        String user = "root";
        String pass = ""; // Deja la contraseña en blanco si no has establecido una
        String bd = "mysql"; // Replace with the real name of your database

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(host + bd, user, pass);
            System.out.println("Conexión exitosa a la base de datos " + bd);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: " + ex.getMessage());
            System.out.println("Error al conectar a la base de datos: " + ex.getCause());
        }

        return cn;
    }

    public void cerrar() {
        try {
            if (cn != null) {
                cn.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión a la base de datos: " + ex.getMessage());
        }
    }
    
}
