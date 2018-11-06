/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;


public class Casilla {
    private int x;
    private int y;
    private boolean visitado;
    public Casilla(int x, int y){
        this.x=x;
        this.y=y;
        visitado=false;
    }
    public boolean existeCamino(Casilla c){
        return((this.getX()+this.getY())%2==0 && (c.getX()+c.getY())%2==0) || ((this.getX()+this.getY())%2!=0 && (c.getX()+c.getY())%2!=0);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    public String toString(){
        return "X: "+ x + "Y: "+y;
    }
    
}
