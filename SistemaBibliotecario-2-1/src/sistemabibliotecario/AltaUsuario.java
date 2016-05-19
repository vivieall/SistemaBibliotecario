/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;

import conection.SQLMethods;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ruben. mauricio
 */
public class AltaUsuario extends javax.swing.JPanel {

  private Usuario usuario;
  String alta;

  /**
   * Creates new form altaUsuario
   */
  public AltaUsuario() {
    initComponents();
  }

  /**
   * Crea un panel para el registro de un nuevo usuario
   * @param usuario Información de la cuenta activa
   * @param alta usuario_id del usuario a registrar
   */
  public AltaUsuario(Usuario usuario, String alta) {
    this.usuario = usuario;
    this.alta = alta;
    initComponents();
  }

  private boolean isValidText(JTextField field) {
    return (!field.getText().equals("") && !field.getText().trim().isEmpty());
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
    flag = validatePass();
    return flag;
  }

  private boolean validatePass() {
    char pass[] = txtPass.getPassword();
    char pass2[] = txtPass2.getPassword();
    String s1 = new String(pass);
    String s2 = new String(pass2);
    if (s1.equals(s2)) {
      return true;
    } else {
      JOptionPane.showMessageDialog(null,
          "Las contraseñas no coinciden",
          "Error",
          JOptionPane.ERROR_MESSAGE);
      return false;
    }

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
    icnBooks = new javax.swing.JLabel();
    lblFEI = new javax.swing.JLabel();
    lblTitle = new javax.swing.JLabel();
    icnUVLogo = new javax.swing.JLabel();
    lblNombre = new javax.swing.JLabel();
    lblTel = new javax.swing.JLabel();
    lblDireccion = new javax.swing.JLabel();
    icnUser = new javax.swing.JLabel();
    lblID = new javax.swing.JLabel();
    btnAccept = new javax.swing.JButton();
    lblMail = new javax.swing.JLabel();
    lblSubTitle = new javax.swing.JLabel();
    txtMail = new javax.swing.JTextField();
    txtAddress = new javax.swing.JTextField();
    txtName = new javax.swing.JTextField();
    txtTel = new javax.swing.JTextField();
    lblPass = new javax.swing.JLabel();
    lblPass2 = new javax.swing.JLabel();
    txtPass2 = new javax.swing.JPasswordField();
    txtPass = new javax.swing.JPasswordField();
    btnCancel = new javax.swing.JButton();
    jSeparator5 = new javax.swing.JSeparator();
    txtSearchbar = new javax.swing.JTextField();
    btnSearch = new javax.swing.JButton();
    btnGestionarUsuario = new javax.swing.JButton();
    btnGestionarPrestamo = new javax.swing.JButton();
    btnCerrarSesion = new javax.swing.JButton();
    btnCerrarSesion1 = new javax.swing.JButton();
    jSeparator4 = new javax.swing.JSeparator();
    jComboBox1 = new javax.swing.JComboBox<>();

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setMinimumSize(new java.awt.Dimension(755, 600));
    jPanel1.setPreferredSize(new java.awt.Dimension(755, 600));

    icnBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1.png"))); // NOI18N

    lblFEI.setText("Facultad de Estadística e Informática, Universidad Veracruzana");

    lblTitle.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    lblTitle.setForeground(new java.awt.Color(0, 0, 102));
    lblTitle.setText("Sistema Bibliotecario \"BUAEEI\"");

    icnUVLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uv1.png"))); // NOI18N

    lblNombre.setText("Nombre: ");
    lblNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    lblNombre.setMinimumSize(new java.awt.Dimension(110, 37));
    lblNombre.setName(""); // NOI18N

    lblTel.setText("Teléfono:");
    lblTel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    lblTel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    lblTel.setMinimumSize(new java.awt.Dimension(110, 37));
    lblTel.setName(""); // NOI18N

    lblDireccion.setText("Dirección:");
    lblDireccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    lblDireccion.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    lblDireccion.setMinimumSize(new java.awt.Dimension(110, 37));
    lblDireccion.setName(""); // NOI18N

    icnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_add_a_photo_black_48dp_2x.png"))); // NOI18N
    icnUser.setToolTipText("Agregar Imagen");
    icnUser.setMaximumSize(new java.awt.Dimension(100, 100));
    icnUser.setMinimumSize(new java.awt.Dimension(100, 100));
    icnUser.setPreferredSize(new java.awt.Dimension(100, 100));
    icnUser.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        icnUserMouseClicked(evt);
      }
    });

    lblID.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    lblID.setText("ID: zS1401643 ");
    lblID.setText("ID: " + alta);

    btnAccept.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    btnAccept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_save_black_24dp_1x.png"))); // NOI18N
    btnAccept.setToolTipText("Aceptar");
    btnAccept.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAcceptActionPerformed(evt);
      }
    });

    lblMail.setText("Correo:");
    lblMail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    lblMail.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    lblMail.setMinimumSize(new java.awt.Dimension(110, 37));
    lblMail.setName(""); // NOI18N

    lblSubTitle.setBackground(new java.awt.Color(204, 204, 204));
    lblSubTitle.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    lblSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblSubTitle.setText("Registrar Usuario");
    lblSubTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
    lblSubTitle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

    txtName.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtNameActionPerformed(evt);
      }
    });

    lblPass.setText("Contraseña:");
    lblPass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    lblPass.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    lblPass.setMinimumSize(new java.awt.Dimension(110, 37));
    lblPass.setName(""); // NOI18N
    lblPass.setVisible(false);

    lblPass2.setText("Confirmar Contraseña:");
    lblPass2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    lblPass2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    lblPass2.setMinimumSize(new java.awt.Dimension(110, 37));
    lblPass2.setName(""); // NOI18N
    lblPass2.setVisible(false);

    txtPass2.setVisible(false);

    txtPass.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtPassActionPerformed(evt);
      }
    });
    txtPass.setVisible(false);

    btnCancel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_cancel_black_24dp_1x.png"))); // NOI18N
    btnCancel.setToolTipText("Cancelar");
    btnCancel.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCancelActionPerformed(evt);
      }
    });

    jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator5.setForeground(new java.awt.Color(51, 51, 51));

    txtSearchbar.setForeground(new java.awt.Color(102, 102, 102));
    txtSearchbar.setText("Búsqueda...");

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

    jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator4.setForeground(new java.awt.Color(51, 51, 51));

    jComboBox1.setMaximumRowCount(2);
    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Bibliotecario" }));
    jComboBox1.setToolTipText("Tipo de Usuario");
    jComboBox1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jComboBox1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(0, 22, Short.MAX_VALUE)
        .addComponent(icnBooks)
        .addGap(0, 22, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(lblSubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblFEI)
          .addComponent(lblTitle))
        .addGap(0, 22, Short.MAX_VALUE)
        .addComponent(icnUVLogo)
        .addGap(0, 25, Short.MAX_VALUE))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(txtSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnGestionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnGestionarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnCerrarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(25, 25, 25))
      .addComponent(jSeparator5)
      .addComponent(jSeparator4)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(icnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblID)
          .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(27, 27, 27)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(btnAccept)
            .addGap(138, 138, 138)
            .addComponent(btnCancel))
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGroup(jPanel1Layout.createSequentialGroup()
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(lblPass2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(10, 10, 10)
                  .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addGap(10, 10, 10)
                  .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addGap(10, 10, 10)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtTel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(icnUVLogo)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblFEI))
          .addComponent(icnBooks))
        .addGap(20, 20, 20)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(txtSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(42, 42, 42)
            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnGestionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnGestionarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnCerrarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(42, 42, 42)
        .addComponent(lblSubTitle)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(icnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
              .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(22, 22, 22)
            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(btnAccept)
              .addComponent(btnCancel))
            .addGap(32, 32, 32))))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
    int btnOpt = JOptionPane.YES_NO_OPTION;
    int dResult = JOptionPane.showConfirmDialog(this,
        "¿Desea guardar el usuario " + alta + "?", " ", btnOpt);
    if (dResult == JOptionPane.YES_OPTION) {
      if (validateTexts()) {
        Usuario us = new Usuario();
        us.setId(alta);
        us.setName(txtName.getText());
        us.setTel(txtTel.getText());
        us.setDirec(txtAddress.getText());
        us.setCorreo(txtMail.getText());
        us.setTipo(jComboBox1.getSelectedIndex() + 1);
        us.setImgPath(usuario.getImgPath());
        us.setFechaIngreso(new java.util.Date(System.currentTimeMillis()));
        String pass = new String(txtPass.getPassword());
        if (jComboBox1.getSelectedItem() == "Bibliotecario") {
          if (SQLMethods.agregarUsuario(us, pass)) {
            MenuUsuario mu = new MenuUsuario(usuario);
            PaneB.callNxtPane((JFrame) SwingUtilities
                .getWindowAncestor(this), mu);
          }
        } else if (SQLMethods.agregarUsuario(us)) {
          MenuUsuario mu = new MenuUsuario(usuario);
          PaneB.callNxtPane((JFrame) SwingUtilities
              .getWindowAncestor(this), mu);
        }
      }

    }

    // TODO add your handling code here:
  }//GEN-LAST:event_btnAcceptActionPerformed

  private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtNameActionPerformed

  private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtPassActionPerformed

  private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    MenuUsuario mu = new MenuUsuario(usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), mu);
  }//GEN-LAST:event_btnCancelActionPerformed

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
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), rp);    // TODO add your handling code here:
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
    }// TODO add your handling code here:
  }//GEN-LAST:event_btnCerrarSesionActionPerformed

  private void btnCerrarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesion1ActionPerformed
    // TODO add your handling code here:
    MenuBibliotecario mc = new MenuBibliotecario(usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), mc);    // TODO add your handling code here:
  }//GEN-LAST:event_btnCerrarSesion1ActionPerformed

  private void icnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icnUserMouseClicked
    JFileChooser fc = new JFileChooser();
    fc.addChoosableFileFilter(new FileNameExtensionFilter("Images",
        "jpeg", "jpg", "png"));
    fc.setAcceptAllFileFilterUsed(false);
    int returnVal = fc.showOpenDialog(jPanel1);

    if (returnVal == JFileChooser.APPROVE_OPTION) {
      File sFile = fc.getSelectedFile();
      File dFile = new File("udata/r_usricn_" + alta + ".png");
      try {
        BufferedImage bImg = ImageIO.read(sFile);
        ImageIcon icon = new ImageIcon(
            bImg.getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        icnUser.setIcon(icon);
        ImageIO.write(bImg, "png", dFile);
        dFile.getParentFile().mkdirs();
        dFile.createNewFile();
        usuario.setImgPath(dFile.getPath());
        //Files.copy(sFile.toPath(), dFile.toPath(),
        //    StandardCopyOption.REPLACE_EXISTING);

      } catch (IOException ex) {
        Logger.getLogger(AltaUsuario.class.getName()).log(Level.SEVERE, null, ex);
      }

    }
// TODO add your handling code here:
  }//GEN-LAST:event_icnUserMouseClicked

  private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    if (jComboBox1.getSelectedItem() == "Usuario") {
      lblPass.setVisible(false);
      lblPass2.setVisible(false);
      txtPass.setVisible(false);
      txtPass2.setVisible(false);
    }
    if (jComboBox1.getSelectedItem() == "Bibliotecario") {
      lblPass.setVisible(true);
      lblPass2.setVisible(true);
      txtPass.setVisible(true);
      txtPass2.setVisible(true);
    }

    usuario.setTipo(jComboBox1.getSelectedIndex() + 1);
    // TODO add your handling code here:
  }//GEN-LAST:event_jComboBox1ActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAccept;
  private javax.swing.JButton btnCancel;
  private javax.swing.JButton btnCerrarSesion;
  private javax.swing.JButton btnCerrarSesion1;
  private javax.swing.JButton btnGestionarPrestamo;
  public javax.swing.JButton btnGestionarUsuario;
  private javax.swing.JButton btnSearch;
  private javax.swing.JLabel icnBooks;
  private javax.swing.JLabel icnUVLogo;
  private javax.swing.JLabel icnUser;
  private javax.swing.JComboBox<String> jComboBox1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JSeparator jSeparator4;
  private javax.swing.JSeparator jSeparator5;
  private javax.swing.JLabel lblDireccion;
  private javax.swing.JLabel lblFEI;
  private javax.swing.JLabel lblID;
  private javax.swing.JLabel lblMail;
  private javax.swing.JLabel lblNombre;
  private javax.swing.JLabel lblPass;
  private javax.swing.JLabel lblPass2;
  private javax.swing.JLabel lblSubTitle;
  private javax.swing.JLabel lblTel;
  private javax.swing.JLabel lblTitle;
  private javax.swing.JTextField txtAddress;
  private javax.swing.JTextField txtMail;
  private javax.swing.JTextField txtName;
  private javax.swing.JPasswordField txtPass;
  private javax.swing.JPasswordField txtPass2;
  private javax.swing.JTextField txtSearchbar;
  private javax.swing.JTextField txtTel;
  // End of variables declaration//GEN-END:variables
}
