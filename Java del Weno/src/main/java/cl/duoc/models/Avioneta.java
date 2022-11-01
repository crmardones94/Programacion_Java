
package cl.duoc.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Avioneta extends VehiculoAereo{
    private boolean UltraSonico;

    public Avioneta(String Nombre, int ID, boolean ListoParaVolar,LocalDate FechaUltimoVuelo,int HorasVoladas,boolean UltraSonico) {
        super(Nombre,ID,ListoParaVolar,FechaUltimoVuelo,HorasVoladas); 
        this.UltraSonico = UltraSonico;
    }
    
    public Avioneta() {
        this.UltraSonico = false;
    }

    public boolean isUltraSonico() {
        return UltraSonico;
    }

    public void setUltraSonico(boolean UltraSonico) {
        this.UltraSonico = UltraSonico;
    }
    
     @Override
    public String toString(){ 
        //"El veloz del cielo, #100, ultimo vuelo: 23/05/2022, total de horas: 44, Vuela muy mal"
        String Datos = super.getNombre()+", #"+super.getID()+", ultimo vuelo: "+super.getFechaUltimoVuelo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+", total de horas: "+super.getHorasVoladas()+", "+this.isUltraSonico();
        return Datos;
    }
    
}
