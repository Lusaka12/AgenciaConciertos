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
    private ArrayList<Artista> listaArtistas;                          
    
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

    public ArrayList<Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(ArrayList<Artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }
    
    public Concierto(Date fechaHora,ArrayList<Artista> listArtistas) {
        this.fechaHora = fechaHora;
        listaArtistas=listArtistas;
        }
    
    public Concierto(Concierto c) {
        this.fechaHora = c.getFechaHora();
        listaArtistas=c.getListaArtistas();
    }
    
    public Concierto() {
        listaArtistas=new ArrayList<Artista>();
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
        char confirmacion; 
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
                concierto.listaArtistas.add(Artista.nuevoArtista());
            case 1:
                concierto.listaArtistas.add(Artista.nuevoArtista());
                break;           
            default:
                System.out.println("El numero de artistas no es 1 o 2");   
        }
        System.out.println("Pulse s para confirmar:");
        confirmacion=in.nextLine().charAt(0);
        } while (confirmacion!='s'||confirmacion!='S');
        in.close();
        return concierto;         
       
    }
}


