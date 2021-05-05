
package supermen_security;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dbcon {
    
     public static Connection getConne(){
         Connection conn = null;
        try {
                Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/supermen", "root", "1234");
                System.out.println("connection to the database");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
        
       
        
    }
    
}
