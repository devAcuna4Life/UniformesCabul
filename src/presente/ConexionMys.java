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
    
    
    
}
