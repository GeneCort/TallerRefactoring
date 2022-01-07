/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import java.util.ArrayList;

/**
 *
 * @author eli
 */
public class Puntaje {
    
    private double notaInicial;
    private double notaFinal;
    private double notaTotal;
        
    
    public double CalcularNotaGeneral(ArrayList<Paralelo> paralelos,Paralelo p, Nota notas){
        
        double notaG=0;
                
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(notas.getExamen()+notas.getDeber()+
                        notas.getLeccion())*0.80;
                double notaPractico=(notas.getTaller())*0.20;
                notaG=notaTeorico+notaPractico;
            }
        }
        return notaG;
    }
    
    public double CalcularNotaInicial(ArrayList<Paralelo> paralelos, Paralelo p, Nota nota){
        return this.CalcularNotaGeneral(paralelos,p, nota);
    }
        
    public double CalcularNotaFinal(ArrayList<Paralelo> paralelos, Paralelo p, Nota nota){
       return this.CalcularNotaGeneral(paralelos,p, nota); 
    }
    
    public double CalcularNotaTotal(ArrayList<Paralelo> paralelos,Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(notaInicial+notaFinal)/2;
                
            }
        }
        return notaTotal;
        
    }

}
