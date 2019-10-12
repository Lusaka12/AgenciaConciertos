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
public class Usuario {
    private String nombre, // nombre del usuario | valores validos cadena de caracteres de 20 caracteres no pudiendo tener simbolos y numeros
            apellidos, // apellidos del usuario | valores validos cadena de caracteres de 40 caracteres pudiendo tener simbolos y numeros
            email, // correo electronico del usuario | valores validos cadena de caracters de 40 caracteres pudiendo tener simbolos y numeros
            NIF; // el NIF del usuario | valores validos cadena de caracters de 8 caracteres siendo los 7 de primeros  ellos numeros 
                 // y el ultimo una letra no pudiendo tener simbolos 
    private boolean verificado;//atributo que indica si el usuario ha sido verificado | valores validos true cuando si esta verificado o false cuando no lo esta

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setVerificado(boolean verificado) {
        this.verificado = verificado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getNIF() {
        return NIF;
    }

    public boolean getVerificado() {
        return verificado;
    }

    public Usuario(String nombre, String apellidos, String email, String NIF, boolean verificado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.NIF = NIF;
        this.verificado = verificado;
    }
    public Usuario(Usuario u) {
        this.nombre = u.getNombre();
        this.apellidos = u.getApellidos();
        this.email = u.getEmail();
        this.NIF = u.getNIF();
        this.verificado = u.getVerificado();
    }
    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", NIF=" + NIF + ", verificado=" + verificado + '}';
    }
    
    public String data() {
        String auxiliar="";
        if(verificado){
            auxiliar="si";
        }else{
            auxiliar="no";
        }
        return "el nombre es "+this.getNombre()+ " | " + "los apellidos son " + this.getApellidos() + " | " + "el email es "+this.getEmail()
             + " | " + "el nif es "+ this.getNIF() +" | "+"¿está el usuario verificado? "+auxiliar;
    }
}
