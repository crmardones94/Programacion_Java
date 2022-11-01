
package cl.duoc.service.app;

import cl.duoc.models.VehiculoAereo;
import cl.duoc.service.IList;
import java.util.ArrayList;
public class ListarVehiculo implements IList {
    private ArrayList<VehiculoAereo> lista;

    public ListarVehiculo() {
        this.lista = new ArrayList();
    }   
    
    @Override
    public ArrayList<VehiculoAereo> Listar() {
        return lista;
    }
    @Override
    public String Buscar(int id) {
        return lista.get(id).toString();
    }

    @Override
    public void Guardar(VehiculoAereo va) {
        lista.add(va);
    }

    @Override
    public void Eliminar(int ID) {
        lista.remove(ID);
    }
    
    @Override
    public void Eliminar(VehiculoAereo va) {
        lista.remove(va);
    }
    
    @Override
    public void Reemplazar(int ID, VehiculoAereo va) {
        lista.set(ID, va);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(VehiculoAereo ve : this.lista){
            sb.append(ve);
        }
        return sb.toString();
    }

    

    
    
}
