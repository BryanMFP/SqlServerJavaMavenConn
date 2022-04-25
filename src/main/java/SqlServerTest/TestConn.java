
package SqlServerTest;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConn {
    public static void main(String[] args) {
        try {
            //System.out.println(Conn.getConnexion());
            Statement stmt = Conn.getConnexion().createStatement();
            
            String query = "SELECT * FROM Facturas.dbo.Cliente";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) 
            {
                System.out.println("rs = " + rs.getString(1));
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Exception conection = " + e);
        }
    }
}
