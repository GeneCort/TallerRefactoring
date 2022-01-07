package modelos;

import java.util.ArrayList;

public class Profesor extends Persona{
        private int añosdeTrabajo;
    private double BonoFijo;
    private String codigo;
    private ArrayList<Paralelo> paralelos;
    

    public Profesor(String nombre, String apellido, Facultad facultad, int edad
            ,Direccion direccion, Telefono telefono, String codigo, int años, double bono) {
        super(nombre, apellido, facultad, edad, direccion, telefono);
        this.codigo = codigo;
        this.añosdeTrabajo= años;
        this.BonoFijo= bono;
        paralelos= new ArrayList<>();
    }
    
    public double calcularSueldo(){   
        return this.getAñosdeTrabajo()*600 + this.getBonoFijo();       
    }  
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
    
    //Getters and Setters

    public int getAñosdeTrabajo() {
        return añosdeTrabajo;
    }

    public void setAñosdeTrabajo(int añosdeTrabajo) {
        this.añosdeTrabajo = añosdeTrabajo;
    }

    public double getBonoFijo() {
        return BonoFijo;
    }

    public void setBonoFijo(double BonoFijo) {
        this.BonoFijo = BonoFijo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }

    public void setParalelos(ArrayList<Paralelo> paralelos) {
        this.paralelos = paralelos;
    }

    
}
