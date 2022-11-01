
package cl.duoc.service;

import cl.duoc.models.Avion;
import java.util.ArrayList;

public interface IListAvion {
    public ArrayList<Avion> Listar();
    
    public String Buscar(int id);
    
    public void Guardar(Avion avion);
    
    public void Eliminar(int ID);
    
    public void Eliminar(Avion avion);
    
    public void Reemplazar(int ID,Avion avion);
}
