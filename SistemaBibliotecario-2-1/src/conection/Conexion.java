/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vivie
 */
public class Conexion {

  public static final String URL = "jdbc:mysql://localhost:8889/BibliotecaFEI";
  public static final String USERNAME = "root";
  public static final String PASSWORD = "root";

  public static Connection getConnection() 
      throws SQLException, ClassNotFoundException {
    Connection connection;
      Class.forName("com.mysql.jdbc.Driver");
      connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    
      return connection;
  }

  public static void cerrarConexion(Connection con) {
    try {
      con.close();
    } catch (SQLException e) {
    }
  }
}
