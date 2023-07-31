/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author baomt
 */
public class DatabaseHelper {

    public static Connection connectDb() {
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=QLSIEUTHI;"
                    + "user=sa;password=12345;"
                    + "encrypt=true;"
                    + "trustServerCertificate=true;";
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
