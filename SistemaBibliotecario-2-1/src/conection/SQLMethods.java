/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SQLMethods {

  public boolean validarIngreso(String user, String pass) {
    boolean success = false;
    try {
      PreparedStatement ps;
      ResultSet rs;

      Connection con = Conexion.getConnection();
      String selectSQL = "SELECT ID,PASSWORD FROM Usuario WHERE  + ID = ?";
      System.out.println(selectSQL);

      ps = con.prepareStatement(selectSQL);
      ps.setString(1, user);
      rs = ps.executeQuery();

      if (rs.next()) {
        pass = parsePass(pass);
        String password = rs.getString("PASSWORD");
        if (password.equals(pass)) {
          success = true;
        }
      } else {
        success = false;
      }
      con.close();
    } catch (SQLException |
            NoSuchAlgorithmException |
            UnsupportedEncodingException e) {
      System.out.println(e);
    }
    return success;
  }

  private String parsePass(String pass)
          throws NoSuchAlgorithmException, UnsupportedEncodingException {
    MessageDigest md;
    md = MessageDigest.getInstance("SHA-256");
    md.update(pass.getBytes("UTF-8"));
    byte[] dPass = md.digest();
    BigInteger bigInt = new BigInteger(1, dPass);
    String hashTxt = bigInt.toString(16);
    return hashTxt;
  }

  public void insertPass(String pass) {
    PreparedStatement ps;
    ResultSet rs;
    try {
      Connection con = Conexion.getConnection();
      pass = parsePass(pass);
      String selectSQL = "UPDATE USUARIO SET PASSWORD='" + pass
              + "' WHERE ID = 'Vivie'";
      ps = con.prepareStatement(selectSQL);
      ps.execute(selectSQL);
      con.close();
    } catch (SQLException |
            NoSuchAlgorithmException |
            UnsupportedEncodingException e) {
      System.out.println(e);
    }

  }

  public void agregarUsuario(String id, String nombre, String tel, String dir,
          String email, int type, String pass) {
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    try {
      connection = Conexion.getConnection();
      ps = connection.prepareStatement("INSERT INTO USUARIO (ID, Nombre, "
              + "Telefono, Direccion, Correo, Tipo, Password) " + "VALUES (?,?,?,?,?,?,?)");
      ps.setString(1, id);
      ps.setString(2, nombre);
      ps.setString(3, tel);
      ps.setString(4, dir);
      ps.setString(5, email);
      ps.setInt(6, type);
      ps.setString(7, parsePass(pass));
      int res = ps.executeUpdate();
      if (res > 0) {
        JOptionPane.showMessageDialog(null, "Usuario Guardado");
      } else {
        JOptionPane.showMessageDialog(null, "Error al Guardar Usuario");
      }

      connection.close();

    } catch (SQLException | NoSuchAlgorithmException |
            UnsupportedEncodingException | HeadlessException ex) {
      System.out.println(ex);
    }
  }

  public void eliminarUsuario(String id) {
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    try {
      connection = Conexion.getConnection();
      ps = connection.prepareStatement("DELETE FROM USUARIO WHERE id=?");
      ps.setString(1, id);
      int res = ps.executeUpdate();
      if (res > 0) {
        JOptionPane.showMessageDialog(null, "Usuario Eliminado");
      } else {
        JOptionPane.showMessageDialog(null, "Error al Eliminar Usuario");
      }

      connection.close();

    } catch (SQLException | HeadlessException ex) {
      System.out.println(ex);
    }
  }

  public void modificarUsuario(String id, String nombre, String tel, String dir,
          String email, int type, String pass) {
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    try {
      connection = Conexion.getConnection();
      ps = connection.prepareStatement("UPDATE USUARIO "
              + "SET ID=?, Nombre=?, Telefono=?, Direccion=?, Correo=?, "
              + "Tipo=?, Password=? WHERE id=?");
      ps.setString(1, id);
      ps.setString(2, nombre);
      ps.setString(3, tel);
      ps.setString(4, dir);
      ps.setString(5, email);
      ps.setInt(6, type);
      ps.setString(7, parsePass(pass));
      ps.setString(8, id);
      int res = ps.executeUpdate();
      if (res > 0) {
        JOptionPane.showMessageDialog(null, "Usuario Modificado");
      } else {
        JOptionPane.showMessageDialog(null, "Error al Modificar Usuario");
      }
      connection.close();
    } catch (SQLException | NoSuchAlgorithmException |
            UnsupportedEncodingException | HeadlessException ex) {
      System.out.println(ex);
    }
  }

  public ArrayList registrarPrestamo(String numFolio) {
    //POR IMPLEMENTAR.
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    //ArrayList<String> user = new ArrayList();
    try {
      connection = Conexion.getConnection();
      ps = connection.prepareStatement("SELECT * FROM MATERIAL WHERE numFolio=?");
      ps.setString(1, numFolio);
      rs = ps.executeQuery();
      if (rs.next()) {
        //user.set(0, rs.getString("ID"));
        //return user;
      } else {
        JOptionPane.showMessageDialog(null,
                "No existe el Usuario " + numFolio + ".");
      }
      connection.close();
    } catch (SQLException | HeadlessException ex) {
      System.out.println(ex);
    }
    return null;
  }

}
