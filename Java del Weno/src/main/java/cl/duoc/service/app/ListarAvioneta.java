
package cl.duoc.service.app;

import cl.duoc.models.Avioneta;
import cl.duoc.service.IListAvioneta;
import java.util.ArrayList;

public class ListarAvioneta implements IListAvioneta{
    private ArrayList<Avioneta> lista;

    public ListarAvioneta() {
        this.lista = new ArrayList();
    }      
    
    @Override
    public ArrayList<Avioneta> Listar() {
        return lista;
    }

    @Override
    public String Buscar(int id) {
        return lista.get(id).toString();
    }

    @Override
    public void Guardar(Avioneta avnt) {
        lista.add(avnt);
    }

    @Override
    public void Eliminar(int ID) {
        lista.remove(ID);
    }

    @Override
    public void Eliminar(Avioneta avnt) {
        lista.remove(avnt);
    }

    @Override
    public void Reemplazar(int i, Avioneta avnt) {
        lista.set(i, avnt);
    }
    
}
