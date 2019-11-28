/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAW113
 * @version 1.01
 */
public class Actuacion {
    protected long id; //atributo que sirve para identificar a la actuacion // valores validos numero entero mayor que 0
    private int numeroSecuencia; // numero de actuacion que forma parte del concierto // valores validos hasta el numero maximo de actuaciones en el concierto
    private int duracion; //numero de minutos que dura la actuacion // valores validos hasta el numero maximo de minutos que dura la actuacion
    private ArrayList<Artista> listaArtistas;//lista de artistas que actuan en la actuacion// valores permitidos minimo 1 y maximo 2
    private long idConcierto;// guarda el concierto de la actuacion
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

    public long getIdconcierto() {
        return idConcierto;
    }

    public void setIdconcierto(long idConcierto) {
        this.idConcierto = idConcierto;
    }
    

    public ArrayList<Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(ArrayList<Artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }
    
    public void setNumeroSecuencia(int numeroSecuencia) {
        this.numeroSecuencia = numeroSecuencia;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public Actuacion(long id, int numeroSecuencia, int duracion,ArrayList<Artista> ListaArtistas,long idConcierto) {
        this.numeroSecuencia = numeroSecuencia;
        this.duracion = duracion;   
        this.listaArtistas=listaArtistas;
        this.idConcierto=idConcierto;
    }
    public Actuacion(Actuacion a) {
        this.numeroSecuencia = a.getNumeroSecuencia();
        this.duracion = a.getDuracion();
        this.listaArtistas=a.getListaArtistas();
        this.idConcierto=a.getIdconcierto();
    }
    public Actuacion() {
        listaArtistas=new ArrayList<Artista>();
    }
    
    @Override
    public String toString() {
        return "Actuacion{" + "identificador=" + id + ", numeroSecuencia=" + numeroSecuencia + ", duracion=" + duracion + '}';
    }
    
    public String data() {
        return this.getId()+"|"+this.getNumeroSecuencia()+"|"+this.getDuracion();
    }
    public Actuacion getActuacionById (long id){
        /*for (Actuacion actuacion : listaActuaciones) {
            if (actuacion.getId() == id) {
                return actuacion;
            }
        }*/
        return null;
    }
    public ArrayList<Actuacion> getAllDescuento (){
        ArrayList<Actuacion> nuevaListaActuacion=new ArrayList<Actuacion>();
        /*for(Actuacion actuacion:listaActuaciones) {
            nuevaListaDescuentos.add(descuento);
        } 
        */  
        return nuevaListaActuacion;
    }
    public Actuacion nuevaActuacion(){
        Actuacion actuacion=new Actuacion();
        Scanner in=new Scanner(System.in);
        boolean confirmacion; 
        do{    
        System.out.println("¿En qué posicion es la actuacion?"); 
        actuacion.setNumeroSecuencia(in.nextInt());
        System.out.println("¿Cuánto dura la actuacion?");
        actuacion.setDuracion(in.nextInt());
        System.out.println("Dame nombre Artístico");
        //Artista a=Artista.buscaPorNombreArtistico;
        //actuacion.setListaArtistas(a);
        confirmacion=ToolBox.readBoolean();
        }while (confirmacion!=true);
        in.close();
        return actuacion;
    }
}
    

    
    

