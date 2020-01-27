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
 * @author DAW101
 */
public class AgenciaConciertos {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // caso de uso AsignaReporteroAActuacion
        System.out.println("Selecione un opcion");
        System.out.println("1. Asigna reportero a actuacion");
        System.out.println("2. Caso de uso 1");
        System.out.println("3. Caso de uso 2");
        int opcion=in.nextInt();
        switch(opcion){
            case 1:
               System.out.println("Introduzca el nombre de la gira");
               String nombreGira=in.next();
               Gira gira=BaseDatos.buscaGiraByNombre(nombreGira);
               int i=0;
               System.out.println("Selecione uno de los siguientes conciertos de la gira");
               for(Concierto concierto:gira.getListaConciertos()){
                   System.out.println(i+" "+concierto.getFechaHora().toString());
                   i++;
               }
               int numConcierto=in.nextInt();
               Concierto conciertoEscogido=gira.getConciertoByPos(numConcierto);
               ArrayList<Actuacion> actuaciones=conciertoEscogido.getListaActuaciones();
               System.out.println("Selecione la actuacion:");
               for(i=0;i<actuaciones.size();i++){
                   Actuacion actuacion=actuaciones.get(i);
                   if(actuacion.getReportero()==null){
                       System.out.println(i+" "+actuacion.data());
                   }else{
                       System.out.println(i+" Esta actuacion ya tiene un reportero asignado con nif:"+actuacion.getReportero().getNif()+actuacion.data());
                   }
                   
               }
               int numActuacion=in.nextInt();
               conciertoEscogido.getActuacionByPos(numActuacion).asignaReporteroActuacion();
               System.out.println("Se ha asignado correctamente el reportero a la actuacion");
               break;
            case 2:break;
            case 3:break;
            default:       
         } System.out.println("Finaliza ejecucion");
    
    }
    
    
    
    
}
