/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte.unittest;


import co.edu.uelbosque.sistemas.swii.c1.marte.*;
import org.testng.annotations.Test;

/**
 *
 * @author Scabrera
 */ 
public class ProbarCrearTablero {
    @Test
    
    public void probarIniciarTablero(){
    
    Tablero a = new Tablero(7, 6);
    Iniciar iniciar = new Iniciar();
    iniciar.creartablero(a);
    
    }
    
    @Test
    public void probarDibujarPlano(){
    
        PanelMarte pm = new PanelMarte(new Tablero(7,6));
    
    }
    
}
