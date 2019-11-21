/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;
import java.sql.Date;
import java.util.ArrayList;
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
    public CIndividual getCIndividualbyid (long id) {
        for (int i=0;i<listaobjetos;i++){
            CIndividual aux=listaobjetos.get(i);
            if (aux.getID()==id){
                return aux;
            } 
        }
        return null;
    }
    public ArrayList<CIndividual> getAllCindividual(){
        ArrayList<CIndividual> Lci = new ArrayList<CIndividual>();
        for (int i=0;i<listaobjetos.size();i++){
            CIndividual aux=listaobjetos.get(i);
            Lci.add(aux);
        }
        return Lci;
    }
    public CIndividual nuevoCIndividual() {
            System.out.println("Che wacho, ¿Qué día tenés el consierto?");
            Date fe= Toolbox.realDate(in, "DD-MM-YYYY-HH:MM:SS");
            f.set.Fecha(fe);
            return null;
    }
}
