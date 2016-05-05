/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;
import conection.Conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Vivie
 */
public class Servicios {
  
    public void registrarPrestamo(String numFolio, String ID) {
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    try {
      connection = Conexion.getConnection();
      ps = connection.prepareStatement("INSERT INTO PRESTAMO(numFolio, ID,");
      ps.setString(1, ID);
      ps.setString(2, numFolio);
      int res = ps.executeUpdate();
      if (res > 0) {
        JOptionPane.showMessageDialog(null, "Se registró el préstamo.");
      } else {
        JOptionPane.showMessageDialog(null, "No se pudo registrar el préstamo.");
      }
      connection.close();
    } catch (SQLException | HeadlessException ex) {
      System.out.println(ex);
    }
  }
  
}
