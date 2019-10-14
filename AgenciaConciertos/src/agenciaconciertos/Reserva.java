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
public class Reserva {
    private int numEntradas; //numero de entradas de la compra | valores validos hasta el maximo numero de entradas del concierto.
    private String identificador; //atributo que sirve para identificar a la compra | valores validos cadena de caracteres de 20 caracteres 
    private String fechaMaxima; // Limite para reservar la entrada // valores validos cadena de caracteres de 20 caracteres no pudiendo tener simbolos y numeros
    private String codigoDescuento; //contiene un codigo de descuento que puede ser valido| valores validos "" si no se ha aportado ningun codigo y un codigo si se ha aportado
            
    public int getNumEntradas(){
        return numEntradas;
    }
    
    public String getIdentificador(){
        return identificador;
    }
    
    public String getFechaMaxima(){
        return fechaMaxima;
    }
    
    public String getCodigoDescuento(){
        return codigoDescuento;
    }

    public void setNumEntradas(int numEntradas) {
        this.numEntradas = numEntradas;
    }
    
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    public void setFechaMaxima(String fechaMaxima) {
        this.fechaMaxima = fechaMaxima;
    }
    
    public void setCodigoDescuento(String codigoDescuento) {
        this.codigoDescuento = codigoDescuento;
    }
    
    public Reserva(int numEntradas, String identificador, String fechaMaxima, String codigoDescuento) {
        this.numEntradas = numEntradas;
        this.identificador = identificador;
        this.fechaMaxima = fechaMaxima;
        this.codigoDescuento = codigoDescuento;
    }
    public Reserva(Reserva r) {
        this.numEntradas = r.getNumEntradas();
        this.identificador = r.getIdentificador();
        this.fechaMaxima = r.getFechaMaxima();
        this.codigoDescuento = r.getCodigoDescuento();
    }
    public Reserva() {
    }
    
    @Override
    public String toString() {
        return "Reserva{" + "numEntradas=" + numEntradas + ", identificador=" + identificador + ", fechaMaxima=" + fechaMaxima + ", codigoDescuento=" + codigoDescuento + '}';
    }
    
    public String data() {
        String aux="";
        if(codigoDescuento==""){
               aux="no se ha usado un codigo descuento";
        }else{
               aux="se ha aportado un codigo que es "+codigoDescuento;
        }
        return "el numero de entradas es "+this.getNumEntradas()+" | "+"el identificador es "+this.getIdentificador()+" | "+"la fecha maxima es hasta el "+
            this.getFechaMaxima() +" | "+" el codigo descuento es "+this.getCodigoDescuento()+" | +"+aux;
    }
 
}



          
