package cl.duoc.service;

import cl.duoc.models.VehiculoAereo;
import java.util.ArrayList;
public interface IList {
    public ArrayList<VehiculoAereo> Listar();
    
    public String Buscar(int id);
    
    public void Guardar(VehiculoAereo vehiculo);
    
    public void Eliminar(int ID);
    
    public void Eliminar(VehiculoAereo vehiculo);
    
    public void Reemplazar(int ID, VehiculoAereo vehiculo);
}
