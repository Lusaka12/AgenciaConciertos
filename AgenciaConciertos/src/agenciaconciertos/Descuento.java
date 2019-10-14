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
public class Descuento {
    private String codigoDescuento; // identificar el código de descuento // valores validos cadena de caracteres de 20 caracteres no pudiendo tener simbolos y numeros
    private String fechaValidez; // Cuando va a caducar el codigo descuento // valores validos cadena de caracteres de 20 caracteres no pudiendo tener simbolos y numeros
    private double cantidadDescontada; // Cantidad que se descontará, se calculará restando el precio total menos el codigo descuento

    public String getCodigoDescuento() {
        return codigoDescuento;
    }
    
    public String getFechaValidez() {
       return fechaValidez;
    }
    
    public double getCantidadDescontada() {
        return cantidadDescontada;
    }

    public void setCodigoDescuento(String codigoDescuento) {
        this.codigoDescuento = codigoDescuento;
    }

    public void setFechaValidez(String fechaValidez) {
        this.fechaValidez = fechaValidez;
    }

    public void setCantidadDescontada(double cantidadDescontada) {
        this.cantidadDescontada = cantidadDescontada;
    }       

    public Descuento(String codigoDescuento, String fechaValidez, double cantidadDescontada) {
        this.codigoDescuento = codigoDescuento;
        this.fechaValidez = fechaValidez;
        this.cantidadDescontada = cantidadDescontada;
    }
    public Descuento(Descuento d) {
        this.codigoDescuento = d.getCodigoDescuento();
        this.fechaValidez = d.getFechaValidez();
        this.cantidadDescontada = d.getCantidadDescontada();
    }
    public Descuento() {
    }
    
    @Override
    public String toString() {
        return "Descuento{" + "codigoDescuento=" + codigoDescuento + ", fechaValidez=" + fechaValidez + ", cantidadDescontada=" + cantidadDescontada + '}';
    }
    
    public String data() {
    
        return this.getFechaValidez()+"|"+this.getCantidadDescontada()+"|"+this.getCodigoDescuento();
    }

}
        
  



