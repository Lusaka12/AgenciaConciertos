/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;

/**
 *
 * @author david
 * @version 1.01
 */
public class Informe {
    private String identificador;//atributo que sirve para identificarel ID // valores validos cadena de caracteres de 20 caracteres
    private boolean revisado;//Campo para indicar si está revisado o no // valores validos true o false. 
    private String descripcion;//atributo que sirve para guardar la descripcion // valores validos cadena de caracteres de 20 caracteres

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public boolean isRevisado() {
        return revisado;
    }

    public void setRevisado(boolean revisado) {
        this.revisado = revisado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Informe(String identificador, boolean revisado, String descripcion) {
        this.identificador = identificador;
        this.revisado = revisado;
        this.descripcion = descripcion;
    }
   public Informe (Informe i) {
        this.identificador = i.getIdentificador();
        this.revisado = i.isRevisado();
        this.descripcion = i.getDescripcion();
   }    
   public Informe(){
       
   }

    @Override
    public String toString() {
        return "Informe{" + "identificador=" + identificador + ", revisado=" + revisado + ", descripcion=" + descripcion + '}';
    }
   public String data() {
       
       return "el identificador es " +this.getIdentificador()+" | " + "¿Está revisado? " +this.isRevisado()+ " | " + "Descripcion del informe: " +this.getDescripcion();
             
   }
   
}
