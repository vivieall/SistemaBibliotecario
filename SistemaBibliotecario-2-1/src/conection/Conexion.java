/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Vivie
 */
public class Conexion {
    
    public static final String URL = "jdbc:mysql://localhost:8889/BibliotecaFEI";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";
    

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
    
    public void cerrarConexion (Connection con){
      try{
        con.close();
      }catch(SQLException e){
      }
    }
}
