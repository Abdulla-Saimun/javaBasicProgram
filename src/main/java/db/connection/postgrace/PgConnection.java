package db.connection.postgrace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PgConnection {
    public Connection connect_to_db(String dbName) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbName, "postgres", "saimun");
            if(conn != null ) {
                System.out.println("connection established");

            } else {
                System.out.println("connection failed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }
}

//    String sql = "INSERT INTO persons (personid, address, city, firstname, lastname)"+
//            "values (5, 'jessor', 'khlna', 'sabbir', 'khan')";
//    Statement statement = conn.createStatement();
//    int rows = statement.executeUpdate(sql);
//                conn.close();