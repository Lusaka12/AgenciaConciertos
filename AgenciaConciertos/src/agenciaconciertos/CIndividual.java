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
    
    public Cindividual() {
    }

    public Cindividual(Date fechaHora) {
        super(fechaHora);
    }

    public Cindividual(CIndividual cindividual) {
        super(cindividual);
    }
    @Override
    public String toString() {
    	super.toString();
    }
    @Override
    public String data() {
        return super.data();
    }
    
}
