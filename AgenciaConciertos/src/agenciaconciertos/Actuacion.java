/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;

/**
 *
 * @author DAW113
 * @version 1.01
 */
public class Actuacion {
    private String identificador; //atributo que sirve para identificar a la actuacion // valores validos cadena de caracteres de 20 caracteres 
    private int numeroSecuencia; // numero de actuacion que forma parte del concierto // valores validos hasta el numero maximo de actuaciones en el concierto
    private int duracion; //numero de minutos que dura la acutacion // valores validos hasta el numero maximo de minutos que dura la actuacion

    public String getIdentificador() {
        return identificador;
    }
    
    public int getNumeroSecuencia() {
        return numeroSecuencia;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    public void setNumeroSecuencia(int numeroSecuencia) {
        this.numeroSecuencia = numeroSecuencia;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public Actuacion(String identificador, int numeroSecuencia, int duracion) {
        this.identificador = identificador;
        this.numeroSecuencia = numeroSecuencia;
        this.duracion = duracion;                  
    }
    public Actuacion(Actuacion a) {
        this.identificador = a.getIdentificador();
        this.numeroSecuencia = a.getNumeroSecuencia();
        this.duracion = a.getDuracion();        
    }
    public Actuacion() {
    }
    
    @Override
    public String toString() {
        return "Actuacion{" + "identificador=" + identificador + ", numeroSecuencia=" + numeroSecuencia + ", duracion" + duracion + '}';
    }
    
    public String data() {
        return "el identificador es "+this.getIdentificador()+" | "+"el numero de secuencia es "+this.getNumeroSecuencia()+" | "+"la acutuacion va a durar "+this.getDuracion();
    }
}
        
  
            
    

    
    

