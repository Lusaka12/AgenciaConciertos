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
    private String identificador; //atributo que sirve para identificar al concierto // valores validos cadena de caracteres de 20 caracteres
    private String fecha; //atributo que sirve para idenfiticar la fecha del concierto// valores validos cadena de caracteres de 20 caracteres
    private String hora; //atributo que sirve para idenfiticar la hora del concierto//valores validos cadena de caracteres de 20 caracteres

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
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

    public Concierto(String identificador, String fecha, String hora) {
        this.identificador = identificador;
        this.fecha = fecha;
        this.hora = hora;
        }
    
    public Concierto(Concierto c) {
        this.identificador = c.getIdentificador();
        this.fecha = c.getFecha();
        this.hora = c.getHora();
    }
    
    public Concierto() {
    }

    @Override
    public String toString() {
        return "Concierto{" + "identificador=" + identificador + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
   
    public String data() {
        
        return "el identificador es " +this.getIdentificador()+" | " + "la fecha es " +this.getFecha()+" | "+"la actuacion será a las "+this.getHora();
    }
}


