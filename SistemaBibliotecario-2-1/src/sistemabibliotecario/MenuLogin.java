/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;


import javax.swing.JOptionPane;
import conection.SQLMethods;
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
    lblIDRqst = new javax.swing.JLabel();
    lblPassRqst = new javax.swing.JLabel();
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

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setMinimumSize(new java.awt.Dimension(750, 600));
    jPanel1.setPreferredSize(new java.awt.Dimension(750, 600));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    txtSearchbar.setText("Búsqueda...");
    txtSearchbar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtSearchbarActionPerformed(evt);
      }
    });
    jPanel1.add(txtSearchbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 313, -1));

    btnSearch.setText("Ir");
    btnSearch.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSearchActionPerformed(evt);
      }
    });
    jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 53, -1));

    txtUsuario.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtUsuarioActionPerformed(evt);
      }
    });
    jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 260, 160, -1));
    txtUsuario.requestFocus();

    lblIDRqst.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblIDRqst.setText("Ingresar ID");
    jPanel1.add(lblIDRqst, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

    lblPassRqst.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblPassRqst.setText("Contraseña");
    jPanel1.add(lblPassRqst, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

    btnIngresar.setText("Ingresar");
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
    jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, -1));

    lblRecuperarUsuario.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblRecuperarUsuario.setForeground(new java.awt.Color(51, 0, 102));
    lblRecuperarUsuario.setText("*Si desea recuperar su cuenta, preséntese en la biblioteca.");
    jPanel1.add(lblRecuperarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

    jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
    jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 766, -1));

    jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
    jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 766, -1));
    jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 340, 160, -1));

    lblError.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblError.setForeground(new java.awt.Color(255, 0, 0));
    lblError.setText("Usuario y/o contraseña incorrectos");
    lblError.setVisible(false);
    jPanel1.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

    icnBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1.png"))); // NOI18N
    jPanel1.add(icnBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

    lblFEI.setText("Facultad de Estadística e Informática, Universidad Veracruzana");
    jPanel1.add(lblFEI, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

    lblTitle1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    lblTitle1.setForeground(new java.awt.Color(0, 0, 102));
    lblTitle1.setText(" Sistema Bibliotecario \"BUAEEI\"");
    jPanel1.add(lblTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 58));

    icnUVLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uv1.png"))); // NOI18N
    jPanel1.add(icnUVLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 102, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtUsuarioActionPerformed

  private void txtSearchbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchbarActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtSearchbarActionPerformed

  private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
    // TODO add your handling code here:    
    char pass[] = txtPass.getPassword();
    String password = new String(pass);
    SQLMethods sql = new SQLMethods();
    if (sql.validarIngreso(txtUsuario.getText(), password) == true) {
      
      MenuCirculacion mc = new MenuCirculacion(sql
          .consultarUsuario(txtUsuario.getText()));
      
      System.out.println(mc.getUsuario().getId());
      PaneB.callNxtPane(this, mc);
      //JOptionPane.showMessageDialog(null, "Bienvenido " + txtUsuario.getText() + "\nhas ingresado satisfactoriamente al sistema.",
      //        "Biblioteca BUAEEI ", JOptionPane.INFORMATION_MESSAGE);
    } else {
      JOptionPane.showMessageDialog(null,
              "Verifique que sus datos sean correctos",
              "Acceso denegado.",
              JOptionPane.ERROR_MESSAGE);
      lblError.setVisible(true);
    }
  }//GEN-LAST:event_btnIngresarActionPerformed

  private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    JOptionPane.showMessageDialog(null,
              "Por Implementar",
              "Por Implementar",
              JOptionPane.ERROR_MESSAGE);
  }//GEN-LAST:event_btnSearchActionPerformed

  private void btnIngresarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyReleased
    // TODO add your handling code here:
  }//GEN-LAST:event_btnIngresarKeyReleased

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
  private javax.swing.JLabel lblIDRqst;
  private javax.swing.JLabel lblPassRqst;
  private javax.swing.JLabel lblRecuperarUsuario;
  private javax.swing.JLabel lblTitle1;
  private javax.swing.JPasswordField txtPass;
  private javax.swing.JTextField txtSearchbar;
  public static javax.swing.JTextField txtUsuario;
  // End of variables declaration//GEN-END:variables

}
