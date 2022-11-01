
package cl.duoc.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Carguero extends VehiculoAereo{
    private int Tonelaje;
    
    public Carguero() {
        this.Tonelaje = 0;
    }    
    
    public Carguero(String Nombre, int ID, boolean ListoParaVolar,LocalDate FechaUltimoVuelo,int HorasVoladas,int Tonelaje) {
        super(Nombre,ID,ListoParaVolar,FechaUltimoVuelo,HorasVoladas); 
        this.Tonelaje = Tonelaje;
    }

    public int getTonelaje() {
        return Tonelaje;
    }

    public void setTonelaje(int Tonelaje) {
        this.Tonelaje = Tonelaje;
    }   
    
     @Override
    public String toString(){ 
        //"El veloz del cielo, #100, ultimo vuelo: 23/05/2022, total de horas: 44, Vuela muy mal"
        String Datos = super.getNombre()+", #"+super.getID()+", ultimo vuelo: "+super.getFechaUltimoVuelo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+", total de horas: "+super.getHorasVoladas()+", "+this.getTonelaje();
        return Datos;
    }
    
}
