/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;
import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class Ccolaboracion extends Concierto {
    
    public Ccolaboracion() {
    }
    
    public Ccolaboracion (Date fechaHora) {
        super(fechaHora);   
    }
    
    public Ccolaboracion (Ccolaboracion ccolaboracion) {
        super (ccolaboracion);
    }

    @Override
    public String data() {
        return super.data(); //To change body of generated methods, choose Tools | Templates.
    }
        
}
