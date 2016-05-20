/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamiento;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Clase con funcionaalidad de control de formas
 * @author mauricio
 */
public class PaneB {
  
  /**
   * Llama una nueva forma dentro del JFrame activo
   * @param frame Frame activo
   * @param jpanel Panel que ocupará el Frame 
   */
  public static void callNxtPane(JFrame frame,JPanel jpanel){
    frame.setContentPane(jpanel);
    frame.revalidate();
  }
  
  
    
}
