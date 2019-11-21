/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author DAW102
 */
public class Momento {
    Date hora;
    String descripcion;
    public Momento(Date hora, String descripcion) {
        this.hora = hora;
        this.descripcion = descripcion;
    }
    public Momento(Momento m) {
        this.hora = hora;
        this.descripcion = descripcion;
    } 
    public Momento(){
    }
    
}
