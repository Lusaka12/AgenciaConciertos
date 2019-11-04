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
public class CColaboracion extends Concierto {
    
    public CColaboracion() {
    }
    
    public CColaboracion (Date fechaHora) {
        super(fechaHora);   
    }
    
    public CColaboracion (CColaboracion ccolaboracion) {
        super (ccolaboracion);
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
