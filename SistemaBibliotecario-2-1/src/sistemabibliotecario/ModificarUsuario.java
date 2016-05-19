/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;

import com.sun.glass.events.KeyEvent;
import comportamiento.PaneB;
import comportamiento.Usuario;
import comportamiento.JTextFieldLimit;
import conection.SQLMethods;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 * Panel para Modificar un Usuario
 *
 * @author mauricio, ruben
 */
public class ModificarUsuario extends javax.swing.JPanel {

  private Usuario usuario, cambio;

  /**
   * Crea una nueva forma ModificarUsuario
   */
  public ModificarUsuario() {
    initComponents();
  }

  /**
   * Crea una nueva forma ModificarUsuario con la información del usuario que
   * inició sesión
   *
   * @param usuario Usuario que inició sesión
   * @param cambio Información de Usuario a modificar
   */
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
    btnCerrarSesion = new javax.swing.JButton();
    btnCerrarSesion1 = new javax.swing.JButton();
    btnGestionarMaterial = new javax.swing.JButton();

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

    icnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_account_circle_black_48dp_2x.png"))); // NOI18N
    try{
      File imgF;
      System.out.println(cambio.getImgPath());
      imgF = new File(cambio.getImgPath());
      BufferedImage bImg = ImageIO.read(imgF);
      ImageIcon icon = new ImageIcon(
        bImg.getScaledInstance(100, 100, Image.SCALE_DEFAULT));
      icnUser.setIcon(icon);
    } catch (Exception e){
    }

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

    txtTel.setDocument(new JTextFieldLimit(20));
    txtTel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtTelActionPerformed(evt);
      }
    });
    txtTel.setText(cambio.getTel());

    txtAddress.setDocument(new JTextFieldLimit(100));
    txtAddress.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtAddressActionPerformed(evt);
      }
    });
    txtAddress.setText(cambio.getDirec());

    txtMail.setDocument(new JTextFieldLimit(50));

    txtName.setDocument(new JTextFieldLimit(50));

    txtName.setText(cambio.getName());

    jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator5.setForeground(new java.awt.Color(51, 51, 51));

    txtSearchbar.setForeground(new java.awt.Color(102, 102, 102));
    txtSearchbar.setDocument(new JTextFieldLimit(50));
    txtSearchbar.setText("Búsqueda...");
    txtSearchbar.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtSearchbarKeyPressed(evt);
      }
    });

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

    btnGestionarMaterial.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    btnGestionarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_note_add_black_24dp_1x.png"))); // NOI18N
    btnGestionarMaterial.setToolTipText("Préstamos");
    btnGestionarMaterial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnGestionarMaterialActionPerformed(evt);
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
        .addComponent(btnGestionarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
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
          .addGroup(layout.createSequentialGroup()
            .addGap(87, 87, 87)
            .addComponent(lblFEI))
          .addComponent(lblTitle2))
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(icnUVLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lblSubTitle, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(icnUser)
              .addComponent(lblID))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnSave)
            .addGap(112, 112, 112)
            .addComponent(btnCancel)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(12, 12, 12)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(icnUVLogo)
          .addComponent(icnBooks)
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblFEI)))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(txtSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(42, 42, 42)
            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnGestionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnGestionarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnCerrarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnGestionarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(42, 42, 42)
        .addComponent(lblSubTitle)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
              .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
              .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
              .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
              .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(46, 46, 46)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING))
            .addGap(108, 108, 108))
          .addGroup(layout.createSequentialGroup()
            .addGap(56, 56, 56)
            .addComponent(icnUser)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(lblID)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );

    txtMail.setText(cambio.getCorreo());
  }// </editor-fold>//GEN-END:initComponents

  private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    int btnOpt = JOptionPane.YES_NO_OPTION;
    int dResult = JOptionPane.showConfirmDialog(this,
        "¿Desea guardar el los cambios ?", " ", btnOpt);
    if (dResult == JOptionPane.YES_OPTION) {
      if (validateTexts()) {
        Usuario us = new Usuario();
        us.setId(cambio.getId());
        us.setName(txtName.getText());
        us.setTel(txtTel.getText());
        us.setDirec(txtAddress.getText());
        us.setCorreo(txtMail.getText());
        if (SQLMethods.modificarUsuario(us)) {
          MenuUsuario mu = new MenuUsuario(usuario);
          PaneB.callNxtPane(
              (JFrame) SwingUtilities.getWindowAncestor(this), mu);
        }
      }
    }    
  }//GEN-LAST:event_btnSaveActionPerformed

  private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    MenuUsuario mu = new MenuUsuario(usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), mu);  
  }//GEN-LAST:event_btnCancelActionPerformed

  private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtAddressActionPerformed

  private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtTelActionPerformed

  private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    ConsultarCatalogo cc = new ConsultarCatalogo(txtSearchbar.getText(), usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), cc);
  }//GEN-LAST:event_btnSearchActionPerformed

  private void btnGestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarUsuarioActionPerformed
    MenuUsuario mu = new MenuUsuario(usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), mu);   
  }//GEN-LAST:event_btnGestionarUsuarioActionPerformed

  private void btnGestionarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarPrestamoActionPerformed
    JOptionPane.showMessageDialog(null,
        "En construcción",
        "En construcción",
        JOptionPane.INFORMATION_MESSAGE); 
  }//GEN-LAST:event_btnGestionarPrestamoActionPerformed

  private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
    int btnOpt = JOptionPane.YES_NO_OPTION;
    int dResult = JOptionPane.showConfirmDialog(this,
        "¿Cerrar Sesión?", " ", btnOpt);
    if (dResult == JOptionPane.YES_OPTION) {
      java.awt.EventQueue.invokeLater(() -> {
        new MenuLogin().setVisible(true);
      });
      SwingUtilities.getWindowAncestor(this).dispose();
    } 
  }//GEN-LAST:event_btnCerrarSesionActionPerformed

  private void btnCerrarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesion1ActionPerformed
    MenuBibliotecario mc = new MenuBibliotecario(usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), mc);    
  }//GEN-LAST:event_btnCerrarSesion1ActionPerformed

  private void btnGestionarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarMaterialActionPerformed
    AgregarMaterial mt = new AgregarMaterial(usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), mt);
  }//GEN-LAST:event_btnGestionarMaterialActionPerformed

  private void txtSearchbarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchbarKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      btnSearch.doClick();
    }    
  }//GEN-LAST:event_txtSearchbarKeyPressed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCancel;
  private javax.swing.JButton btnCerrarSesion;
  private javax.swing.JButton btnCerrarSesion1;
  private javax.swing.JButton btnGestionarMaterial;
  private javax.swing.JButton btnGestionarPrestamo;
  public javax.swing.JButton btnGestionarUsuario;
  private javax.swing.JButton btnSave;
  private javax.swing.JButton btnSearch;
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
