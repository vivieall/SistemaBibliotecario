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
import sistemabibliotecario.Usuario;

public class SQLMethods {

  public int validarIngreso(String user, String pass) {
    int success = 0;
    try {
      PreparedStatement ps;
      ResultSet rs;

      Connection con = Conexion.getConnection();
      if (con != null) {
        String selectSQL = "SELECT ID,PASSWORD FROM Usuario WHERE  + ID = ?";

        ps = con.prepareStatement(selectSQL);
        ps.setString(1, user);
        rs = ps.executeQuery();

        if (rs.next()) {
          pass = parsePass(pass);
          String password = rs.getString("PASSWORD");
          if (password.equals(pass)) {
            success = 1;
          }
        } else {
          success = 0;
        }
        con.close();
      }else{
        return -1;
      }
    } catch (SQLException |
        NoSuchAlgorithmException |
        UnsupportedEncodingException e) {
      System.out.println(e);
    } catch (Exception e) {

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

  public boolean agregarUsuario(Usuario usuario, String pass) {
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    try {
      connection = Conexion.getConnection();
      ps = connection.prepareStatement("INSERT INTO USUARIO (ID, Nombre, "
          + "Telefono, Dirección, Correo, Tipo, Password) " + "VALUES (?,?,?,?,?,?,?)");
      ps.setString(1, usuario.getId());
      ps.setString(2, usuario.getName());
      ps.setString(3, usuario.getTel());
      ps.setString(4, usuario.getDirec());
      ps.setString(5, usuario.getCorreo());
      ps.setInt(6, 1);
      ps.setString(7, parsePass(pass));
      int res = ps.executeUpdate();
      if (res > 0) {
        JOptionPane.showMessageDialog(null, "Usuario Guardado");
        connection.close();
        return true;
      } else {
        JOptionPane.showMessageDialog(null, "Error al Guardar Usuario");
      }

      connection.close();

    } catch (SQLException | NoSuchAlgorithmException |
        UnsupportedEncodingException | HeadlessException ex) {
      System.out.println(ex);
    }
    return false;
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

  public boolean modificarUsuario(Usuario user) {
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    try {
      connection = Conexion.getConnection();
      ps = connection.prepareStatement("UPDATE USUARIO "
          + "SET Nombre=?, Telefono=?, Dirección=?, Correo=? "
          + "WHERE ID = ?");
      ps.setString(1, user.getName());
      ps.setString(2, user.getTel());
      ps.setString(3, user.getDirec());
      ps.setString(4, user.getCorreo());
      ps.setString(5, user.getId());
      int res = ps.executeUpdate();
      if (res > 0) {
        JOptionPane.showMessageDialog(null, "Usuario Modificado");
        connection.close();
        return true;
      } else {
        JOptionPane.showMessageDialog(null, "Error al Modificar Usuario");
      }
      connection.close();
    } catch (SQLException | HeadlessException ex) {
      System.out.println(ex);
    }
    return false;
  }

  public Usuario consultarUsuario(String ID) {
    Usuario us = new Usuario();
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    try {
      connection = Conexion.getConnection();
      ps = connection.prepareStatement("SELECT * from USUARIO WHERE ID = ?");
      ps.setString(1, ID);
      rs = ps.executeQuery();
      if (rs.next()) {
        us.setId(rs.getString(1));
        us.setName(rs.getString("nombre"));
        us.setTel(rs.getString("telefono"));
        us.setDirec(rs.getString("dirección"));
        us.setCorreo(rs.getString("correo"));
      }

      connection.close();
    } catch (Exception e) {

    }
    return us;
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
