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
 * @author DAW102
 */
public class Reportero {
    protected long id;
    private String nombre;
    private String apellidos; 
    private String nif;
    private String numero;
    private Concierto concierto;
    
    

    public Reportero() {
    }
    
    /*public Reportero getReporterobyid (long id) {
        for (int i=0;i<listaobjetos;i++){
            Reportero aux=listaobjetos.get(i);
            if (aux.getID()==id){
                return aux;
         }
    }
 */
    
    /*public ArrayList<Reportero> getAllReportero(){
        ArrayList<Reportero> LRP = new ArrayList<Reportero>();
        for (int i=0;i<listaobjetos.size();i++){
            Reportero aux=listaobjetos.get(i);
            LRP.add(aux);
        }
        return LRP;
    }*/
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNIF(String nif) {
        this.nif = nif;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Concierto getConcierto() {
        return concierto;
    }

    public void setConcierto(Concierto concierto) {
        this.concierto = concierto;
    }

    public Reportero(String nombre, String apellidos, String nif, String numero, Concierto concierto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.numero = numero;
        this.concierto = concierto;
    }

    
    
    public String data(){
        
        return this.getId()+"|" +this.getNombre()+ "|"+this.getApellidos()+"|"+this.getNif()+"|"+this.getNumero();
    }
     
     @Override
    public String toString() {
        return "Reportero" + "identificador=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", NIF="+nif+ ", Numero=" + numero + '}';
    }
    
    public Reportero getReporteroById (long id){
        /*for (Reportero reportero : listaReporteros) {
            if (reportero.getId() == id) {
                return reportero;
            }
        }*/
        return null;
    }
    
    public ArrayList<Reportero> getAllReportero (){
        ArrayList<Reportero> nuevaListaReportero=new ArrayList<Reportero>();
            /*for(Reportero reportero:listaReportero) {
            nuevaListaReportero.add(reportero);
        } 
        */  
        return nuevaListaReportero;
    }
    
    public Reportero nuevoReportero(){
        Reportero reportero=new Reportero();
        Scanner in=new Scanner(System.in);
        boolean confirmacion; 
        do{    
        System.out.println("¿Cual es el nombre del reportero?"); 
        reportero.setNombre(in.next());
        System.out.println("¿Cuales son los apellidos del reportero?");
        reportero.setApellidos(in.next());
        System.out.println("¿Que NIF tiene el reportero?");
        reportero.setNIF(in.next());
        System.out.println("¿Cual es el numero de telefono del reportero?");
        reportero.setNumero(in.next());
        //Artista a=Artista.buscaPorNombreArtistico;
        //actuacion.setListaArtistas(a);
        confirmacion=ToolBox.readBoolean();
        }while (confirmacion!=true);
        in.close();
        return reportero;
    }
}
