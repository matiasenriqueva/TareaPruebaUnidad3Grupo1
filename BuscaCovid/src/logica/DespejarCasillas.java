package logica;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernando
 */
public class DespejarCasillas {
    int estadoCasilla;
    DespejarCasillas(int estadoCasilla){
        this.estadoCasilla=estadoCasilla; 
    }
    public boolean comprobarEstado(){
        boolean estaVacio=false;
        if(estadoCasilla==0){
            estaVacio=true;
        }
        return estaVacio;
    }
    
}