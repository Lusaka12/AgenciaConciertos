/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;
import java.sql.Date;
/**
 *
 * @author DAW113
 * @version 1.01
 */
public class Reserva {
    private int numEntradas; //numero de entradas de la compra | valores validos hasta el maximo numero de entradas del concierto.
    private long id; //atributo que sirve para identificar a la compra |  valores validos numero entero mayor que 0
    public Date fechaMaxima; // Limite para reservar la entrada // valores validos cadena de caracteres de 20 caracteres no pudiendo tener simbolos y numeros
    private String codigoDescuento; //contiene un codigo de descuento que puede ser valido| valores validos "" si no se ha aportado ningun codigo y un codigo si se ha aportado
            
    public int getNumEntradas(){
        return numEntradas;
    }
    
    public long getId(){
        return id;
    }
    
    public Date getFechaMaxima(){
        return fechaMaxima;
    }
    
    public String getCodigoDescuento(){
        return codigoDescuento;
    }

    public void setNumEntradas(int numEntradas) {
        this.numEntradas = numEntradas;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void setFechaMaxima(Date fechaMaxima) {
        this.fechaMaxima = fechaMaxima;
    }
    
    public void setCodigoDescuento(String codigoDescuento) {
        this.codigoDescuento = codigoDescuento;
    }
    
    public Reserva(int numEntradas, long id, Date fechaMaxima, String codigoDescuento) {
        this.numEntradas = numEntradas;
        this.id = id;
        this.fechaMaxima = fechaMaxima;
        this.codigoDescuento = codigoDescuento;
    }
    public Reserva(Reserva r) {
        this.numEntradas = r.getNumEntradas();
        this.id = r.getId();
        this.fechaMaxima = r.getFechaMaxima();
        this.codigoDescuento = r.getCodigoDescuento();
    }
    public Reserva() {
    }
    
    @Override
    public String toString() {
        return "Reserva{" + "numEntradas=" + numEntradas + ", identificador=" + id + ", fechaMaxima=" + fechaMaxima + ", codigoDescuento=" + codigoDescuento + '}';
    }
    
    public String data() {
        return this.getNumEntradas()+"|"+this.getId()+"|"+
            this.getFechaMaxima()+"|"+this.getCodigoDescuento()+"|"+this.getCodigoDescuento();
    }
 
}



          
