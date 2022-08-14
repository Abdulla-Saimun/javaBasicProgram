package db.connection.postgrace;

import java.sql.Connection;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        PgConnection db = new PgConnection();
        Connection conn = db.connect_to_db("javaTestDatabase");
            String sql = "INSERT INTO persons (personid, address, city, firstname, lastname)"+
            "values (8, 'jessor', 'khlna', 'sabbir', 'khan')";
        if(conn != null) {
            System.out.println(conn);
        }


    }
}
//org.postgresql.jdbc.PgConnection@34c4973