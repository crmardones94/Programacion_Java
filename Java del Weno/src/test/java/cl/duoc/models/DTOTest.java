package cl.duoc.models;

import cl.duoc.models.Pasajero;
import cl.duoc.models.Pasaje;
import cl.duoc.models.Carguero;
import cl.duoc.models.Avion;
import cl.duoc.models.VehiculoAereo;
import java.time.LocalDate;

import javax.sound.sampled.SourceDataLine;

import org.junit.Test;
import org.junit.Assert;
import cl.duoc.models.*;

public class DTOTest {
    
    @Test
    public void avionesDTO(){
        VehiculoAereo avion = new Avion();
        VehiculoAereo avioneta = new Avioneta();
        VehiculoAereo carguero = new Carguero();
    }

    @Test
    public void pasajesDTO(){
        Pasaje pasaje = new Pasaje();
        Pasajero pasajero = new Pasajero();
    }

    @Test
    public void testToString()
    {
        VehiculoAereo avion = new Avion("El veloz del cielo", 100, true, LocalDate.of(2022, 05, 23), 44,"Vuela muy mal");
        String expected = "El veloz del cielo, #100, ultimo vuelo: 23/05/2022, total de horas: 44, Vuela muy mal";
        System.out.println("==================");
        System.out.println("Entregaste: "+avion.toString());
        System.out.println("Debe ser  : "+expected);
        System.out.println("==================");
        Assert.assertEquals(expected, avion.toString());
    }
}