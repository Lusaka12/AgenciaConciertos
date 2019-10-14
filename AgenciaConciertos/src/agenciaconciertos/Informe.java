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
    private long id;//atributo que sirve para identificarel ID //  valores validos numero entero mayor que 0
    private boolean revisado;//Campo para indicar si está revisado o no // valores validos true o false. 
    private String descripcion;//atributo que sirve para guardar la descripcion // valores validos cadena de caracteres de 20 caracteres

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Informe(long id, boolean revisado, String descripcion) {
        this.id = id;
        this.revisado = revisado;
        this.descripcion = descripcion;
    }
   public Informe (Informe i) {
        this.id = i.getId();
        this.revisado = i.isRevisado();
        this.descripcion = i.getDescripcion();
   }    
   public Informe(){
       
   }

    @Override
    public String toString() {
        return "Informe{" + "identificador=" + id + ", revisado=" + revisado + ", descripcion=" + descripcion + '}';
    }
   public String data() {
       
       return this.getId()+"|"+this.isRevisado()+"|"+this.getDescripcion();
             
   }
   
}
