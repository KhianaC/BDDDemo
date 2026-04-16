import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDMLDemo {
    public static void main(String[] args) throws Exception{
            Math m1;
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connection
            String url = "jdbc:mysql://localhost:3306/mydb";
            String username = "root";
            String password = "password";
            ResultSet resultSet = null;
            Connection con = null;
           // String query = "select * from employee";
            String insertQuery = "INSERT INTO employee VALUES (9, 'Mohan', 'Mumbai')";
            try {
                con = DriverManager.getConnection(url, username, password);
                Statement st = con.createStatement();
                boolean execute = st.execute(insertQuery);
                if (execute){
                    ResultSet resultSet1 = st.getResultSet();
                    resultSet1.next();
                    System.out.println(resultSet1.getString(2));
                }else {
                    System.out.println("No of rows updated ==" + st.getUpdateCount());
                }
                /*int count = st.executeUpdate(insertQuery);

                System.out.println("Rows affected: " + count);*/

            } finally {
                if(resultSet != null)
                    resultSet.close();
                if (con != null)
                con.close();
            }
        }
    }

