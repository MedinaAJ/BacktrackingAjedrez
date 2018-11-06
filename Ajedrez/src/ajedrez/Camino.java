
package ajedrez;
import java.util.*;
public class Camino {
    private List<Casilla> lista;
    public Camino(){
        lista=new ArrayList<Casilla>();
    }
    public void insertarCasilla(Casilla aux){
        lista.add(aux);
    }
    public void eliminarCasilla(){
        lista.remove(lista.size()-1);
    }
    public Casilla devolverCasilla(int pos){
        return lista.get(pos);
    }
    public String toString(){
        String texto="";
        for(int i=0;i<lista.size();i++){
            texto+= " " + lista.get(i).toString();
        }
        return texto;
    }
    
}
