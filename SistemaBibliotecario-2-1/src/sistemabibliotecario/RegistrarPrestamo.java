/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;

import comportamiento.PaneB;
import comportamiento.Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Vivie
 */
public class RegistrarPrestamo extends javax.swing.JPanel {

  private Usuario usuario;


  public RegistrarPrestamo(Usuario user) {
    usuario = user;
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel4 = new javax.swing.JPanel();
    jSeparator5 = new javax.swing.JSeparator();
    icnBooks = new javax.swing.JLabel();
    lblFEI = new javax.swing.JLabel();
    txtSearchbar2 = new javax.swing.JTextField();
    lblTitle1 = new javax.swing.JLabel();
    btnSearch = new javax.swing.JButton();
    icnUVLogo = new javax.swing.JLabel();
    btnGestionUsuario = new javax.swing.JButton();
    jLabel19 = new javax.swing.JLabel();
    txtSearchbar6 = new javax.swing.JTextField();
    jSeparator6 = new javax.swing.JSeparator();
    btnGestionarPrestamo = new javax.swing.JButton();
    btnVerificarAdeudo = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    btnAceptar = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    txtSearchbar7 = new javax.swing.JTextField();
    gestionUsuario8 = new javax.swing.JButton();
    gestionUsuario9 = new javax.swing.JButton();
    gestionUsuario5 = new javax.swing.JButton();

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));
    jPanel4.setPreferredSize(new java.awt.Dimension(750, 700));
    jPanel4.setRequestFocusEnabled(false);
    jPanel4.setLayout(null);

    jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator5.setForeground(new java.awt.Color(51, 51, 51));
    jPanel4.add(jSeparator5);
    jSeparator5.setBounds(6, 103, 811, 11);

    icnBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1.png"))); // NOI18N
    jPanel4.add(icnBooks);
    icnBooks.setBounds(60, 10, 85, 85);

    lblFEI.setText("Facultad de Estadística e Informática, Universidad Veracruzana");
    jPanel4.add(lblFEI);
    lblFEI.setBounds(200, 70, 303, 14);

    txtSearchbar2.setText("Búsqueda...");
    txtSearchbar2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtSearchbar2ActionPerformed(evt);
      }
    });
    jPanel4.add(txtSearchbar2);
    txtSearchbar2.setBounds(6, 117, 189, 20);

    lblTitle1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    lblTitle1.setForeground(new java.awt.Color(0, 0, 102));
    lblTitle1.setText(" Sistema Bibliotecario \"BUAEEI\"");
    jPanel4.add(lblTitle1);
    lblTitle1.setBounds(150, 10, 474, 58);

    btnSearch.setText("Ir");
    btnSearch.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSearchActionPerformed(evt);
      }
    });
    jPanel4.add(btnSearch);
    btnSearch.setBounds(207, 117, 53, 23);

    icnUVLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uv1.png"))); // NOI18N
    jPanel4.add(icnUVLogo);
    icnUVLogo.setBounds(610, 10, 102, 85);

    btnGestionUsuario.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    btnGestionUsuario.setText("Gestionar usuario");
    btnGestionUsuario.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnGestionUsuarioActionPerformed(evt);
      }
    });
    jPanel4.add(btnGestionUsuario);
    btnGestionUsuario.setBounds(270, 120, 133, 26);

    jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_home_black_24dp_1x.png"))); // NOI18N
    jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        jLabel19MouseReleased(evt);
      }
    });
    jPanel4.add(jLabel19);
    jLabel19.setBounds(710, 120, 30, 26);

    txtSearchbar6.setText("zS14011643");
    txtSearchbar6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtSearchbar6ActionPerformed(evt);
      }
    });
    jPanel4.add(txtSearchbar6);
    txtSearchbar6.setBounds(480, 280, 192, 20);

    jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator6.setForeground(new java.awt.Color(51, 51, 51));
    jPanel4.add(jSeparator6);
    jSeparator6.setBounds(7, 150, 820, 11);

    btnGestionarPrestamo.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    btnGestionarPrestamo.setText("Gestionar préstamo");
    btnGestionarPrestamo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnGestionarPrestamoActionPerformed(evt);
      }
    });
    jPanel4.add(btnGestionarPrestamo);
    btnGestionarPrestamo.setBounds(420, 120, 145, 26);

    btnVerificarAdeudo.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    btnVerificarAdeudo.setText("Verificar adeudo");
    btnVerificarAdeudo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnVerificarAdeudoActionPerformed(evt);
      }
    });
    jPanel4.add(btnVerificarAdeudo);
    btnVerificarAdeudo.setBounds(580, 120, 127, 26);

    jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    jLabel1.setText("Ingrese ID del usuario lector:");
    jPanel4.add(jLabel1);
    jLabel1.setBounds(40, 290, 183, 18);

    btnAceptar.setText("Aceptar");
    btnAceptar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAceptarActionPerformed(evt);
      }
    });
    jPanel4.add(btnAceptar);
    btnAceptar.setBounds(340, 450, 71, 30);

    jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    jLabel2.setText("Escanee el código del material ó ingrese el número de folio:");
    jPanel4.add(jLabel2);
    jLabel2.setBounds(40, 240, 385, 18);

    txtSearchbar7.setText("111222323123");
    txtSearchbar7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtSearchbar7ActionPerformed(evt);
      }
    });
    jPanel4.add(txtSearchbar7);
    txtSearchbar7.setBounds(480, 240, 192, 20);

    gestionUsuario8.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    gestionUsuario8.setText("Registar renovación");
    gestionUsuario8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        gestionUsuario8ActionPerformed(evt);
      }
    });
    jPanel4.add(gestionUsuario8);
    gestionUsuario8.setBounds(300, 370, 147, 26);

    gestionUsuario9.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    gestionUsuario9.setText("Registrar préstamo");
    gestionUsuario9.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        gestionUsuario9ActionPerformed(evt);
      }
    });
    jPanel4.add(gestionUsuario9);
    gestionUsuario9.setBounds(110, 370, 150, 26);

    gestionUsuario5.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    gestionUsuario5.setText("Registrar devolución");
    gestionUsuario5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        gestionUsuario5ActionPerformed(evt);
      }
    });
    jPanel4.add(gestionUsuario5);
    gestionUsuario5.setBounds(490, 370, 149, 26);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
  }// </editor-fold>//GEN-END:initComponents

  private void txtSearchbar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchbar2ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtSearchbar2ActionPerformed

  private void btnGestionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionUsuarioActionPerformed
    MenuUsuario mu = new MenuUsuario(usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), mu);
  }//GEN-LAST:event_btnGestionUsuarioActionPerformed

  private void txtSearchbar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchbar6ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtSearchbar6ActionPerformed

  private void btnGestionarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarPrestamoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btnGestionarPrestamoActionPerformed

  private void btnVerificarAdeudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarAdeudoActionPerformed
    JOptionPane.showMessageDialog(null,
        "En construcción",
        "En construcción",
        JOptionPane.INFORMATION_MESSAGE); 
  }//GEN-LAST:event_btnVerificarAdeudoActionPerformed

  private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btnAceptarActionPerformed

  private void txtSearchbar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchbar7ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtSearchbar7ActionPerformed

  private void gestionUsuario8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionUsuario8ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_gestionUsuario8ActionPerformed

  private void gestionUsuario9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionUsuario9ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_gestionUsuario9ActionPerformed

  private void gestionUsuario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionUsuario5ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_gestionUsuario5ActionPerformed

  private void jLabel19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseReleased
    MenuBibliotecario mc = new MenuBibliotecario(usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), mc);  
  }//GEN-LAST:event_jLabel19MouseReleased

  private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    JOptionPane.showMessageDialog(null,
        "En construcción",
        "En construcción",
        JOptionPane.INFORMATION_MESSAGE); 
  }//GEN-LAST:event_btnSearchActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAceptar;
  private javax.swing.JButton btnGestionUsuario;
  private javax.swing.JButton btnGestionarPrestamo;
  private javax.swing.JButton btnSearch;
  private javax.swing.JButton btnVerificarAdeudo;
  private javax.swing.JButton gestionUsuario5;
  private javax.swing.JButton gestionUsuario8;
  private javax.swing.JButton gestionUsuario9;
  private javax.swing.JLabel icnBooks;
  private javax.swing.JLabel icnUVLogo;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel19;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JSeparator jSeparator5;
  private javax.swing.JSeparator jSeparator6;
  private javax.swing.JLabel lblFEI;
  private javax.swing.JLabel lblTitle1;
  private javax.swing.JTextField txtSearchbar2;
  private javax.swing.JTextField txtSearchbar6;
  private javax.swing.JTextField txtSearchbar7;
  // End of variables declaration//GEN-END:variables
}
