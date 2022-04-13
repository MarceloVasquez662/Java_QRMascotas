/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qrmascota;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Clock;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class conexion {
    
    private static Connection cn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String contrasenia = "";
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    
    public conexion() {
        cn = null;
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url, user, contrasenia);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error Clase");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La base de datos no esta activa, consulte con el administrador");
            System.exit(0);
        }
    }
    
    public Connection getConnection() {
        return cn;
    }
}
