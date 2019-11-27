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
 * @author Usuario
 */
public class CColaboracion extends Concierto {
    
    public CColaboracion() {
    }
    
    public CColaboracion (Date fechaHora,ArrayList<Actuacion> listaActuaciones) {
        super(fechaHora,listaActuaciones);   
    }
    
    public CColaboracion (CColaboracion ccolaboracion) {
        super (ccolaboracion);
    }

    @Override
    public String data() {
        return super.data(); //To change body of generated methods, choose Tools | Templates.
    }
    public static CColaboracion nuevoCIndividual() {
        char confirmacion='n'; 
        Scanner in=new Scanner(System.in);
        CColaboracion cColaboracion;
        do{
        cColaboracion= (CColaboracion) Concierto.nuevoConcierto();
        if (cColaboracion.getListaActuaciones().size()!=2) {
            System.out.println("el numero de artistas es distinto"
                    + " de 2 por favor vuelva a meter los datos del concierto");     
        }else{
        System.out.println("Pulse s para confirmar:");
        confirmacion=in.nextLine().charAt(0);}
        }while(confirmacion!='s'||confirmacion!='S'); 

        return cColaboracion;         
    }
}
