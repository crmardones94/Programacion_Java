
package cl.duoc.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Avion extends VehiculoAereo{
    private String DatosExtra;
    
    public Avion() {
        this.DatosExtra = "";
    }
    
    public Avion(String Nombre, int ID, boolean ListoParaVolar,LocalDate FechaUltimoVuelo,int HorasVoladas,String DatosExtra) {
        super(Nombre,ID,ListoParaVolar,FechaUltimoVuelo,HorasVoladas);        
        this.DatosExtra = DatosExtra;
    }

    public String getDatosExtra() {
        return DatosExtra;
    }

    public void setDatosExtra(String DatosExtra) {
        this.DatosExtra = DatosExtra;
    }    
    
    @Override
    public String toString(){ 
        //"El veloz del cielo, #100, ultimo vuelo: 23/05/2022, total de horas: 44, Vuela muy mal"
        String Datos = super.getNombre()+", #"+super.getID()+", ultimo vuelo: "+super.getFechaUltimoVuelo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+", total de horas: "+super.getHorasVoladas()+", "+this.getDatosExtra();
        return Datos;
    }    
}
