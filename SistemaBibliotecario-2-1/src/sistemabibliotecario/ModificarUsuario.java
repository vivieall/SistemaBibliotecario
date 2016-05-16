/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;

import conection.SQLMethods;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author ruben
 */
public class ModificarUsuario extends javax.swing.JPanel {

  private Usuario usuario, cambio;

  /**
   * Creates new form Modificar2
   */
  public ModificarUsuario() {
    initComponents();
  }

  public ModificarUsuario(Usuario usuario, Usuario cambio) {
    this.usuario = usuario;
    this.cambio = cambio;
    initComponents();
  }

  private boolean validateTexts() {
    boolean flag = isValidText(txtName);
    if (flag) {
      flag = isValidText(txtTel);
      if (flag) {
        isValidText(txtAddress);
        if (flag) {
          isValidText(txtMail);
        }
      }
    }
    return flag;
  }

  private boolean isValidText(JTextField field) {
    return !field.getText().equals("") && !field.getText().trim().isEmpty();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    icnBooks = new javax.swing.JLabel();
    lblID = new javax.swing.JLabel();
    btnCancel = new javax.swing.JButton();
    btnSave = new javax.swing.JButton();
    lblFEI = new javax.swing.JLabel();
    lblTitle2 = new javax.swing.JLabel();
    icnUVLogo = new javax.swing.JLabel();
    icnUser = new javax.swing.JLabel();
    lblMail = new javax.swing.JLabel();
    lblAddress = new javax.swing.JLabel();
    lblTel = new javax.swing.JLabel();
    lblName = new javax.swing.JLabel();
    lblSubTitle = new javax.swing.JLabel();
    txtTel = new javax.swing.JTextField();
    txtAddress = new javax.swing.JTextField();
    txtMail = new javax.swing.JTextField();
    txtName = new javax.swing.JTextField();
    jSeparator5 = new javax.swing.JSeparator();
    txtSearchbar = new javax.swing.JTextField();
    jSeparator4 = new javax.swing.JSeparator();
    btnSearch = new javax.swing.JButton();
    btnGestionarUsuario = new javax.swing.JButton();
    btnGestionarPrestamo = new javax.swing.JButton();
    btnVerificarAdeudo = new javax.swing.JButton();
    btnCerrarSesion = new javax.swing.JButton();
    btnCerrarSesion1 = new javax.swing.JButton();

    setBackground(new java.awt.Color(255, 255, 255));
    setMinimumSize(new java.awt.Dimension(755, 600));
    setPreferredSize(new java.awt.Dimension(755, 600));

    icnBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1.png"))); // NOI18N

    lblID.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    lblID.setText("ID: zS1401643 ");
    lblID.setText("ID: " + cambio.getId());

    btnCancel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_cancel_black_24dp_1x.png"))); // NOI18N
    btnCancel.setToolTipText("Cancelar");
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancelActionPerformed(evt);
      }
    });

    btnSave.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_save_black_24dp_1x.png"))); // NOI18N
    btnSave.setToolTipText("Guardar");
    btnSave.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSaveActionPerformed(evt);
      }
    });

    lblFEI.setText("Facultad de Estadística e Informática, Universidad Veracruzana");

    lblTitle2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    lblTitle2.setForeground(new java.awt.Color(0, 0, 102));
    lblTitle2.setText("Sistema Bibliotecario \"BUAEEI\"");

    icnUVLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uv1.png"))); // NOI18N

    icnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2-user_-_single_add-128.png"))); // NOI18N

    lblMail.setBackground(new java.awt.Color(204, 204, 204));
    lblMail.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblMail.setText("Correo: ");

    lblAddress.setBackground(new java.awt.Color(204, 204, 204));
    lblAddress.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblAddress.setText("Dirección:");

    lblTel.setBackground(new java.awt.Color(204, 204, 204));
    lblTel.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblTel.setText("Teléfono:");

    lblName.setBackground(new java.awt.Color(204, 204, 204));
    lblName.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblName.setText("Nombre: ");

    lblSubTitle.setBackground(new java.awt.Color(204, 204, 204));
    lblSubTitle.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    lblSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblSubTitle.setText("Modificar Usuario");
    lblSubTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
    lblSubTitle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

    txtTel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtTelActionPerformed(evt);
      }
    });
    txtTel.setText(cambio.getTel());

    txtAddress.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtAddressActionPerformed(evt);
      }
    });
    txtAddress.setText(cambio.getDirec());

    txtName.setText(cambio.getName());

    jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator5.setForeground(new java.awt.Color(51, 51, 51));

    txtSearchbar.setForeground(new java.awt.Color(102, 102, 102));
    txtSearchbar.setText("Búsqueda...");

    jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator4.setForeground(new java.awt.Color(51, 51, 51));

    btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_search_black_24dp_1x.png"))); // NOI18N
    btnSearch.setToolTipText("Buscar");
    btnSearch.setName("Search"); // NOI18N
    btnSearch.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSearchActionPerformed(evt);
      }
    });

    btnGestionarUsuario.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    btnGestionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_account_box_black_24dp_1x.png"))); // NOI18N
    btnGestionarUsuario.setToolTipText("Usuarios");
    btnGestionarUsuario.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnGestionarUsuarioActionPerformed(evt);
      }
    });

    btnGestionarPrestamo.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    btnGestionarPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_book_black_24dp_1x.png"))); // NOI18N
    btnGestionarPrestamo.setToolTipText("Préstamos");
    btnGestionarPrestamo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnGestionarPrestamoActionPerformed(evt);
      }
    });

    btnVerificarAdeudo.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    btnVerificarAdeudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_attach_money_black_24dp_1x.png"))); // NOI18N
    btnVerificarAdeudo.setToolTipText("Adeudo");
    btnVerificarAdeudo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnVerificarAdeudoActionPerformed(evt);
      }
    });

    btnCerrarSesion.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_exit_to_app_black_24dp_1x.png"))); // NOI18N
    btnCerrarSesion.setToolTipText("Cerrar Sesión");
    btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCerrarSesionActionPerformed(evt);
      }
    });

    btnCerrarSesion1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    btnCerrarSesion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_home_black_24dp_1x.png"))); // NOI18N
    btnCerrarSesion1.setToolTipText("Inicio");
    btnCerrarSesion1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCerrarSesion1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jSeparator4)
      .addComponent(jSeparator5)
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(txtSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnGestionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnGestionarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnVerificarAdeudo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnCerrarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(25, 25, 25))
      .addGroup(layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(icnBooks)
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(5, 5, 5)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(lblSubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblFEI)
            .addComponent(lblTitle2)))
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(icnUVLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(85, 85, 85)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
              .addComponent(icnUser)
              .addComponent(lblID)))
          .addGroup(layout.createSequentialGroup()
            .addGap(260, 260, 260)
            .addComponent(btnSave)
            .addGap(107, 107, 107)
            .addComponent(btnCancel)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblFEI))
          .addGroup(layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(icnBooks)
              .addComponent(icnUVLogo))))
        .addGap(20, 20, 20)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(txtSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(42, 42, 42)
            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnGestionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnGestionarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnVerificarAdeudo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnCerrarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(42, 42, 42)
        .addComponent(lblSubTitle)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(icnUser)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblID))
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(20, 20, 20)
            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(20, 20, 20)
            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(20, 20, 20)
            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(38, 38, 38)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(btnSave)
          .addComponent(btnCancel))
        .addGap(90, 90, 90))
    );

    txtMail.setText(cambio.getCorreo());
  }// </editor-fold>//GEN-END:initComponents

  private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    if (validateTexts()) {
      Usuario us = new Usuario();
      us.setId(cambio.getId());
      us.setName(txtName.getText());
      us.setTel(txtTel.getText());
      us.setDirec(txtAddress.getText());
      us.setCorreo(txtMail.getText());
      SQLMethods sql = new SQLMethods();
      if (sql.modificarUsuario(us)) {
        MenuUsuario mu = new MenuUsuario(usuario);
        PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), mu);
      }
    }    // TODO add your handling code here:
  }//GEN-LAST:event_btnSaveActionPerformed

  private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    MenuUsuario mu = new MenuUsuario(usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), mu);    // TODO add your handling code here:
  }//GEN-LAST:event_btnCancelActionPerformed

  private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtAddressActionPerformed

  private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtTelActionPerformed

  private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    JOptionPane.showMessageDialog(null,
      "Por Implementar",
      "Por Implementar",
      JOptionPane.ERROR_MESSAGE);    // TODO add your handling code here:
  }//GEN-LAST:event_btnSearchActionPerformed

  private void btnGestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarUsuarioActionPerformed
    MenuUsuario mu = new MenuUsuario(usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), mu);    // TODO add your handling code here:
  }//GEN-LAST:event_btnGestionarUsuarioActionPerformed

  private void btnGestionarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarPrestamoActionPerformed
    RegistrarPrestamo rp = new RegistrarPrestamo(usuario);
    PaneB.callNxtPane ((JFrame) SwingUtilities.getWindowAncestor(this), rp);    // TODO add your handling code here:
  }//GEN-LAST:event_btnGestionarPrestamoActionPerformed

  private void btnVerificarAdeudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarAdeudoActionPerformed
    JOptionPane.showMessageDialog(null,
      "Por Implementar",
      "Por Implementar",
      JOptionPane.ERROR_MESSAGE);      // TODO add your handling code here:
  }//GEN-LAST:event_btnVerificarAdeudoActionPerformed

  private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed

    java.awt.EventQueue.invokeLater(() -> {
      new MenuLogin().setVisible(true);
    });
    SwingUtilities.getWindowAncestor(this).dispose();
    // TODO add your handling code here:
  }//GEN-LAST:event_btnCerrarSesionActionPerformed

  private void btnCerrarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesion1ActionPerformed
    // TODO add your handling code here:
    MenuCirculacion mc = new MenuCirculacion(usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), mc);    // TODO add your handling code here:
  }//GEN-LAST:event_btnCerrarSesion1ActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCancel;
  private javax.swing.JButton btnCerrarSesion;
  private javax.swing.JButton btnCerrarSesion1;
  private javax.swing.JButton btnGestionarPrestamo;
  public javax.swing.JButton btnGestionarUsuario;
  private javax.swing.JButton btnSave;
  private javax.swing.JButton btnSearch;
  private javax.swing.JButton btnVerificarAdeudo;
  private javax.swing.JLabel icnBooks;
  private javax.swing.JLabel icnUVLogo;
  private javax.swing.JLabel icnUser;
  private javax.swing.JSeparator jSeparator4;
  private javax.swing.JSeparator jSeparator5;
  private javax.swing.JLabel lblAddress;
  private javax.swing.JLabel lblFEI;
  private javax.swing.JLabel lblID;
  private javax.swing.JLabel lblMail;
  private javax.swing.JLabel lblName;
  private javax.swing.JLabel lblSubTitle;
  private javax.swing.JLabel lblTel;
  private javax.swing.JLabel lblTitle2;
  private javax.swing.JTextField txtAddress;
  private javax.swing.JTextField txtMail;
  private javax.swing.JTextField txtName;
  private javax.swing.JTextField txtSearchbar;
  private javax.swing.JTextField txtTel;
  // End of variables declaration//GEN-END:variables
}
