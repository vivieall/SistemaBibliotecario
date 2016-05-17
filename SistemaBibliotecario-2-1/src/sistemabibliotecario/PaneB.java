/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author mauri
 */
public class PaneB {
  
    public static void callNxtPane(JFrame frame,JPanel jpanel){
    frame.setContentPane(jpanel);
    frame.revalidate();
  }
    
}
