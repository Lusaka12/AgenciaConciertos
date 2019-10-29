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
public class Entrada {
    protected long id;//atributo que sirve para identificar a la entrada |  valores validos numero entero mayor que 0
    private double precio; // precio de la entrada | valores validos un numero real o entero mayor que 0
    private boolean esVIP;//atributo que indica si el usuario es vip o no | valores validos true cuando si es vip o false cuando no lo es

    public long getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean getEsVIP() {
        return esVIP;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEsVIP(boolean esVIP) {
        this.esVIP = esVIP;
    }

    public Entrada(double precio, boolean esVIP) {
        this.precio = precio;
        this.esVIP = esVIP;
    }
     public Entrada(Entrada e) {
        this.precio = e.getPrecio();
        this.esVIP = e.getEsVIP();
    }

    @Override
    public String toString() {
        return "Entrada{" + "identificador=" + id + ", precio=" + precio + ", esVIP=" + esVIP + '}';
    }
    public String data() {
       
        return this.getId()+"|"+this.getPrecio()+"|"+this.getEsVIP();
    }
}
