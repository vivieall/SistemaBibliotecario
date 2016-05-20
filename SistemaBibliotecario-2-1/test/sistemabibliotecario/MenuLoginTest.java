/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;

import javax.swing.JPanel;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mauri
 */
public class MenuLoginTest {
  
  public MenuLoginTest() {
  }
  
  @Before
  public void setUp() {
  }

  /**
   * Prueba la persistencia de la forma Singleton
   */
  @Test
  public void testGetInstance() {
    System.out.println("getInstance");
    MenuLogin result = MenuLogin.getInstance();
    assertNotNull(result);
  }

  /**
   * Test of getMainPanel method, of class MenuLogin.
   */
  @Test
  public void testGetMainPanel() {
    System.out.println("getMainPanel");
    MenuLogin instance = MenuLogin.getInstance();
    JPanel result = instance.getMainPanel();
    assertNotNull(result);

  }
  

  /**
   * Test of main method, of class MenuLogin.
   */
  @Test
  public void testMain() {
    System.out.println("main");
    String[] args = null;
    MenuLogin.main(args);
    assertTrue(MenuLogin.getInstance().isEnabled());
  }
}
