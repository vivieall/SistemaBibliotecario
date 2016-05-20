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
public class MenuUsuarioTest {
  
  public MenuUsuarioTest() {
  }
  
  @Before
  public void setUp() {
  }

  /**
   * Test of getUsuario method, of class MenuUsuario.
   */
  @Test
  public void testGetUsuario() {
    System.out.println("getUsuario");
    Usuario usr = new Usuario();
    usr.setName("Paul");
    MenuUsuario instance = new MenuUsuario(usr);
    Usuario result = instance.getUsuario();
    assertEquals(usr, result);
  }
  
}
