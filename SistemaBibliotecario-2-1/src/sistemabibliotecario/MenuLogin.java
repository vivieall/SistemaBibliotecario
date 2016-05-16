/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;

import javax.swing.JOptionPane;
import conection.SQLMethods;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Vivie
 */
public class MenuLogin extends javax.swing.JFrame {

  /**
   * Creates new form Login
   */
  public MenuLogin() {
    initComponents();
    SwingUtilities.getRootPane(this).setDefaultButton(btnIngresar);
    txtUsuario.requestFocus();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    txtSearchbar = new javax.swing.JTextField();
    btnSearch = new javax.swing.JButton();
    txtUsuario = new javax.swing.JTextField();
    btnIngresar = new javax.swing.JButton();
    lblRecuperarUsuario = new javax.swing.JLabel();
    jSeparator2 = new javax.swing.JSeparator();
    jSeparator3 = new javax.swing.JSeparator();
    txtPass = new javax.swing.JPasswordField();
    lblError = new javax.swing.JLabel();
    icnBooks = new javax.swing.JLabel();
    lblFEI = new javax.swing.JLabel();
    lblTitle1 = new javax.swing.JLabel();
    icnUVLogo = new javax.swing.JLabel();
    peekBtn = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setMinimumSize(new java.awt.Dimension(755, 600));
    jPanel1.setPreferredSize(new java.awt.Dimension(755, 600));
    jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jPanel1KeyPressed(evt);
      }
    });

    txtSearchbar.setForeground(new java.awt.Color(102, 102, 102));
    txtSearchbar.setText("Búsqueda...");
    txtSearchbar.setToolTipText("");
    txtSearchbar.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        txtSearchbarFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        txtSearchbarFocusLost(evt);
      }
    });
    txtSearchbar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtSearchbarActionPerformed(evt);
      }
    });

    btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_search_black_24dp_1x.png"))); // NOI18N
    btnSearch.setToolTipText("Buscar");
    btnSearch.setName("Search"); // NOI18N
    btnSearch.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSearchActionPerformed(evt);
      }
    });

    txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
    txtUsuario.setText("Usuario");
    txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        txtUsuarioFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        txtUsuarioFocusLost(evt);
      }
    });
    txtUsuario.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtUsuarioActionPerformed(evt);
      }
    });

    btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_done_black_24dp_1x.png"))); // NOI18N
    btnIngresar.setToolTipText("Ingresar");
    btnIngresar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnIngresarActionPerformed(evt);
      }
    });
    btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        btnIngresarKeyReleased(evt);
      }
    });

    lblRecuperarUsuario.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblRecuperarUsuario.setForeground(new java.awt.Color(51, 0, 102));
    lblRecuperarUsuario.setText("*Si desea recuperar su cuenta, preséntese en la biblioteca.");

    jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
    jSeparator2.setPreferredSize(new java.awt.Dimension(755, 2));

    jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
    jSeparator3.setPreferredSize(new java.awt.Dimension(755, 2));

    txtPass.setForeground(new java.awt.Color(102, 102, 102));
    txtPass.setForeground(Color.gray);
    txtPass.setText("Contraseña");
    txtPass.setEchoChar((char) 0);
    txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        txtPassFocusGained(evt);
      }
      public void focusLost(java.awt.event.FocusEvent evt) {
        txtPassFocusLost(evt);
      }
    });
    txtPass.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtPassActionPerformed(evt);
      }
    });

    lblError.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblError.setForeground(new java.awt.Color(255, 0, 0));
    lblError.setText("Usuario y/o contraseña incorrectos");
    lblError.setVisible(false);

    icnBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1.png"))); // NOI18N

    lblFEI.setText("Facultad de Estadística e Informática, Universidad Veracruzana");

    lblTitle1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    lblTitle1.setForeground(new java.awt.Color(0, 0, 102));
    lblTitle1.setText("Sistema Bibliotecario \"BUAEEI\"");

    icnUVLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uv1.png"))); // NOI18N

    peekBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_remove_red_eye_black_24dp_1x.png"))); // NOI18N
    peekBtn.setMaximumSize(new java.awt.Dimension(57, 33));
    peekBtn.setMinimumSize(new java.awt.Dimension(57, 33));
    peekBtn.setPreferredSize(new java.awt.Dimension(57, 33));
    peekBtn.setContentAreaFilled(false);
    peekBtn.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mousePressed(java.awt.event.MouseEvent evt) {
        peekBtnMousePressed(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        peekBtnMouseReleased(evt);
      }
    });
    peekBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        peekBtnActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(icnBooks)
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(lblTitle1)
          .addComponent(lblFEI)
          .addComponent(lblError)
          .addComponent(btnIngresar)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
              .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(peekBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(icnUVLogo)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(txtSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(lblRecuperarUsuario)))
        .addGap(0, 0, Short.MAX_VALUE))
      .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(icnBooks)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblFEI))
          .addComponent(icnUVLogo))
        .addGap(20, 20, 20)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(42, 42, 42)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(txtSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(74, 74, 74)
        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(55, 55, 55)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(peekBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
        .addComponent(lblError)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
        .addComponent(btnIngresar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
        .addComponent(lblRecuperarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(19, 19, 19))
    );

    //txtUsuario.requestFocus();
    btnIngresar.requestFocus();

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(0, 0, 0))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(0, 0, 0))
    );

    this.getRootPane().setDefaultButton(btnIngresar);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
    if (txtPass.getPassword().length == 0) {
      txtPass.setEchoChar((char) 0);
      txtPass.setText("Contraseña");
      txtPass.setForeground(Color.gray);
    }
  }//GEN-LAST:event_txtPassFocusLost

  private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
    char c[] = txtPass.getPassword();
    String s = new String(c);

    if (s.equals("Contraseña")) {
      txtPass.setEchoChar('*');
      txtPass.setText("");
      txtPass.setForeground(Color.black);
    }
  }//GEN-LAST:event_txtPassFocusGained

  private void btnIngresarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyReleased
    // TODO add your handling code here:
  }//GEN-LAST:event_btnIngresarKeyReleased

  private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
    // TODO add your handling code here:
    char pass[] = txtPass.getPassword();
    String password = new String(pass);
    SQLMethods sql = new SQLMethods();
    switch (sql.validarIngreso(txtUsuario.getText(), password)) {
      case 1:
        MenuCirculacion mc = new MenuCirculacion(sql
            .consultarUsuario(txtUsuario.getText()));
        System.out.println(mc.getUsuario().getId());
        PaneB.callNxtPane(this, mc);
        //JOptionPane.showMessageDialog(null, "Bienvenido " + txtUsuario.getText() + "\nhas ingresado satisfactoriamente al sistema.",
        //        "Biblioteca BUAEEI ", JOptionPane.INFORMATION_MESSAGE);
        break;
      case 0:
        JOptionPane.showMessageDialog(null,
            "Verifique que sus datos sean correctos",
            "Acceso denegado.",
            JOptionPane.ERROR_MESSAGE);
        lblError.setVisible(true);
        break;
      default:
        break;
    }
  }//GEN-LAST:event_btnIngresarActionPerformed

  private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtUsuarioActionPerformed

  private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
    if (txtUsuario.getText().equals("")) {
      txtUsuario.setText("Usuario");
      txtUsuario.setForeground(Color.gray);
    }
  }//GEN-LAST:event_txtUsuarioFocusLost

  private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
    if (txtUsuario.getText().equals("Usuario")) {
      txtUsuario.setText("");
      txtUsuario.setForeground(Color.black);
    }
  }//GEN-LAST:event_txtUsuarioFocusGained

  private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    JOptionPane.showMessageDialog(null,
        "Por Implementar",
        "Por Implementar",
        JOptionPane.ERROR_MESSAGE);
  }//GEN-LAST:event_btnSearchActionPerformed

  private void txtSearchbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchbarActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtSearchbarActionPerformed

  private void txtSearchbarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchbarFocusLost
    if (txtSearchbar.getText().equals("")) {
      txtSearchbar.setText("Búsqueda...");
      txtSearchbar.setForeground(Color.gray);
    }    // TODO add your handling code here:
  }//GEN-LAST:event_txtSearchbarFocusLost

  private void txtSearchbarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchbarFocusGained
    if (txtSearchbar.getText().equals("Búsqueda...")) {
      txtSearchbar.setText("");
      txtSearchbar.setForeground(Color.black);
    }
  }//GEN-LAST:event_txtSearchbarFocusGained

  private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtPassActionPerformed

  private void peekBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peekBtnActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_peekBtnActionPerformed

  private void peekBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peekBtnMousePressed
    peekBtn.setIcon(new javax.swing.ImageIcon(getClass()
        .getResource("/ic_remove_red_eye_gray_24dp_1x.png")));
    if (txtPass.getForeground() != Color.gray) {
      txtPass.setEchoChar((char) 0);
    }
  }//GEN-LAST:event_peekBtnMousePressed

  private void peekBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peekBtnMouseReleased
    peekBtn.setIcon(new javax.swing.ImageIcon(getClass()
        .getResource("/ic_remove_red_eye_black_24dp_1x.png")));
    if (txtPass.getForeground() != Color.gray) {
      txtPass.setEchoChar('*');
    } // TODO add your handling code here:
  }//GEN-LAST:event_peekBtnMouseReleased

  private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
    // TODO add your handling code here:
  }//GEN-LAST:event_jPanel1KeyPressed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(MenuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MenuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MenuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MenuLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new MenuLogin().setVisible(true);
    });

  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnIngresar;
  private javax.swing.JButton btnSearch;
  private javax.swing.JLabel icnBooks;
  private javax.swing.JLabel icnUVLogo;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JSeparator jSeparator3;
  private javax.swing.JLabel lblError;
  private javax.swing.JLabel lblFEI;
  private javax.swing.JLabel lblRecuperarUsuario;
  private javax.swing.JLabel lblTitle1;
  private javax.swing.JButton peekBtn;
  private javax.swing.JPasswordField txtPass;
  private javax.swing.JTextField txtSearchbar;
  private javax.swing.JTextField txtUsuario;
  // End of variables declaration//GEN-END:variables

}
