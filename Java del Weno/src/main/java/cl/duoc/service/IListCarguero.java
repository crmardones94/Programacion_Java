
package cl.duoc.service;

import cl.duoc.models.Carguero;
import java.util.ArrayList;

public interface IListCarguero {
    public ArrayList<Carguero> Listar();
    
    public String Buscar(int id);
    
    public void Guardar(Carguero carguero);
    
    public void Eliminar(int ID);
    
    public void Eliminar(Carguero carguero);
    
    public void Reemplazar(int ID,Carguero carguero);
}
