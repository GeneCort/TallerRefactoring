package modelos;

import java.util.ArrayList;

public class Estudiante extends Persona{
    public String matricula;
    public ArrayList<Paralelo> paralelos;
    

    public Estudiante(String nombre, String apellido, Facultad facultad, 
            int edad, Direccion direccion, Telefono telefono) {
        super(nombre, apellido, facultad, edad, direccion, telefono);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    } 

}
        
    
    
    
            
        
        
