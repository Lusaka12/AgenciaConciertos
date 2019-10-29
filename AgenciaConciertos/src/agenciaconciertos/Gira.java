/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;
import java.sql.Date;
/**
 *
 * @author david
 * @version 1.01
 */
public class Gira {
    protected long id;//atributo que sirve para identificar a la gira //  valores validos numero entero mayor que 0
    public Date fechaApertura;//atributo que sirve para identificar la fecha de apertura// valores validos cadena de caracteres de 20 caracteres
    public Date fechaCierre;//atributo que sirve para identificar la fecha de cierre // valores validos cadena de caracteres de 20 caracteres
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombreNegociar(String nombreNegociar) {
        this.nombre = nombre;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public Gira(Date fechaApertura, Date fechaCierre,String nombre) {
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.nombre=nombre;
    }
    
     public Gira(Gira g) {
        this.fechaApertura = g.getFechaApertura();
        this.fechaCierre = g.getFechaCierre();
     }
            
    public Gira () {
    }

    @Override
    public String toString() {
        return "Gira" + "identificador=" + id + ", fechaApertura=" + fechaApertura + ", fechaCierre=" + fechaCierre + ", nombre="+nombre+'}';
    }
    
    public String data(){
        
        return this.getId()+"|" +this.getFechaApertura()+ "|"+this.getFechaCierre()+"|"+this.getNombre();
       
    }
}
