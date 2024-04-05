import java.sql.*;

// java Database Connectivity

// 1. import -----> java.sql
// 2. load and register the driver -----> com.mysql.jdbc.Driver
// 3. Establish a connection ----->
// 4. Create a statement
// 5. Execute a query
// 6. Process the results
// 7. close()

public class Main {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/hotels";
        String userName = "root";
        String password = "";
        String query = "Select username from student where userid = 3";


        String query1 = "Select * from student"; // Special case


        Class.forName("java.sql.Driver");
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        int count = st.executeUpdate("");



        rs.next();

        String name = rs.getString("username");

        System.out.println(name);


        while (rs.next()) {
            String userData = rs.getInt(1) + " : " + rs.getString(2);

            System.out.println(userData);
        }


        con.close();
        st.close();
    }
}