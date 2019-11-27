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
 */
public class CIndividual extends Concierto {
    
    public CIndividual() {
    }

    public CIndividual( Date fechaHora,ArrayList<Actuacion> listaActuaciones) {
        super(fechaHora,listaActuaciones);
    }

    public CIndividual(CIndividual cindividual) {
        super(cindividual);
    }

    @Override
    public String data() {
        return super.data(); //To change body of generated methods, choose Tools | Templates.
    }
    /*public CIndividual getCIndividualbyid (long id) {
        for (int i=0;i<listaobjetos;i++){
            CIndividual aux=listaobjetos.get(i);
            if (aux.getID()==id){
                return aux;
            } 
        }
        return null;
    }
    /*public ArrayList<CIndividual> getAllCindividual(){
        ArrayList<CIndividual> Lci = new ArrayList<CIndividual>();
        for (int i=0;i<listaobjetos.size();i++){
            CIndividual aux=listaobjetos.get(i);
            Lci.add(aux);
        }
        return Lci;
    }*/
   
    public static CIndividual nuevoCIndividual() {
        char confirmacion='n'; 
        Scanner in=new Scanner(System.in);
        CIndividual cIndividual;
        do{
        cIndividual= (CIndividual) Concierto.nuevoConcierto();
        if (cIndividual.getListaActuaciones().size()!=1) {
            System.out.println("el numero de artistas es distinto"
                    + " de 1 por favor vuelva a meter los datos del concierto");     
        }else{
        System.out.println("Pulse s para confirmar:");
        confirmacion=in.nextLine().charAt(0);}
        }while(confirmacion!='s'||confirmacion!='S'); 

        return cIndividual;         
    }
  
    }
    


