/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;   
/**
 *
 * @author DAW102
 * @version 1.01
 */
public class Artista {
    protected long id;//atributo que sirve para identificar al artista |  valores validos numero entero mayor que 0
    private String  nombreArtistico; //nombre artistico del artista | valores validos cadena de caracteres de 20 caracteres pudiendo tener simbolos y numeros
    private char generoMusica; //genero de musica del artista | valores validos cadena de caracteres de 20 caracteres pudiendo tener simbolos y numeros

    public long getId() {
        return id;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public char getGeneroMusica() {
        return generoMusica;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public void setGeneroMusica(char generoMusica) {
        this.generoMusica = generoMusica;
    }

    public Artista(String nombreArtistico, char generoMusica) {
        this.nombreArtistico = nombreArtistico;
        this.generoMusica = generoMusica;
    }
     public Artista(Artista a) {
        this.nombreArtistico = a.getNombreArtistico();
        this.generoMusica = a.getGeneroMusica();
    }
    public Artista(){
    }

    @Override
    public String toString() {
        return "Artista{" + "identificador=" + id + ", nombreArtistico=" + nombreArtistico + ", generoMusica=" + generoMusica + '}';
    }
    
    public String data() { 
        return this.getId()+"|"+this.getNombreArtistico()+"|"+this.getGeneroMusica();
    }
}
