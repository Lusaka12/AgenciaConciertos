/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;

/**
 *
 * @author DAW102
 * @version 1.01
 */
public class Compra {
    private int numEntradas;//numero de entradas de la compra | valores validos hasta el maximo numero de entradas del concierto.
    private long id;//atributo que sirve para identificar a la compra |  valores validos numero entero mayor que 0
    private double precioTotal;//precio que se pagara , se calculara a partir del precio de la entrada y numEntradas de la compra
    //valores validos de precio un numero entero o real mayor que 0
    private String metodoPago;//atributo que guarda el metodo de pago | valores validos podran ser en efectivo y con tarjeta
    private String codigoDescuento;//contiene un codigo de descuento que puede ser valido| valores validos "" si no se ha aportado ningun codigo y un codigo si se ha aportado

    public String getCodigoDescuento() {
        return codigoDescuento;
    }
    public int getNumEntradas() {
        return numEntradas;
    }

    public long getId() {
        return id;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setCodigoDescuento(String codigoDescuento) {
        this.codigoDescuento = codigoDescuento;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setNumEntradas(int numEntradas) {
        this.numEntradas = numEntradas;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Compra(int numEntradas, long identificador, double precioTotal, String metodoPago,String codigoDescuento) {
        this.numEntradas = numEntradas;
        this.id = identificador;
        this.precioTotal = precioTotal;
        this.metodoPago = metodoPago;
        this.codigoDescuento=codigoDescuento;
    }
    public Compra(Compra c) {
        this.numEntradas = c.getNumEntradas();
        this.id = c.getId();
        this.precioTotal = c.getPrecioTotal();
        this.metodoPago = c.getMetodoPago();
        this.codigoDescuento=c.getCodigoDescuento();
    }
    public Compra() {
    }

    @Override
    public String toString() {
        return "Compra{" + "numEntradas=" + numEntradas + ", identificador=" + id + ", precioTotal=" + precioTotal + ", metodoPago=" + metodoPago + ", codigoDescuento=" + codigoDescuento + '}';
    }

   
    
    public String data() {
      
        return this.getId()+"|"+this.getNumEntradas()+"|"+
                this.getPrecioTotal() +"|"+this.getMetodoPago()+"|"+this.getCodigoDescuento();
    }
    
    
}
