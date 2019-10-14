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
public class Concierto {
    private long id; //atributo que sirve para identificar al concierto //  valores validos numero entero mayor que 0
    private String fecha; //atributo que sirve para idenfiticar la fecha del concierto// valores validos cadena de caracteres de 20 caracteres
    private String hora; //atributo que sirve para idenfiticar la hora del concierto//valores validos cadena de caracteres de 20 caracteres

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Concierto(long id, String fecha, String hora) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        }
    
    public Concierto(Concierto c) {
        this.id = c.getId();
        this.fecha = c.getFecha();
        this.hora = c.getHora();
    }
    
    public Concierto() {
    }

    @Override
    public String toString() {
        return "Concierto{" + "identificador=" + id + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
   
    public String data() {
        
        return this.getId()+"|"+this.getFecha()+"|"+this.getHora();
    }
}


