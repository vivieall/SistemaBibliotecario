/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conection;
import comportamiento.RandomString;
import comportamiento.Material;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import comportamiento.Usuario;
import java.security.SecureRandom;
import java.util.ArrayList;

/**
 *
 * @author mauri
 */
public class SQLMethodsTest {
  
  public SQLMethodsTest() {
  }

  @Before
  public void setUp() throws Exception {
  }
  
  /**
   * Verifica que al introducir un usuario y contraseña validos, se retorne
   * el valor adecuado, 1
   * Test of validarIngreso method, of class SQLMethods.
   */
  @Test
  public void testValidarIngreso() {
    System.out.println("validarIngreso");
    String user = "Gustavo";
    String pass = "gustavo";
    int expResult = 1;
    int result = SQLMethods.validarIngreso(user, pass);
    assertEquals(expResult, result);
  }
  
    /**
   * Verifica que al introducir un usuario y contraseña no validos, se retorne
   * el valor adecuado, 0
   * Test of validarIngreso method, of class SQLMethods.
   */
  @Test
  public void testValidarMalIngreso() {
    System.out.println("validarIngreso");
    String user = "Gustavo";
    String pass = "PASSWORD";
    int expResult = 0;
    int result = SQLMethods.validarIngreso(user, pass);
    assertEquals(expResult, result);
  }

      /**
   * Verifica que al introducir un usuario y contraseña validos pero
   * sin autorización, se retorne el valor adecuado, 2
   * Test of validarIngreso method, of class SQLMethods.
   */
  @Test
  public void testValidarPermisosIngreso() {
    System.out.println("validarIngreso");
    String user = "Prueba";
    String pass = "prueba";
    int expResult = 2;
    int result = SQLMethods.validarIngreso(user, pass);
    assertEquals(expResult, result);
  }
  
  /**
   * Verifica que al intentar ingresar un usuario vacío se atrape la excepción
   */
  @Test(expected = NullPointerException.class)
  public void testAgregarUsuario_Usuario() {
    System.out.println("agregarUsuario");
    Usuario usuario = null;
    SQLMethods.agregarUsuario(usuario);
    fail();
  }

  /**
   * Verifica que al intentar ingresar un bibliotecario vacío 
   * se atrape la excepción
   */
  @Test(expected = NullPointerException.class)
  public void testAgregarUsuario_Usuario_String() {
    System.out.println("agregarUsuario");
    Usuario usuario = new Usuario();
    String pass = "1234";
    SQLMethods.agregarUsuario(usuario, pass);
    fail();
  }


  /**
   * Verifica que al realizar una consulta, el Usuario obtenido sea el adecuado
   */
  @Test
  public void testConsultarUsuario() {
    System.out.println("consultarUsuario");
    String ID = "MAURICIO";
    String expResult = "MAURICIO";
    Usuario result = SQLMethods.consultarUsuario(ID);
    assertEquals(expResult, result.getId());
  }

  /**
   * Verifica que al realizar una modificación, se vea reflejada 
   * en la base de datos con una consulta despues de la llamada
   */
  @Test
  public void testModificarUsuario() {
    System.out.println("modificarUsuario");
    SecureRandom random = new SecureRandom();
    String name = RandomString.getSaltString();
    Usuario eR = SQLMethods.consultarUsuario("Prueba");
    eR.setName(name);
    SQLMethods.modificarUsuario(eR);
    Usuario Rs = SQLMethods.consultarUsuario("Prueba");
    assertEquals(eR.getName(), Rs.getName());

  }

  /**
   * Verifica que todos los resultados de la consulta coincidan con el string
   * de busqueda
   */
  @Test
  public void testConsultarCatalogo() {
    System.out.println("consultarCatalogo");
    String busqueda = "Palmer";
    boolean flag = true;
    ArrayList<Material> result = SQLMethods.consultarCatalogo(busqueda);
    for (Material r1 : result){
      if (!r1.getTitulo().contains(busqueda) 
          && !r1.getAutor().contains(busqueda)){
        flag = false;
      }
    }
    assertTrue(flag);
  }


  
}
