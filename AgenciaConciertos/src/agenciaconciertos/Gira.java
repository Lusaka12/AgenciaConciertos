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
    private String identificador;//atributo que sirve para identificar a la gira // valores validos cadena de caracteres de 20 caracteres
    private String fechaApertura;//atributo que sirve para identificar la fecha de apertura// valores validos cadena de caracteres de 20 caracteres
    private String fechaCierre;//atributo que sirve para identificar la fecha de cierre // valores validos cadena de caracteres de 20 caracteres

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
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

    public Gira(String identificador, String fechaApertura, String fechaCierre) {
        this.identificador = identificador;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
    }
    
     public Gira(Gira g) {
        this.identificador = g.getIdentificador();
        this.fechaApertura = g.getFechaApertura();
        this.fechaCierre = g.getFechaCierre();
     }
            
    public Gira () {
    }

    @Override
    public String toString() {
        return "Gira" + "identificador=" + identificador + ", fechaApertura=" + fechaApertura + ", fechaCierre=" + fechaCierre + '}';
    }
    
    public String data(){
        
        return "el identificador es " +this.getIdentificador()+" | " + "la fecha de apetura es " +this.getFechaApertura()+ " | " + "la fecha de cierre es " +this.getFechaCierre();
       
    }
}
