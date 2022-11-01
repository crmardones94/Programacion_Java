
package cl.duoc.models;

import java.time.LocalDate;

public class Pasaje {
    private int ID;
    private Pasajero pasajero;
    private LocalDate Fecha;
    private int CodigoVuelo;
    private int Valor;
    private VehiculoAereo Aeronave;
    
    public Pasaje() {
        this.ID = 0;
        this.pasajero = new Pasajero();
        this.Fecha = LocalDate.now();
        this.CodigoVuelo = 0;
        this.Valor = 0;
        this.Aeronave = new VehiculoAereo();
    }
    
    public Pasaje(int ID, Pasajero pasajero, LocalDate Fecha, int CodigoVuelo, int Valor, VehiculoAereo Aeronave) {
        this.ID = ID;
        this.pasajero = pasajero;
        this.Fecha = Fecha;
        this.CodigoVuelo = CodigoVuelo;
        this.Valor = Valor;
        this.Aeronave = Aeronave;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public int getCodigoVuelo() {
        return CodigoVuelo;
    }

    public void setCodigoVuelo(int CodigoVuelo) {
        this.CodigoVuelo = CodigoVuelo;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public VehiculoAereo getAeronave() {
        return Aeronave;
    }

    public void setAeronave(VehiculoAereo Aeronave) {
        this.Aeronave = Aeronave;
    }
    
    
    
}
