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
public class MenuBibliotecarioTest {
  Usuario us = new Usuario();
  public MenuBibliotecarioTest() {
  }
  
  @Before
  public void setUp() {
    us.setName("name");
    us.setTel("22323424");
    us.setId("Joseph");
  }

  /**
   * Prueba que el usuario permanezca identico despues de la creación de la 
   * forma
   */
  @Test
  public void testGetUsuario() {
    System.out.println("getUsuario");
    MenuBibliotecario instance = new MenuBibliotecario(us);
    Usuario expResult = us;
    Usuario result = instance.getUsuario();
    assertEquals(expResult, result);
  }

  
}
