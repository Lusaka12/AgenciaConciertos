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
    private Date hora;
    private String descripcion;
    private Reportero reportero;
    
    public Momento(Date hora, String descripcion, Reportero reportero) {
        this.hora = hora;
        this.descripcion = descripcion;
        this.reportero= reportero;
    }
    public Momento(Momento m) {
        this.hora = m.getHora();
        this.descripcion = m.getDescripcion();
        this.reportero= m.getReportero();
    } 
    public Momento(){
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Reportero getReportero() {
        return reportero;
    }

    public void setReportero(Reportero reportero) {
        this.reportero = reportero;
    }
    
    /*public Momento getMomentobyid (long id) {
        for (int i=0;i<listaobjetos;i++){
            Momento aux=listaobjetos.get(i);
            if (aux.getID()==id){
                return aux;
    */
    
    /*public ArrayList<Momento> getAllMomento(){
        ArrayList<Momento> LMM = new ArrayList<Momento>();
        for (int i=0;i<listaobjetos.size();i++){
            Momento aux=listaobjetos.get(i);
            LMM.add(aux);
        }
        return LMM;
    }*/
}
