package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante {
    public ArrayList<Paralelo> paralelos;

    public Ayudante(String nombre, String apellido, Facultad facultad, 
            int edad, Direccion direccion, Telefono telefono){
        super(nombre, apellido, facultad, edad, direccion, telefono);
        paralelos = new ArrayList<>();
    }

    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelos


    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}


