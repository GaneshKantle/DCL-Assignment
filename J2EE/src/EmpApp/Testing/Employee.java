package EmpApp.Testing;
import java.sql.*;

public class Employee {
    Connection con = Driver.requestConnection();
    String query =
    PreparedStatement ps = con.prepareStatement(query);
}
