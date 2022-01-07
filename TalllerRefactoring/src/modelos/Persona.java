/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

/**
 *
 * @author eli
 */
public class Persona {

    protected String nombre;
    protected String apellido;
    public int edad;
    protected Facultad facultad;
    public Direccion direccion;
    public Telefono telefono;
    
    public Persona(String nombre, String apellido, Facultad facultad, int edad,
            Direccion direccion, Telefono telefono){
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public int getEdad() {
        return edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Telefono getTelefono() {
        return telefono;
    }
    
    
}
