/*
 *
 */
package agenciaconciertos;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;


/**
 * clase que contiene  metodos utiles para otras clases
 * @author DAW102
 */
public class ToolBox {
    
    public static Date readDate(Scanner sc, String format){
        try {
            return (Date) new SimpleDateFormat(format).parse(sc.nextLine());
        } catch (Exception e) {
            return null;
        }
    }
}
