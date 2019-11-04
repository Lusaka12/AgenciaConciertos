/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;
import java.sql.Date;
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
    
}
