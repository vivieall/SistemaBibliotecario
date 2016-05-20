/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamiento;

import java.util.Date;

/**
 * Usuarios tanto de inicio de sesión de bibliotecarios como de usuarios
 * lectores
 * @author mauricio
 */
public class Usuario {
  private String id;
  private String name;
  private String tel;
  private String direc;
  private String correo;
  private int tipo = -1;
  private String imgPath;
  private Date fechaIngreso;

  public Usuario() {
  }

  /**
   * Constructor sobrecargado
   * @param id Cuenta de Usuario !NULL
   * @param name Nombre del usuario 
   * @param tel Número telefónico, en String
   * @param direc Direccion
   * @param correo Correo Electronico
   * @param imgPath Dirección en disco 
   * @param fechaIngreso Fecha de registro
   */
  public Usuario(String id, String name, String tel, String direc, 
      String correo, String imgPath, Date fechaIngreso) {
    this.id = id;
    this.name = name;
    this.tel = tel;
    this.direc = direc;
    this.correo = correo;
    this.imgPath = imgPath;
    this.fechaIngreso = fechaIngreso;
  }

  /**
   * @return fecha de tipo Date
   */
  public Date getFechaIngreso() {
    return fechaIngreso;
  }

  /**
   * Setter de la fecha de Inscripción
   * @param fechaIngreso Fecha de inscripción/afiliación
   */
  public void setFechaIngreso(Date fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
  }

  /**
   * @return String que contiene la dirección en disco de la imagen de usuario 
   */
  public String getImgPath() {
    return imgPath;
  }

  /**
   * @param imgPath Ruta de la imágen
   */
  public void setImgPath(String imgPath) {
    this.imgPath = imgPath;
  }

  /**
   * @return ID/Nombre de cuenta de usuario
   */
  public String getId() {
    return id;
  }

  /**
   * @param id String con el ID/Nombre de usuario
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * @return Nombre de usuario
   */
  public String getName() {
    return name;
  }

  /**
   *
   * @param name Nombre de usuario a almacenar
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   *
   * @return Teléfono del usuario en String
   */
  public String getTel() {
    return tel;
  }

  /**
   *
   * @param tel Teléfono del usuario
   */
  public void setTel(String tel) {
    this.tel = tel;
  }

  /**
   *
   * @return Dirección del usuario
   */
  public String getDirec() {
    return direc;
  }

  /**
   *
   * @param direc Dirección del usuario a almacenar
   */
  public void setDirec(String direc) {
    this.direc = direc;
  }

  /**
   *
   * @return Correo electronico del usuario
   */
  public String getCorreo() {
    return correo;
  }

  /**
   *
   * @param correo Correo electronico a almacenar
   */
  public void setCorreo(String correo) {
    this.correo = correo;
  }

  /**
   *
   * @return Tipo de Usuario 1 para usuarios sin acceso
   * 2 para bibliotecarios, 3 para administradores
   */
  public int getTipo() {
    return tipo;
  }

  /**
   *
   * @param tipo Tipo de Usuario 1 para usuarios sin acceso
   * 2 para bibliotecarios, 3 para administradores
   */
  public void setTipo(int tipo) {
    this.tipo = tipo;
  }
  
  
}
