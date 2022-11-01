package cl.duoc.service.app;
import cl.duoc.service.IListAvion;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import cl.duoc.models.Avion;
import cl.duoc.service.app.ListarAvion;

public class ListarAvionTest {
    IListAvion listar;
    Avion avion;

    @Before
    public void setup(){
        avion = new Avion();
        listar = new ListarAvion();
    }

    @Test
    public void Guardar_NotException(){
        listar.Guardar(avion);
    }
    @Test
    public void Modificar_NotException(){
        listar.Guardar(avion);
        listar.Reemplazar(0, avion);
    }
    @Test
    public void Listar_NotException(){
        listar.Listar();
    }
    @Test
    public void ListarUno_NotException(){
        listar.Guardar(avion);
        listar.Listar().indexOf(0);
    }
    @Test
    public void BorrarPorID_NotException(){
        listar.Guardar(avion);
        listar.Eliminar(0);
    }
    @Test
    public void BorrarPorObjeto_NotException(){
        listar.Guardar(avion);
        listar.Eliminar(avion);
    }
}
