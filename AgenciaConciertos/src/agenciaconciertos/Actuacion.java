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
    protected long id; //atributo que sirve para identificar a la actuacion // valores validos numero entero mayor que 0
    private int numeroSecuencia; // numero de actuacion que forma parte del concierto // valores validos hasta el numero maximo de actuaciones en el concierto
    private int duracion; //numero de minutos que dura la actuacion // valores validos hasta el numero maximo de minutos que dura la actuacion

    public long getId() {
        return id;
    }
    
    public int getNumeroSecuencia() {
        return numeroSecuencia;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void setNumeroSecuencia(int numeroSecuencia) {
        this.numeroSecuencia = numeroSecuencia;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public Actuacion(long id, int numeroSecuencia, int duracion) {
        this.numeroSecuencia = numeroSecuencia;
        this.duracion = duracion;                  
    }
    public Actuacion(Actuacion a) {
        this.numeroSecuencia = a.getNumeroSecuencia();
        this.duracion = a.getDuracion();        
    }
    public Actuacion() {
    }
    
    @Override
    public String toString() {
        return "Actuacion{" + "identificador=" + id + ", numeroSecuencia=" + numeroSecuencia + ", duracion" + duracion + '}';
    }
    
    public String data() {
        return this.getId()+"|"+this.getNumeroSecuencia()+"|"+this.getDuracion();
    }
}
        
  
            
    

    
    

