/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;
import java.util.*;
/**
 *
 * @author 9alej
 */
public class Ajedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int xo, yo, xd, yd;
        Scanner teclado= new Scanner (System.in);
        System.out.println("Introduce la coordenada X e Y de origen");
        xo=teclado.nextInt();
        yo=teclado.nextInt();
        System.out.println("Introduce la coordenada X e Y de destino");
        xd=teclado.nextInt();
        yd=teclado.nextInt();
        Casilla origen=new Casilla(xo,yo);
        Casilla destino=new Casilla(xd,yd);
        if(origen.existeCamino(destino)){
            Tablero t= new Tablero();
            Camino c= new Camino();
            origen.setVisitado(true);
            c.insertarCasilla(origen);
            Alfil(origen,destino,t,c);
        }else{
            System.out.println("No existe camino entre las dos casillas bro");
        }
    }
    public static void Alfil(Casilla origen, Casilla destino, Tablero t, Camino c){
        int i,j;
        Casilla aux;
        if(origen.equals(destino))
            System.out.println(c);
        else{
            for(i=-1;i<=1;i++){
                for(j=-1;j<=1;j++){
                    aux=new Casilla(i+origen.getX(),j+origen.getY());
                    if(t.EstaDentro(aux)){
                        if(!aux.isVisitado()){
                            if(Math.abs(i)+Math.abs(j)==2){
                                if(t.distanciaM(aux, destino)<t.distanciaM(origen,destino)){
                                    c.insertarCasilla(aux);
                                    aux.setVisitado(true);
                                    Alfil(aux, destino, t, c);
                                    c.eliminarCasilla();
                                    aux.setVisitado(false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
