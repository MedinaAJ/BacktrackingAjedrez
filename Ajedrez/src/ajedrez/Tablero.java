/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author 9alej
 */
public class Tablero {
    private Casilla tabla[][];
    public Tablero(){
        tabla=new Casilla[8][8];
    }
    public void actualizar(){
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[i].length;j++){
                tabla[i][j]= new Casilla (i,j);
            }
        }
    }
    public boolean EstaDentro(Casilla aux){
        return (aux.getX()>=0 && aux.getX()<=7 && aux.getY()>=0 && aux.getY()<=7);
    }
    public boolean EstaVisitada(Casilla aux){
        return tabla[aux.getX()][aux.getY()].isVisitado();
    }
    public void ponerVisitado(Casilla aux){
        tabla[aux.getX()][aux.getY()].setVisitado(true);
    }
    public void quitarVisitado(Casilla aux){
        tabla[aux.getX()][aux.getY()].setVisitado(false);
    }
    public int distanciaM (Casilla c1, Casilla c2){
        return Math.max(Math.abs(c1.getX()-c2.getX()), Math.abs(c1.getY()-c2.getY()));
    }
    public Casilla getCasilla(int x, int y){
        return tabla[x][y];
    }
}
