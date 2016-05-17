/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabibliotecario;

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



  public String getFolio() {
    return folio;
  }

  public void setFolio(String folio) {
    this.folio = folio;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  
    public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }


  public String getEditorial() {
    return editorial;
  }

  public void setEditorial(String editorial) {
    this.editorial = editorial;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getNroEjemplares() {
    return nroEjemplares;
  }

  public void setNroEjemplares(String nroEjemplares) {
    this.nroEjemplares = nroEjemplares;
  }

  public int getTipo() {
    return tipo;
  }

  public void setTipo(int tipo) {
    this.tipo = tipo;
  }
  
    public String getFechaPublicacion() {
    return fechaPublicacion;
  }

  public void setFechaPublicacion(String fechaPublicacion) {
    this.fechaPublicacion = fechaPublicacion;
  }

  
}