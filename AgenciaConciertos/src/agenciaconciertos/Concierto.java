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
public class Concierto {
    private long id; //atributo que sirve para identificar al concierto //  valores validos numero entero mayor que 0
    private Date fechaHora; //atributo que sirve para idenfiticar la fechaHora y la hora del concierto// valores validos cadena de caracteres de 20 caracteres
                              
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Concierto(long id, Date fechaHora) {
        this.id = id;
        this.fechaHora = fechaHora;
        }
    
    public Concierto(Concierto c) {
        this.id = c.getId();
        this.fechaHora = c.getFechaHora();   
    }
    
    public Concierto() {
    }

    @Override
    public String toString() {
        return "Concierto{" + "identificador=" + id + ", fecha=" + fechaHora +'}';
    }
   
    public String data() {
        
        return this.getId()+"|"+this.getFechaHora();
    }
}


