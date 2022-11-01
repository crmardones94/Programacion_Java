package cl.duoc.service.app;

import cl.duoc.service.IListAvioneta;
import org.junit.Before;
import org.junit.Test;

import cl.duoc.models.Avioneta;
import cl.duoc.service.app.ListarAvioneta;

public class ListarAvionetaTest {
    IListAvioneta listar;
    Avioneta Avioneta;

    @Before
    public void setup(){
        Avioneta = new Avioneta();
        listar = new ListarAvioneta();
    }

    @Test
    public void Guardar_NotException(){
        listar.Guardar(Avioneta);
    }
    @Test
    public void Modificar_NotException(){
        listar.Guardar(Avioneta);
        listar.Reemplazar(0, Avioneta);
    }
    @Test
    public void Listar_NotException(){
        listar.Listar();
    }
    @Test
    public void ListarUno_NotException(){
        listar.Guardar(Avioneta);
        listar.Listar().indexOf(0);
    }
    @Test
    public void BorrarPorID_NotException(){
        listar.Guardar(Avioneta);
        listar.Eliminar(0);
    }
    @Test
    public void BorrarPorObjeto_NotException(){
        listar.Guardar(Avioneta);
        listar.Eliminar(Avioneta);
    }
}
