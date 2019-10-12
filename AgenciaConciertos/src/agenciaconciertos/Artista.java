/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaconciertos;   
/**
 *
 * @author DAW102
 * @version 1.0
 */
public class Artista {
    private String identificador ,//atributo que sirve para identificar al artista | valores validos cadena de caracteres de 20 caracteres
            nombreArtistico //nombre artistico del artista | valores validos cadena de caracteres de 20 caracteres pudiendo tener simbolos y numeros
            ,generoMusica; //genero de musica del artista | valores validos cadena de caracteres de 20 caracteres pudiendo tener simbolos y numeros

    public String getIdentificador() {
        return identificador;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public String getGeneroMusica() {
        return generoMusica;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public void setGeneroMusica(String generoMusica) {
        this.generoMusica = generoMusica;
    }

    public Artista(String identificador, String nombreArtistico, String generoMusica) {
        this.identificador = identificador;
        this.nombreArtistico = nombreArtistico;
        this.generoMusica = generoMusica;
    }
     public Artista(Artista a) {
        this.identificador = a.getIdentificador();
        this.nombreArtistico = a.getNombreArtistico();
        this.generoMusica = a.getGeneroMusica();
    }
    public Artista(){
    }

    @Override
    public String toString() {
        return "Artista{" + "identificador=" + identificador + ", nombreArtistico=" + nombreArtistico + ", generoMusica=" + generoMusica + '}';
    }
    
    public String data() {
        return"el identificador es "+this.getIdentificador()+" | "+"el nombre artistico es "+this.getNombreArtistico()+" | "+"el genero musical es"+this.getGeneroMusica();
    }
}
