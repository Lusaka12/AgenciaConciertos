/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DAW102
 * @version 1.01
 */
public class Compra {
    private int numEntradas;//numero de entradas de la compra | valores validos hasta el maximo numero de entradas del concierto.
    protected long id;//atributo que sirve para identificar a la compra |  valores validos numero entero mayor que 0
    private double precioTotal;//precio que se pagara , se calculara a partir del precio de la entrada y numEntradas de la compra
    //valores validos de precio un numero entero o real mayor que 0
    private String metodoPago;//atributo que guarda el metodo de pago | valores validos podran ser en efectivo y con tarjeta
    private  long idDescuento;
    private Date fechaCompra;
    private Usuario usuarioCompra;
    private long idReserva;

    public long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(long idReserva) {
        this.idReserva = idReserva;
    }
    
    public Usuario getUsuarioCompra() {
        return usuarioCompra;
    }

    public void setUsuarioCompra(Usuario usuarioCompra) {
        this.usuarioCompra = usuarioCompra;
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

    public long getIdDescuento() {
        return idDescuento;
    }

    public void setIdDescuento(long idDescuento) {
        this.idDescuento = idDescuento;
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

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    

    public Compra(int numEntradas, double precioTotal, String metodoPago,String codigoDescuento,Usuario usuarioCompra, long idDescuento, Date fechaCompra, long idReserva) {
        this.numEntradas = numEntradas;
        this.precioTotal = precioTotal;
        this.metodoPago = metodoPago;
        this.usuarioCompra=usuarioCompra;
        this.idDescuento=idDescuento;
        this.fechaCompra=fechaCompra;
        this.idReserva=idReserva;
        
       
    }
    public Compra(Compra c) {
        this.numEntradas = c.getNumEntradas();
        this.precioTotal = c.getPrecioTotal();
        this.metodoPago = c.getMetodoPago();
        this.usuarioCompra=c.getUsuarioCompra();
        this.idDescuento=c.getIdDescuento();
        this.fechaCompra=c.getFechaCompra();
        this.idReserva=c.getIdReserva();
    }
    public Compra() {
    }

    @Override
    public String toString() {
        return "Compra{" + "numEntradas=" + numEntradas + ", identificador=" + id + ", precioTotal=" + precioTotal + ", metodoPago=" + metodoPago +'}';
    }
    
    public String data() {
        return this.getId()+"|"+this.getNumEntradas()+"|"+this.getIdReserva() +"|"+
                this.getPrecioTotal() +"|"+this.getMetodoPago()+"|"+this.getFechaCompra() +"|"+ this.getIdDescuento()+"|"+this.getUsuarioCompra();
    }
    
    public Compra getCompraById (long id){
        /*
        for(Compra compra:listacompras) {
            if (compra.getId()==id) {
                return compra;
            }
        }    
        */
        return null;
    }
    public ArrayList<Compra> getAllCompra (){
        
        ArrayList<Compra> nuevaListaCompras=new ArrayList<Compra>();
        /*
        for(Compra compra:listaCompra) {
            nuevaListaCompra.add(compra);
        } 
        for(int i=0;i<listaCompra.size();i++){
            nuevaListaCompra.add(listaCompra.get(i));
        }
        */  
        return nuevaListaCompras;
    }
    public Compra nuevoCompra (){
        Compra compra= new Compra();
        boolean confirmacion;
        Scanner sc= new Scanner(System.in);
        do{            
            System.out.println("¿Cuantas entradas has comprado?");
            compra.setNumEntradas(sc.nextInt());
            System.out.println("¿Hasta cuando es la fecha de validez? formato:dd/MM/yyyy hh:mm");
            compra.setFechaCompra(ToolBox.readDate());
            System.out.println("¿Cuál es el metodo de pago?");
            compra.setMetodoPago(sc.next());
            System.out.println("¿precio total de las entradas?");
            compra.setPrecioTotal(sc.nextDouble());
            System.out.println("Pulse s para confirmar:");
            confirmacion=ToolBox.readBoolean();
        } while (!confirmacion);
        return compra;
    }
    
}
