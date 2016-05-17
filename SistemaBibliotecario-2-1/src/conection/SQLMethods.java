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

  public static int validarIngreso(String user, String pass) {
    int success = 0;
    Connection con = null;
    try {
      PreparedStatement ps;
      ResultSet rs;

      con = Conexion.getConnection();
      if (con != null) {
        String selectSQL = "SELECT bibliotecario_id, password, tipo FROM "
            + "bibliotecario WHERE  + bibliotecario_id = ?";

        ps = con.prepareStatement(selectSQL);
        ps.setString(1, user);
        rs = ps.executeQuery();

        if (rs.next() && (rs.getInt("tipo") != 1)) {
          pass = parsePass(pass);
          String password = rs.getString("password");
          if (password.equals(pass)) {
            success = 1;
          }
        } else if (rs.getInt("tipo") == 1) {
          pass = parsePass(pass);
          String password = rs.getString("password");
          if (password.equals(pass)) {
            success = 2;
          }
        } else {
          success = 0;
        }
      } else {
        return -1;
      }
    } catch (SQLException sqx) {
      JOptionPane.showMessageDialog(null,
          "No se pudo conectar a la base de datos.",
          "Error.",
          JOptionPane.ERROR_MESSAGE);
      sqx.printStackTrace();
    } catch (ClassNotFoundException | HeadlessException |
        NoSuchAlgorithmException | UnsupportedEncodingException ex) {
      System.out.println(ex);
    } finally {
      Conexion.cerrarConexion(con);
    }
    return success;
  }

  private static String parsePass(String pass)
      throws NoSuchAlgorithmException, UnsupportedEncodingException {
    MessageDigest md;
    md = MessageDigest.getInstance("SHA-256");
    md.update(pass.getBytes("UTF-8"));
    byte[] dPass = md.digest();
    BigInteger bigInt = new BigInteger(1, dPass);
    String hashTxt = bigInt.toString(16);
    return hashTxt;
  }

  public static void insertPass(String pass) {
    PreparedStatement ps;
    ResultSet rs;
    try {
      Connection con = Conexion.getConnection();
      pass = parsePass(pass);
      String selectSQL = "UPDATE bibliotecario SET password='" + pass
          + "' WHERE bibliotecario_id = 'zS11012696'";
      ps = con.prepareStatement(selectSQL);
      ps.execute(selectSQL);
      con.close();
    } catch (ClassNotFoundException | SQLException |
        NoSuchAlgorithmException |
        UnsupportedEncodingException e) {
      System.out.println(e);
    }

  }

  public static boolean agregarUsuario(Usuario usuario) {
    Connection connection = null;
    PreparedStatement ps;
    try {
      connection = Conexion.getConnection();
      ps = connection.prepareStatement("INSERT INTO usuario "
          + "(usuario_id, nombre, telefono, direccion, correo,"
          + " ingreso_fecha) "
          + "VALUES (?,?,?,?,?,?)");
      ps.setString(1, usuario.getId());
      ps.setString(2, usuario.getName());
      ps.setString(3, usuario.getTel());
      ps.setString(4, usuario.getDirec());
      ps.setString(5, usuario.getCorreo());
      ps.setDate(6, new java.sql.Date(usuario.getFechaIngreso().getTime()));
      int res = ps.executeUpdate();
      if (res > 0) {
        JOptionPane.showMessageDialog(null, "Usuario Guardado");
        connection.close();
        return true;
      } else {
        JOptionPane.showMessageDialog(null, "Error al Guardar Usuario");
      }

    } catch (SQLException sqx) {
      JOptionPane.showMessageDialog(null,
          "No se pudo conectar a la base de datos.",
          "Error.",
          JOptionPane.ERROR_MESSAGE);
      sqx.printStackTrace();
    } catch (ClassNotFoundException | HeadlessException ex) {
      System.out.println(ex);
    } finally {
      Conexion.cerrarConexion(connection);
    }
    return false;
  }

  public static boolean agregarUsuario(Usuario usuario, String pass) {
    Connection connection = null;
    PreparedStatement ps;
    try {
      connection = Conexion.getConnection();
      ps = connection.prepareStatement("INSERT INTO bilbiotecario "
          + "(bibliotecario_id, nombre, telefono, direccion, correo, tipo,"
          + " password , img_path, ingreso_fecha) "
          + "VALUES (?,?,?,?,?,?,?,?,?)");
      ps.setString(1, usuario.getId());
      ps.setString(2, usuario.getName());
      ps.setString(3, usuario.getTel());
      ps.setString(4, usuario.getDirec());
      ps.setString(5, usuario.getCorreo());
      ps.setInt(6, usuario.getTipo());
      ps.setString(7, parsePass(pass));
      ps.setString(8, usuario.getImgPath());
      ps.setDate(9, new java.sql.Date(usuario.getFechaIngreso().getTime()));
      int res = ps.executeUpdate();
      if (res > 0) {
        JOptionPane.showMessageDialog(null, "Usuario Guardado");
        connection.close();
        return true;
      } else {
        JOptionPane.showMessageDialog(null, "Error al Guardar Usuario");
      }

    } catch (SQLException sqx) {
      JOptionPane.showMessageDialog(null,
          "No se pudo conectar a la base de datos.",
          "Error.",
          JOptionPane.ERROR_MESSAGE);
      sqx.printStackTrace();
    } catch (ClassNotFoundException | HeadlessException |
        NoSuchAlgorithmException | UnsupportedEncodingException ex) {
      System.out.println(ex);
    } finally {
      Conexion.cerrarConexion(connection);
    }
    return false;
  }

  public static void eliminarUsuario(String id) {
    Connection connection = null;
    PreparedStatement ps;
    try {
      connection = Conexion.getConnection();
      ps = connection.prepareStatement("DELETE FROM USUARIO WHERE usuario_id=?");
      ps.setString(1, id);
      int res = ps.executeUpdate();
      if (res > 0) {
        JOptionPane.showMessageDialog(null, "Usuario Eliminado");
      } else {
        JOptionPane.showMessageDialog(null, "Error al Eliminar Usuario");
      }

    } catch (SQLException sqx) {
      JOptionPane.showMessageDialog(null,
          "No se pudo conectar a la base de datos.",
          "Error.",
          JOptionPane.ERROR_MESSAGE);
      sqx.printStackTrace();
    } catch (ClassNotFoundException | HeadlessException ex) {
      System.out.println(ex);
    } finally {
      Conexion.cerrarConexion(connection);
    }
  }

  public static boolean modificarUsuario(Usuario user) {
    Connection connection = null;
    PreparedStatement ps;
    try {
      connection = Conexion.getConnection();
      if (user.getTipo() != -1) {
        ps = connection.prepareStatement("UPDATE bibliotecario "
            + "SET nombre=?, telefono=?, direccion=?, correo=? "
            + "WHERE bibliotecario_id = ?");
        ps.setString(1, user.getName());
        ps.setString(2, user.getTel());
        ps.setString(3, user.getDirec());
        ps.setString(4, user.getCorreo());
        ps.setString(5, user.getId());
      } else {
        ps = connection.prepareStatement("UPDATE usuario "
            + "SET nombre=?, telefono=?, direccion=?, correo=? "
            + "WHERE usuario_id = ?");
        ps.setString(1, user.getName());
        ps.setString(2, user.getTel());
        ps.setString(3, user.getDirec());
        ps.setString(4, user.getCorreo());
        ps.setString(5, user.getId());
      }
        int res = ps.executeUpdate();
        if (res > 0) {
          JOptionPane.showMessageDialog(null, "Usuario Modificado");
          connection.close();
          return true;
        } else {
          JOptionPane.showMessageDialog(null, "Error al Modificar Usuario");
        }
      }catch (SQLException sqx) {
        JOptionPane.showMessageDialog(null,
            "No se pudo conectar a la base de datos.",
            "Error.",
            JOptionPane.ERROR_MESSAGE);
        sqx.printStackTrace();
      }catch (ClassNotFoundException | HeadlessException ex) {
        System.out.println(ex);
      }finally {
        Conexion.cerrarConexion(connection);
      }
      return false;
    }

  

    

  

  public static Usuario consultarUsuario(String ID) {
    Usuario us = new Usuario();
    Connection connection = null;
    PreparedStatement ps;
    ResultSet rs;
    try {
      connection = Conexion.getConnection();
      ps = connection.prepareStatement("SELECT * from bibliotecario "
          + "WHERE bibliotecario_id = ?");
      ps.setString(1, ID);
      rs = ps.executeQuery();
      if (rs.next()) {
        us.setId(rs.getString(1));
        us.setName(rs.getString("nombre"));
        us.setTel(rs.getString("telefono"));
        us.setDirec(rs.getString("direccion"));
        us.setCorreo(rs.getString("correo"));
        us.setFechaIngreso(rs.getDate("ingreso_fecha"));
        us.setImgPath(rs.getString("img_path"));
        us.setTipo(rs.getInt("tipo"));
      } else {
        ps = connection.prepareStatement("SELECT * from usuario "
            + "WHERE usuario_id = ?");
        ps.setString(1, ID);
        rs = ps.executeQuery();
        if (rs.next()) {
          us.setId(rs.getString(1));
          us.setName(rs.getString("nombre"));
          us.setTel(rs.getString("telefono"));
          us.setDirec(rs.getString("direccion"));
          us.setCorreo(rs.getString("correo"));
          us.setFechaIngreso(rs.getDate("ingreso_fecha"));

        }
      }

    } catch (SQLException sqx) {
      JOptionPane.showMessageDialog(null,
          "No se pudo conectar a la base de datos.",
          "Error.",
          JOptionPane.ERROR_MESSAGE);
      sqx.printStackTrace();
    } catch (ClassNotFoundException | HeadlessException ex) {
      System.out.println(ex);
    } finally {
      Conexion.cerrarConexion(connection);
    }
    return us;
  }

  public ArrayList registrarPrestamo(String numFolio) {
    //POR IMPLEMENTAR.
    Connection connection = null;
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
    } catch (SQLException sqx) {
      JOptionPane.showMessageDialog(null,
          "No se pudo conectar a la base de datos.",
          "Error.",
          JOptionPane.ERROR_MESSAGE);
      sqx.printStackTrace();
    } catch (ClassNotFoundException | HeadlessException ex) {
      System.out.println(ex);
    } finally {
      Conexion.cerrarConexion(connection);
    }
    return null;
  }

}
