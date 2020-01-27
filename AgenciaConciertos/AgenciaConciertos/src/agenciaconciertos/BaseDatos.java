/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *  Clase que "almacena" la base de datos
 * @author Luis-clase
 */
public class BaseDatos {
    // como previsiblemente se puedan añadir nuevos reporteros usamos un ArrayList
    public static ArrayList<Reportero> baseReporteros=new ArrayList<Reportero>(
            Arrays.asList(
                    new Reportero("reportero1","apellido1","1234a","123456789"),
                    new Reportero("reportero2","apellido2","1234b","123456799"),
                    new Reportero("reportero3","apellido3","1234c","123456899")
            ));
    public static ArrayList<Actuacion> baseActuaciones=new ArrayList<Actuacion>(
            Arrays.asList(
                    new Actuacion(0,1,20,new ArrayList<Artista>(Arrays.asList(new Artista("Artista1","rock"),new Artista("Artista2","electronica"))),0),
                    new Actuacion(1,1,20,new ArrayList<Artista>(Arrays.asList(new Artista("Artista1","rock"))),0),
                    new Actuacion(2,1,20,new ArrayList<Artista>(Arrays.asList(new Artista("Artista1","rock"))),0),
                    new Actuacion(3,1,20,new ArrayList<Artista>(Arrays.asList(new Artista("Artista1","rock"))),0),
                    new Actuacion(4,1,20,new ArrayList<Artista>(Arrays.asList(new Artista("Artista1","rock"))),0),
                    new Actuacion(6,1,20,new ArrayList<Artista>(Arrays.asList(new Artista("Artista1","rock"))),1),
                    new Actuacion(7,1,20,new ArrayList<Artista>(Arrays.asList(new Artista("Artista1","rock"))),1),
                    new Actuacion(8,1,20,new ArrayList<Artista>(Arrays.asList(new Artista("Artista1","rock"))),1),
                    new Actuacion(9,1,20,new ArrayList<Artista>(Arrays.asList(new Artista("Artista1","rock"))),1),
                    new Actuacion(10,1,20,new ArrayList<Artista>(Arrays.asList(new Artista("Artista1","rock"))),1)
            )
    );
    // el constructor de tipo date esta marcada como @Deprecated es decir en desuso
    Gira g=new Gira(0,new Date(2020,10,1),new Date(2020,10,7),"giraNorte",new ArrayList<Concierto>());
    public static SimpleDateFormat  df = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    public static ArrayList<Gira> baseGiras=new ArrayList<Gira>(
            Arrays.asList(
                    new Gira(0,new Date(2020,10,1),new Date(2020,10,7),"giraNorte",new ArrayList<Concierto>(Arrays.asList(
                            new Concierto(new Date(2020,10,7),new ArrayList<Actuacion>(Arrays.asList(
                                                                            baseActuaciones.get(1),
                                                                            baseActuaciones.get(2),
                                                                            baseActuaciones.get(3),
                                                                            baseActuaciones.get(4),
                                                                            baseActuaciones.get(5)     )))))),
                    new Gira(1,new Date(2020,10,1),new Date(2020,10,7),"giraSur",new ArrayList<Concierto>()),
                    new Gira(2,new Date(2020,10,1),new Date(2020,10,7),"giraEste",new ArrayList<Concierto>()))
    );
    public static Reportero buscaReporteroByNIF(String NIF){
        for(int i=0;i<baseReporteros.size();i++){
            Reportero rep=baseReporteros.get(i);
            if(rep.getNif().equals(NIF)){
                return rep;
            }
        }
        return null;
    }
    public static Gira buscaGiraByNombre(String nombre){
        for(int i=0;i<baseGiras.size();i++){
            Gira gira=baseGiras.get(i);
            if(gira.getNombre().equals(nombre)){
                return gira;
            }
        }
        return null;
    }
    
}
