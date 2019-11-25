/*
 *
 */
package agenciaconciertos;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;

/**
 * clase que contiene  metodos utiles para otras clases
 * @author DAW102
 */
public class ToolBox {
    
    public static Date readDate(Scanner sc) throws ParseException{
        try {
            String fechaTexto = sc.nextLine();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = (Date) df.parse(fechaTexto);
            
        return fecha;
           
                   
        } catch (Exception e) {
            return null;
        }
    }
}
