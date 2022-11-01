
package cl.duoc.service;

import cl.duoc.models.Avioneta;
import java.util.ArrayList;

public interface IListAvioneta {
    public ArrayList<Avioneta> Listar();
    
    public String Buscar(int id);
    
    public void Guardar(Avioneta avioneta);
    
    public void Eliminar(int ID);
    
    public void Eliminar(Avioneta avioneta);
    
    public void Reemplazar(int ID,Avioneta avioneta);
}
