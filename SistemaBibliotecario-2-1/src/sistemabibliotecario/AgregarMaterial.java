/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;

import comportamiento.PaneB;
import comportamiento.Material;
import comportamiento.Usuario;
import conection.SQLMethods;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author vivie
 */
public class AgregarMaterial extends javax.swing.JPanel {

  // Atributos de mi clase
  private Usuario usuario;
  String agregar;

  public AgregarMaterial(Usuario user) {
    this.usuario = user;
    initComponents();
  }

  /**
   * Clase de mi JPANEL
   */
  public AgregarMaterial() {
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

    jPanel1 = new javax.swing.JPanel();
    jSeparator4 = new javax.swing.JSeparator();
    jSeparator5 = new javax.swing.JSeparator();
    icnBooks = new javax.swing.JLabel();
    lblFEI = new javax.swing.JLabel();
    lblTitle = new javax.swing.JLabel();
    icnUVLogo = new javax.swing.JLabel();
    btnCerrarSesion = new javax.swing.JButton();
    btnCerrarSesion1 = new javax.swing.JButton();
    btnGestionarMateriales = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    btnModificarMaterial = new javax.swing.JButton();
    btnEliminarMaterial = new javax.swing.JButton();
    btnGuardar = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    txtTitulo = new javax.swing.JTextField();
    txtAutor = new javax.swing.JTextField();
    txtPublicacion = new javax.swing.JTextField();
    txtFolio = new javax.swing.JTextField();
    txtEditorial = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    comboTiposMateriales = new javax.swing.JComboBox<>();
    txtSearchbar = new javax.swing.JTextField();
    btnSearch = new javax.swing.JButton();

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setMinimumSize(new java.awt.Dimension(755, 600));

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

    btnGestionarMateriales.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    btnGestionarMateriales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_note_add_black_24dp_1x.png"))); // NOI18N
    btnGestionarMateriales.setToolTipText("Agregar");
    btnGestionarMateriales.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnGestionarMaterialesActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
    jLabel1.setText("      ~ Agregar libro ~     ");
    jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    btnModificarMaterial.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    btnModificarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_restore_page_black_24dp_1x.png"))); // NOI18N
    btnModificarMaterial.setToolTipText("Modificar");
    btnModificarMaterial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnModificarMaterialActionPerformed(evt);
      }
    });

    btnEliminarMaterial.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
    btnEliminarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic_delete_sweep_black_24dp_1x.png"))); // NOI18N
    btnEliminarMaterial.setToolTipText("Eliminar");
    btnEliminarMaterial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEliminarMaterialActionPerformed(evt);
      }
    });

    btnGuardar.setText("Guardar");
    btnGuardar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnGuardarActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 14)); // NOI18N
    jLabel2.setText("Folio:");

    jLabel3.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 14)); // NOI18N
    jLabel3.setText("Título:");

    jLabel4.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 14)); // NOI18N
    jLabel4.setText("Editorial:");

    jLabel5.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 14)); // NOI18N
    jLabel5.setText("Autor:");

    jLabel8.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 14)); // NOI18N
    jLabel8.setText("Fecha de Publicación:");

    txtPublicacion.setText("         dd/mm/aa");
    txtPublicacion.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtPublicacionActionPerformed(evt);
      }
    });

    txtFolio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtFolioActionPerformed(evt);
      }
    });

    txtEditorial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtEditorialActionPerformed(evt);
      }
    });

    jLabel9.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 14)); // NOI18N
    jLabel9.setText("Tipo: ");

    comboTiposMateriales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Tesis", "Audiovisual", "Revistas" }));
    comboTiposMateriales.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        comboTiposMaterialesActionPerformed(evt);
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

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jSeparator5)
      .addComponent(jSeparator4)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(icnBooks)
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(lblTitle)
          .addComponent(lblFEI))
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(icnUVLogo)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(txtSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(70, 70, 70)
        .addComponent(btnGestionarMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnModificarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnEliminarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnCerrarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(btnGuardar)
            .addGap(326, 326, 326))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addGap(297, 297, 297))))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(44, 44, 44)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGroup(jPanel1Layout.createSequentialGroup()
              .addComponent(jLabel4)
              .addGap(3, 3, 3)
              .addComponent(txtEditorial))
            .addGroup(jPanel1Layout.createSequentialGroup()
              .addComponent(jLabel8)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(txtPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3)
              .addComponent(jLabel2))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(txtFolio)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel5)
                  .addComponent(jLabel9))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(comboTiposMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        .addContainerGap(37, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(icnBooks)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblFEI))
          .addComponent(icnUVLogo))
        .addGap(20, 20, 20)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(42, 42, 42)
            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(btnCerrarSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnGestionarMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnModificarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnEliminarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(txtSearchbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(27, 27, 27)
        .addComponent(jLabel1)
        .addGap(28, 28, 28)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(24, 24, 24)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(jLabel5)
          .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(33, 33, 33)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel9)
          .addComponent(comboTiposMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(31, 31, 31)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8)
          .addComponent(txtPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
        .addComponent(btnGuardar)
        .addGap(38, 38, 38))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 755, Short.MAX_VALUE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 600, Short.MAX_VALUE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
    int btnOpt = JOptionPane.YES_NO_OPTION;
    int dResult = JOptionPane.showConfirmDialog(this,
        "¿Cerrar Sesión?", " ", btnOpt);
    if (dResult == JOptionPane.YES_OPTION) {
      java.awt.EventQueue.invokeLater(() -> {
        MenuLogin.getInstance().setVisible(true);
      });
      SwingUtilities.getWindowAncestor(this).dispose();
    }
  }//GEN-LAST:event_btnCerrarSesionActionPerformed

  private void btnCerrarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesion1ActionPerformed
    MenuBibliotecario mc = new MenuBibliotecario(usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), mc);
  }//GEN-LAST:event_btnCerrarSesion1ActionPerformed

  private void btnGestionarMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarMaterialesActionPerformed
    AgregarMaterial mt = new AgregarMaterial(usuario);
    PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), mt);
  }//GEN-LAST:event_btnGestionarMaterialesActionPerformed

  private void btnModificarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMaterialActionPerformed
    JOptionPane.showMessageDialog(null,
        "En construcción",
        "En construcción",
        JOptionPane.INFORMATION_MESSAGE);
  }//GEN-LAST:event_btnModificarMaterialActionPerformed

  private void btnEliminarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMaterialActionPerformed
    JOptionPane.showMessageDialog(null,
        "En construcción",
        "En construcción",
        JOptionPane.ERROR_MESSAGE);
  }//GEN-LAST:event_btnEliminarMaterialActionPerformed

  private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    int btnOpt = JOptionPane.YES_NO_OPTION;
    int dResult = JOptionPane.showConfirmDialog(this,
        "¿Desea guardar el material?", " ", btnOpt);
    if (dResult == JOptionPane.YES_OPTION) {
      if (validateTexts()) {
        Material mt = new Material();
        mt.setTitulo(txtTitulo.getText());
        mt.setFolio(txtFolio.getText());
        mt.setAutor(txtAutor.getText());
        mt.setEditorial(txtEditorial.getText());
        mt.setTipo(comboTiposMateriales.getSelectedIndex() + 1);
        mt.setFechaPublicacion(txtPublicacion.getText());
        //mt.setFechaIngreso(new java.util.Date(System.currentTimeMillis()));

        if (SQLMethods.agregarMaterial(mt)) {
          AgregarMaterial ml = new AgregarMaterial(usuario);
          PaneB.callNxtPane((JFrame) SwingUtilities.getWindowAncestor(this), ml);
        }

      }
    }
  }//GEN-LAST:event_btnGuardarActionPerformed

  private void txtFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolioActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtFolioActionPerformed

  private void txtEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtEditorialActionPerformed

  private void comboTiposMaterialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTiposMaterialesActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_comboTiposMaterialesActionPerformed

  private void txtPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPublicacionActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtPublicacionActionPerformed

  private void txtSearchbarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchbarFocusGained
    if (txtSearchbar.getText().equals("Búsqueda...")) {
      txtSearchbar.setText("");
      txtSearchbar.setForeground(Color.black);
    }
  }//GEN-LAST:event_txtSearchbarFocusGained

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

  private boolean isValidText(JTextField field) {
    return (!field.getText().equals("") && !field.getText().trim().isEmpty());
  }

  private boolean validateTexts() {
    boolean flag = isValidText(txtTitulo);
    if (flag) {
      flag = isValidText(txtFolio);
      if (flag) {
        isValidText(txtAutor);
        if (flag) {
          isValidText(txtEditorial);
        }
        if (flag) {
          isValidText(txtPublicacion);
        }
      }
    }
    return flag;
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCerrarSesion;
  private javax.swing.JButton btnCerrarSesion1;
  private javax.swing.JButton btnEliminarMaterial;
  private javax.swing.JButton btnGestionarMateriales;
  private javax.swing.JButton btnGuardar;
  private javax.swing.JButton btnModificarMaterial;
  private javax.swing.JButton btnSearch;
  public javax.swing.JComboBox<String> comboTiposMateriales;
  private javax.swing.JLabel icnBooks;
  private javax.swing.JLabel icnUVLogo;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JSeparator jSeparator4;
  private javax.swing.JSeparator jSeparator5;
  private javax.swing.JLabel lblFEI;
  private javax.swing.JLabel lblTitle;
  private javax.swing.JTextField txtAutor;
  private javax.swing.JTextField txtEditorial;
  private javax.swing.JTextField txtFolio;
  private javax.swing.JTextField txtPublicacion;
  private javax.swing.JTextField txtSearchbar;
  private javax.swing.JTextField txtTitulo;
  // End of variables declaration//GEN-END:variables
}
