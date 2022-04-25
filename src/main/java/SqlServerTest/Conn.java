
package SqlServerTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    public static Connection getConnexion()
    {
        
        String url = "jdbc:sqlserver://desktop-qs0qsqo\\sqlexpress:1433;Database=Facturas;Trusted_Connection=True;";
        String user = "sa";
        String password = "sqlserver2018";
        
        try 
        {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        } 
        catch (SQLException e) 
        {
            System.out.println("SQLException = " + e);
            return null;
        }
    }
}
