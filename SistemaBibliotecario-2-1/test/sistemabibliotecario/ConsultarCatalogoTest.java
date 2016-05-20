/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;

import comportamiento.Usuario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mauri
 */
public class ConsultarCatalogoTest {
  
  public ConsultarCatalogoTest() {
  }
  
  @Before
  public void setUp() {
  }

  /**
   * Al ser llamada sin una cuenta de usuario, la funcion debe retornar nulo
   */
  @Test
  public void testGetUsuarioNull() {
    System.out.println("getUsuario");
    ConsultarCatalogo instance = new ConsultarCatalogo("");
    Usuario expResult = null;
    Usuario result = instance.getUsuario();
    assertEquals(expResult, result);
  }
  /**
   * Al ser llamada con información de la sesión activa, debe retornar
   * dicha informacion
   */
  @Test
  public void testGetUsuario() {
    System.out.println("getUsuario");
    Usuario usr = new Usuario();
    usr.setName("David");
    ConsultarCatalogo instance = new ConsultarCatalogo("", usr);
    Usuario result = instance.getUsuario();
    assertEquals(usr.getName(), result.getName());
  }

  /**
   * Prueba que al llamar la función, el String de busqueda permanezca identico
   */
  @Test
  public void testGetBusqueda() {
    System.out.println("getBusqueda");
    ConsultarCatalogo instance = new ConsultarCatalogo("NO");
    String expResult = "NO";
    String result = instance.getBusqueda();
    assertEquals(expResult, result);
  }

  /**
   * Prueba que la busqueda ya existente pueda ser sobreescrita mediante
   * el setter
   */
  @Test
  public void testSetBusqueda() {
    System.out.println("setBusqueda");
    String busqueda = "";
    String busqueda2 = "Po";
    ConsultarCatalogo instance = new ConsultarCatalogo(busqueda);
    instance.setBusqueda(busqueda2);
    assertNotEquals(busqueda, instance.getBusqueda());
  }
  
}
