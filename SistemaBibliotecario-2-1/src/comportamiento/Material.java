/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamiento;

/**
 *
 * @author Vivie
 */
public class Material {

  private String folio;
  private String titulo;
  private String editorial;
  private String autor;
  private String estado;
  private String nroEjemplares;
  private int tipo;
  private String fechaPublicacion;

  /**
   *
   * @return
   */
  public String getFolio() {
    return folio;
  }

  /**
   *
   * @param folio
   */
  public void setFolio(String folio) {
    this.folio = folio;
  }

  /**
   *
   * @return
   */
  public String getTitulo() {
    return titulo;
  }

  /**
   *
   * @param titulo
   */
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  /**
   *
   * @return
   */
  public String getAutor() {
    return autor;
  }

  /**
   *
   * @param autor
   */
  public void setAutor(String autor) {
    this.autor = autor;
  }

  /**
   *
   * @return
   */
  public String getEditorial() {
    return editorial;
  }

  /**
   *
   * @param editorial
   */
  public void setEditorial(String editorial) {
    this.editorial = editorial;
  }

  /**
   *
   * @return
   */
  public String getEstado() {
    return estado;
  }

  /**
   *
   * @param estado
   */
  public void setEstado(String estado) {
    this.estado = estado;
  }

  /**
   *
   * @return
   */
  public String getNroEjemplares() {
    return nroEjemplares;
  }

  /**
   *
   * @param nroEjemplares
   */
  public void setNroEjemplares(String nroEjemplares) {
    this.nroEjemplares = nroEjemplares;
  }

  /**
   *
   * @return
   */
  public int getTipo() {
    return tipo;
  }

  /**
   *
   * @param tipo
   */
  public void setTipo(int tipo) {
    this.tipo = tipo;
  }

  /**
   *
   * @return
   */
  public String getFechaPublicacion() {
    return fechaPublicacion;
  }

  /**
   *
   * @param fechaPublicacion
   */
  public void setFechaPublicacion(String fechaPublicacion) {
    this.fechaPublicacion = fechaPublicacion;
  }

}
