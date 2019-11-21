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

    public CIndividual( Date fechaHora) {
        super(fechaHora);
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
    public CIndividual nuevoCIndividual() {
            CIndividual cIndividual=new CIndividual();
            Scanner in=new Scanner(System.in);
            char confirmacion; 
            do{            
            System.out.println(" ¿Qué día tenés el concierto?");
            Date fecha= ToolBox.readDate(in, "DD-MM-YYYY-HH:MM:SS");
            cIndividual.setFechaHora(fecha);
            System.out.println("Pulse s para confirmar:");
            confirmacion=in.nextLine().charAt(0);
            } while (confirmacion!='s'||confirmacion!='S');
            in.close();
            return cIndividual;         
        }
    }
    


