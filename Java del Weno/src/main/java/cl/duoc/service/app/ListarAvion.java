
package cl.duoc.service.app;

import cl.duoc.models.Avion;
import cl.duoc.service.IListAvion;
import java.util.ArrayList;

public class ListarAvion implements IListAvion{
    
    private ArrayList<Avion> lista;

    public ListarAvion() {
        this.lista = new ArrayList();
    } 
    @Override
    public ArrayList<Avion> Listar() {
        return lista;
    }

    @Override
    public String Buscar(int id) {
        return lista.get(id).toString();
    }

    @Override
    public void Guardar(Avion avion) {
        lista.add(avion);
    }

    @Override
    public void Eliminar(int ID) {
        lista.remove(ID);
    }

    @Override
    public void Eliminar(Avion avion) {
        lista.remove(avion);
    }

    @Override
    public void Reemplazar(int i, Avion avion) {
        lista.set(i, avion);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Avion avion : this.lista){
            sb.append(avion);
        }
        return sb.toString();
    }   
    
}
