/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qrmascota;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class conexion {

    private static Connection cn;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "UVIpChcjd2";
    private static final String contrasenia = "O2I8Lsie03";
    private static final String url = "jdbc:mysql://remotemysql.com:3306/UVIpChcjd2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    ;

    public conexion() {
        cn = null;
        try {
            Class.forName(driver);
            cn = DriverManager.getConnection(url, user, contrasenia);
            System.out.println("conectada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La base de datos no esta activa o se supero el limite de conexiones, consulte con el administrador");
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        return cn;
    }
}
