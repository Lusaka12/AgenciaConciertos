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
public class Cindividual extends Concierto {
    
    public Cindividual() {
    }

    public Cindividual(long identificador, Date fechaHora) {
        super(identificador, fechaHora);
    }

    public Cindividual(Cindividual cindividual) {
        super(cindividual);
    }
    
}
