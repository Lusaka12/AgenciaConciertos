    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 * @version 1.01
 */
public class Informe {
    protected long id;//atributo que sirve para identificarel ID //  valores validos numero entero mayor que 0
    private boolean revisado;//Campo para indicar si está revisado o no // valores validos true o false. 
    private String descripcion;//atributo que sirve para guardar la descripcion // valores validos cadena de caracteres de 20 caracteres
    private Gira gira;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isRevisado() {
        return revisado;
    }

    public void setRevisado(boolean revisado) {
        this.revisado = revisado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Gira getGira() {
        return gira;
    }

    public void setGira(Gira gira) {
        this.gira = gira;
    }

    public Informe(long id, String descripcion, Gira gira) {
        this.id = id;
        this.revisado = false;
        this.descripcion = descripcion;
        this.gira = gira;
    }
    

   public Informe (Informe i) {
        this.revisado = i.isRevisado();
        this.descripcion = i.getDescripcion();
        this.gira = i.getGira();
   }    
   public Informe(){
       
   }

    @Override
    public String toString() {
        return "Informe{" + "identificador=" + id + ", revisado=" + revisado + ", descripcion=" + descripcion + ",gira=" + gira + '}';
    }
   public String data() {
       
       return this.getId()+"|"+this.isRevisado()+"|"+this.getDescripcion();
             
   }
   
   public Informe getInformeById(long id) {
        /*for (Informe informe : listaInformes) {
            if (informe.getId() == id) {
                return informe;
            }
        }*/
       return null;
   }
   
   public ArrayList<Informe> getAllInforme () {
      ArrayList<Informe> nuevaListaInforme = new ArrayList<Informe>();
        /*
        for (Informe informe:listaInformes) {
              nuevaListaInformes.add(informe);
          } 
        */
        /*Este método recorrerá un ArrayList con todos los informes, comparando 
        con el id que le introduzcamos, y devolverá el informe si es que existe o 
        nulo si es que no existe*/
        return nuevaListaInforme;
   }   
    public Informe nuevoInforme(){
        Informe informe = new Informe();
        Scanner in=new Scanner (System.in);
        boolean confirmacion;
        do{
        System.out.println("¿Se ha revisado el informe?");
        informe.setRevisado(in.nextBoolean());
        System.out.println("Añade descripción");
        informe.setDescripcion(in.next());
        //informe.setGira(Gira.buscaGiraPorNombre(in.next()));
        confirmacion=ToolBox.readBoolean();
        }while (confirmacion!=true);
        in.close();
        return informe;
        }
    
       
       
   }
   

