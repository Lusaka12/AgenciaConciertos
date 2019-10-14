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
public class Gira {
    private long id;//atributo que sirve para identificar a la gira //  valores validos numero entero mayor que 0
    private String fechaApertura;//atributo que sirve para identificar la fecha de apertura// valores validos cadena de caracteres de 20 caracteres
    private String fechaCierre;//atributo que sirve para identificar la fecha de cierre // valores validos cadena de caracteres de 20 caracteres

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public Gira(long id, String fechaApertura, String fechaCierre) {
        this.id = id;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
    }
    
     public Gira(Gira g) {
        this.id = g.getId();
        this.fechaApertura = g.getFechaApertura();
        this.fechaCierre = g.getFechaCierre();
     }
            
    public Gira () {
    }

    @Override
    public String toString() {
        return "Gira" + "identificador=" + id + ", fechaApertura=" + fechaApertura + ", fechaCierre=" + fechaCierre + '}';
    }
    
    public String data(){
        
        return this.getId()+"|" +this.getFechaApertura()+ "|"+this.getFechaCierre();
       
    }
}
