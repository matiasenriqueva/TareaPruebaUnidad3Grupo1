
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
public class Puntaje {
    int tablero[][];
    int tamanoFilas;
    int tamanoColumnas;
    int puntajeTotal;
    Puntaje(int tablero [][],int tamanoFilas, int tamanoColumnas,int puntajeTotal){
        this.tablero=tablero;
        this.tamanoFilas=tamanoFilas;
        this.tamanoColumnas=tamanoColumnas;
        puntajeTotal=0;
        
    }
    public void calcularPuntaje(){
        for(int i=0; i<tamanoFilas; i++){
            for(int j=0; j<tamanoColumnas; j++ ){
                if(tablero[i][j]==0){
                    puntajeTotal++;
                }
            }
        }
    }
    public int getPuntajeTotal(){
        return puntajeTotal;
    }
}
