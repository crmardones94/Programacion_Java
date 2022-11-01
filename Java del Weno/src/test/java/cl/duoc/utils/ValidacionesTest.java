package cl.duoc.utils;

import org.junit.Test;
import org.junit.Assert;

import cl.duoc.utils.Validaciones;

public class ValidacionesTest {
    
    @Test
    public void Prueba_Validaciones(){
        Validaciones v = new Validaciones();
        System.out.println("====================");
        System.out.println("Validaciones.ValidarString(5, 'adsf') Debe ser Falso");
        System.out.println("Resultado: "+ (v.ValidarString(5, "adsf") ? "Verdadero" : "Falso)"));
        System.out.println("====================");
        Assert.assertEquals(
            false,
            v.ValidarString(5, "adsf")
        );
    }
}
