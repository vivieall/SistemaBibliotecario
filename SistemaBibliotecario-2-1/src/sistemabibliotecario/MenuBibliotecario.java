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
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author mauricio, ruben
 */
public class MenuBibliotecario extends javax.swing.JPanel {

  private Usuario usuario;

  /**
   * Getter para la variable Usuario
   *
   * @return Usuario que inició sesión
   */
  public Usuario getUsuario() {
    return usuario;
  }

  /**
   * Setter para la variable Usuario
   *
   * @param us información del usuario que inició sesión
   */
  public void setUsuario(Usuario us) {
    this.usuario = us;
  }

  /**
   * Crea un panel con la información del Bibliotecario
   *
   * @param user Información del usuario bibliotecario
   */
  public MenuBibliotecario(Usuario user) {
    this.usuario = user;
    initComponents();
  }

  /**
   * Constructor por defecto de Panel
   */
  public MenuBibliotecario() {
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

    jSeparator4 = new javax.swing.JSeparator();
    jSeparator5 = new javax.swing.JSeparator();
    icnBooks = new javax.swing.JLabel();
    lblFEI = new javax.swing.JLabel();
    lblTitle = new javax.swing.JLabel();
    icnUVLogo = new javax.swing.JLabel();
    lblNombre = new javax.swing.JLabel();
    lblTel = new javax.swing.JLabel();
    lblMail = new javax.swing.JLabel();
    lblAddress = new javax.swing.JLabel();
    txtName = new javax.swing.JLabel();
    txtMail = new javax.swing.JLabel();
    txtAddress = new javax.swing.JLabel();
    txtTel = new javax.swing.JLabel();
    txtSubTitle = new javax.swing.JLabel();
    icnUser = new javax.swing.JLabel();
    lblID = new javax.swing.JLabel();
    btnGestionarUsuario = new javax.swing.JButton();
    btnGestionarPrestamo = new javax.swing.JButton();
    btnCerrarSesion = new javax.swing.JButton();
    txtSearchbar = new javax.swing.JTextField();
    btnSearch = new javax.swing.JButton();
    btnCerrarSesion1 = new javax.swing.JButton();
    lblFecha = new javax.swing.JLabel();
    txtFecha = new javax.swing.JLabel();
    btnGestionarMaterial = new javax.swing.JButton();

    setBackground(new java.awt.Color(255, 255, 255));
    setMinimumSize(new java.awt.Dimension(755, 600));
    setPreferredSize(new java.awt.Dimension(755, 600));

    jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator4.setForeground(new java.awt.Color(51, 51, 51));

    jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
    jSeparator5.setForeground(new java.awt.Color(51, 51, 51));

    icnBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b1.png"))); // NOI18N

    lblFEI.setText("Facultad de Estadística e Informática, Universidad Veracruzana");

    lblTitle.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    lblTitle.setForeground(new java.awt.Color(0, 0, 102));
    lblTitle.setText("Sistema Bibliotecario \"BUAEEI\"");

    icnUVLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uv1.png"))); // NOI18N

    lblNombre.setBackground(new java.awt.Color(204, 204, 204));
    lblNombre.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblNombre.setText("Nombre: ");

    lblTel.setBackground(new java.awt.Color(204, 204, 204));
    lblTel.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblTel.setText("Telefono:");

    lblMail.setBackground(new java.awt.Color(204, 204, 204));
    lblMail.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblMail.setText("Correo: ");

    lblAddress.setBackground(new java.awt.Color(204, 204, 204));
    lblAddress.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblAddress.setText("Dirección:");

    txtName.setBackground(new java.awt.Color(204, 204, 204));
    txtName.setText("Maria Rosa Lopez");
    txtName.setText(usuario.getName());
    txtName.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

    txtMail.setBackground(new java.awt.Color(204, 204, 204));
    txtMail.setText("lopezmr@gmail.com");
    txtMail.setText(usuario.getCorreo());
    txtMail.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

    txtAddress.setBackground(new java.awt.Color(204, 204, 204));
    txtAddress.setText("Av. Jose Azueta #123");
    txtAddress.setText(usuario.getDirec());
    txtAddress.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

    txtTel.setBackground(new java.awt.Color(204, 204, 204));
    txtTel.setText("22-88-54-45-34");
    txtTel.setText(usuario.getTel());
    txtTel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

    txtSubTitle.setBackground(new java.awt.Color(204, 204, 204));
    txtSubTitle.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    txtSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    txtSubTitle.setText("Bibliotecario");
    txtSubTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
    txtSubTitle.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

    icnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/14-128.png"))); // NOI18N
    try{
      File imgF;
      System.out.println(usuario.getImgPath());
      imgF = new File(usuario.getImgPath());
      BufferedImage bImg = ImageIO.read(imgF);
      ImageIcon icon = new ImageIcon(
        bImg.getScaledInstance(100, 100, Image.SCALE_DEFAULT));
      icnUser.setIcon(icon);
    } catch (Exception e){
    }

    lblID.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
    lblID.setText("text");
    lblID.setText("ID: " + usuario.getId());

    btnGestionarUsuario.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    btnGestionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_account_box_black_24dp_1x.png"))); // NOI18N
    btnGestionarUsuario.setToolTipText("Usuarios");
    btnGestionarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnGestionarUsuarioMouseClicked(evt);
      }
    });
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

    txtSearchbar.setForeground(new java.awt.Color(102, 102, 102));
    txtSearchbar.setDocument(new JTextFieldLimit(100));
    txtSearchbar.setText("Búsqueda...");
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
    txtSearchbar.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtSearchbarKeyPressed(evt);
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

    btnCerrarSesion1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    btnCerrarSesion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_home_black_24dp_1x.png"))); // NOI18N
    btnCerrarSesion1.setToolTipText("Inicio");
    btnCerrarSesion1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCerrarSesion1ActionPerformed(evt);
      }
    });

    lblFecha.setBackground(new java.awt.Color(204, 204, 204));
    lblFecha.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 13)); // NOI18N
    lblFecha.setText("F.Ingreso");

    txtFecha.setBackground(new java.awt.Color(204, 204, 204));
    txtFecha.setText("0/0/0");
    if (usuario.getFechaIngreso() != null){
      txtFecha.setText(usuario.getFechaIngreso().toString());
    }
    txtFecha.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

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
      .addComponent(jSeparator5)
      .addComponent(jSeparator4)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
              .addComponent(icnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lblID))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(layout.createSequentialGroup()
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addComponent(txtSubTitle, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(icnBooks)
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(lblTitle)
          .addComponent(lblFEI))
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(icnUVLogo)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(txtSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnGestionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnGestionarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnGestionarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnCerrarSesion)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnCerrarSesion1))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(icnBooks)
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblFEI))
          .addComponent(icnUVLogo))
        .addGap(20, 20, 20)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(btnGestionarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnGestionarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(42, 42, 42)
            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(btnCerrarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnGestionarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(42, 42, 42)
        .addComponent(txtSubTitle)
        .addGap(50, 50, 50)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(icnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblID))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(167, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btnGestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarUsuarioActionPerformed
    MenuUsuario mu = new MenuUsuario(usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), mu);
  }//GEN-LAST:event_btnGestionarUsuarioActionPerformed

  private void btnGestionarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarPrestamoActionPerformed
    RegistrarPrestamo rp = new RegistrarPrestamo(usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), rp);
  }//GEN-LAST:event_btnGestionarPrestamoActionPerformed

  private void btnGestionarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionarUsuarioMouseClicked

  }//GEN-LAST:event_btnGestionarUsuarioMouseClicked

  private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
    int btnOpt = JOptionPane.YES_NO_OPTION;
    int dResult = JOptionPane.showConfirmDialog(this,
        "¿Cerrar Sesión?", " ", btnOpt);
    if (dResult == JOptionPane.YES_OPTION) {
      MenuLogin ml = new MenuLogin();
      PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this),
          ml.getMainPanel());
    }
  }//GEN-LAST:event_btnCerrarSesionActionPerformed

  private void txtSearchbarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchbarFocusGained
    if (txtSearchbar.getText().equals("Búsqueda...")) {
      txtSearchbar.setText("");
      txtSearchbar.setForeground(Color.black);
  }//GEN-LAST:event_txtSearchbarFocusGained
  }
  private void txtSearchbarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchbarFocusLost
    if (txtSearchbar.getText().equals("")) {
      txtSearchbar.setText("Búsqueda...");
      txtSearchbar.setForeground(Color.gray);
    }    
  }//GEN-LAST:event_txtSearchbarFocusLost

  private void txtSearchbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchbarActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtSearchbarActionPerformed

  private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    ConsultarCatalogo cc = new ConsultarCatalogo(
        txtSearchbar.getText(), usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), cc);
  }//GEN-LAST:event_btnSearchActionPerformed

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

  /**
   * Método principal que llama al Panel
   *
   * @param args
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
    //</editor-fold>
    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new MenuBibliotecario().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCerrarSesion;
  private javax.swing.JButton btnCerrarSesion1;
  private javax.swing.JButton btnGestionarMaterial;
  private javax.swing.JButton btnGestionarPrestamo;
  public javax.swing.JButton btnGestionarUsuario;
  private javax.swing.JButton btnSearch;
  private javax.swing.JLabel icnBooks;
  private javax.swing.JLabel icnUVLogo;
  private javax.swing.JLabel icnUser;
  private javax.swing.JSeparator jSeparator4;
  private javax.swing.JSeparator jSeparator5;
  private javax.swing.JLabel lblAddress;
  private javax.swing.JLabel lblFEI;
  private javax.swing.JLabel lblFecha;
  private javax.swing.JLabel lblID;
  private javax.swing.JLabel lblMail;
  private javax.swing.JLabel lblNombre;
  private javax.swing.JLabel lblTel;
  private javax.swing.JLabel lblTitle;
  private javax.swing.JLabel txtAddress;
  private javax.swing.JLabel txtFecha;
  private javax.swing.JLabel txtMail;
  private javax.swing.JLabel txtName;
  private javax.swing.JTextField txtSearchbar;
  private javax.swing.JLabel txtSubTitle;
  private javax.swing.JLabel txtTel;
  // End of variables declaration//GEN-END:variables

}
