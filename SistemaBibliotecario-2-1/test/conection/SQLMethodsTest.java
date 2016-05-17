/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sistemabibliotecario.Usuario;

/**
 *
 * @author mauri
 */
public class SQLMethodsTest {
  
  public SQLMethodsTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of validarIngreso method, of class SQLMethods.
   */
  @Test
  public void testValidarIngreso() {
    System.out.println("validarIngreso");
    String user = "";
    String pass = "";
    int expResult = 0;
    int result = SQLMethods.validarIngreso(user, pass);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of insertPass method, of class SQLMethods.
   */
  @Test
  public void testInsertPass() {
    System.out.println("insertPass");
    String pass = "";
    SQLMethods.insertPass(pass);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of agregarUsuario method, of class SQLMethods.
   */
  @Test
  public void testAgregarUsuario_Usuario() {
    System.out.println("agregarUsuario");
    Usuario usuario = null;
    boolean expResult = false;
    boolean result = SQLMethods.agregarUsuario(usuario);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of agregarUsuario method, of class SQLMethods.
   */
  @Test
  public void testAgregarUsuario_Usuario_String() {
    System.out.println("agregarUsuario");
    Usuario usuario = null;
    String pass = "";
    boolean expResult = false;
    boolean result = SQLMethods.agregarUsuario(usuario, pass);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of eliminarUsuario method, of class SQLMethods.
   */
  @Test
  public void testEliminarUsuario() {
    System.out.println("eliminarUsuario");
    String id = "";
    SQLMethods.eliminarUsuario(id);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of modificarUsuario method, of class SQLMethods.
   */
  @Test
  public void testModificarUsuario() {
    System.out.println("modificarUsuario");
    Usuario user = null;
    boolean expResult = false;
    boolean result = SQLMethods.modificarUsuario(user);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of consultarUsuario method, of class SQLMethods.
   */
  @Test
  public void testConsultarUsuario() {
    System.out.println("consultarUsuario");
    String ID = "";
    Usuario expResult = null;
    Usuario result = SQLMethods.consultarUsuario(ID);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of registrarPrestamo method, of class SQLMethods.
   */
  @Test
  public void testRegistrarPrestamo() {
    System.out.println("registrarPrestamo");
    String numFolio = "";
    SQLMethods instance = new SQLMethods();
    ArrayList expResult = null;
    ArrayList result = instance.registrarPrestamo(numFolio);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
