/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Vivie
 */
public class Conexion {

  public static final String URL = "jdbc:mysql://localhost/BibliotecaFEI";
  public static final String USERNAME = "root";
  public static final String PASSWORD = "root";

  public static Connection getConnection() {
    Connection connection = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    } catch (ClassNotFoundException | SQLException e) {
      
      JOptionPane.showMessageDialog(null,
          "Falló la conexión a la base de datos",
          "Error",
          JOptionPane.ERROR_MESSAGE);

      System.out.println(e);
    }
      return connection;
  }

  public void cerrarConexion(Connection con) {
    try {
      con.close();
    } catch (SQLException e) {
    }
  }
}
