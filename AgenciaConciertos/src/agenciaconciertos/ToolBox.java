/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;


/**
 *
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
