
package myCodes;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chame
 */
public class DBconnect {
    
    
    public static Connection connect()
    {
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/uni","root", "root");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
         
        return conn;
    }
    
    
}

