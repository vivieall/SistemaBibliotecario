/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author mauricio
 */
public class ConexionTest {
  
  public ConexionTest() {
  }

  @Before
  public void setUp() throws Exception {
  }

  /**
   * Prueba la conexión a la base de datos mediante el driver
   * @throws java.lang.Exception
   */
  @Test
  public void testGetConnection() throws Exception {
    System.out.println("getConnection");
    Connection result = Conexion.getConnection();
    assertNotNull(result);
  }

  /**
   * Instancia una conexion y la cierra, verifica que la conexion
   * no esté activa
   * @throws java.sql.SQLException
   * @throws java.lang.ClassNotFoundException
   */
  @Test
  public void testCerrarConexion() throws SQLException, ClassNotFoundException {
    System.out.println("cerrarConexion");
    Connection con = Conexion.getConnection();
    Conexion.cerrarConexion(con);
    assertFalse(con.isValid(0));
  }
  
}
