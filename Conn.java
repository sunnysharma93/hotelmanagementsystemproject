import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn  {
    // constructor
    Connection c;
    Statement s;
    Conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem","root","2547");
            // create the statement
            s = c.createStatement();
        }catch(Exception e){
          e.printStackTrace();
        }
    }


}
