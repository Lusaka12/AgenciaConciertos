/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 * @version 1.01
 */
public class Concierto {
    protected long id; //atributo que sirve para identificar al concierto //  valores validos numero entero mayor que 0
    private Date fechaHora; //atributo que sirve para idenfiticar la fechaHora y la hora del concierto// valores validos cadena de caracteres de 20 caracteres
    private ArrayList<Actuacion> listaActuaciones;//lista que contiene las actuaciones de un concierto //minimo 5 y maximo 10.                          
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public ArrayList<Actuacion> getListaActuaciones() {
        return listaActuaciones;
    }

    public void setListaArtistas(ArrayList<Actuacion> listaActuaciones) {
        this.listaActuaciones = listaActuaciones;
    }
    
    public Concierto(Date fechaHora,ArrayList<Actuacion> listaActuaciones) {
        this.fechaHora = fechaHora;
        this.listaActuaciones=listaActuaciones;
        }
    
    public Concierto(Concierto c) {
        this.fechaHora = c.getFechaHora();
        listaActuaciones=c.getListaActuaciones();
    }
    
    public Concierto() {
        listaActuaciones=new ArrayList<Actuacion>();
    }
    @Override
    public String toString() {
        return "Concierto{" + "identificador=" + id + ", fecha=" + fechaHora +'}';
    }
   
    public String data() {
        
        return this.getId()+"|"+this.getFechaHora();
    }
    public static Concierto nuevoConcierto() {
        Concierto concierto=new Concierto();
        Scanner in=new Scanner(System.in);
        boolean confirmacion; 
        int numArtistas;
        
        do{            
        System.out.println(" ¿Qué día tienes el concierto?");
        //Date fecha= ToolBox.readDate(in);
            //System.out.println(fecha);
        //boolean aux=in.nextBoolean();
           // System.out.println(aux);
        //concierto.setFechaHora(fecha);
        System.out.println("¿cuantos artistas participan en el concierto?");
        numArtistas=in.nextInt();
        switch(numArtistas){
            case 2:
               // concierto.listaActuaciones.add(Actuaciones.nuevaActuacion());
            case 1:
               // concierto.listaActuaciones.add(Actuaciones.nuevaActuacion());
                break;           
            default:
                System.out.println("El numero de artistas no es 1 o 2");   
        }
        confirmacion=ToolBox.readBoolean();
        } while (confirmacion!=true);
        in.close();
        return concierto;         
       
    }
}


