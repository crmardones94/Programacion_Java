
package cl.duoc.service.app;

import cl.duoc.models.Carguero;
import cl.duoc.service.IListCarguero;
import java.util.ArrayList;

public class ListarCarguero implements IListCarguero{
    private ArrayList<Carguero> lista;
    
    public ListarCarguero() {
        this.lista = new ArrayList();
    }   
    
    @Override
    public ArrayList<Carguero> Listar() {
        return lista;
    }

    @Override
    public String Buscar(int id) {
        return lista.get(id).toString();
    }

    @Override
    public void Guardar(Carguero carguero) {
        lista.add(carguero);
    }

    @Override
    public void Eliminar(int ID) {
        lista.remove(ID);
    }

    @Override
    public void Eliminar(Carguero carguero) {
        lista.remove(carguero);
    }

    @Override
    public void Reemplazar(int ID, Carguero carguero) {
        lista.set(ID, carguero);
    }
    
}
