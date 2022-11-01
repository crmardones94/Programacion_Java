
package cl.duoc.models;

import cl.duoc.utils.Validaciones;
import java.time.LocalDate;

public class Pasajero {
    private int ID;
    private String Nombre;
    private LocalDate FechaNacimiento;
    private int Rut;
    private String dv;
    private int Telefono;
    private String Email;
    private boolean Vetado;
    
    Validaciones vali = new Validaciones();
    
    
    public Pasajero() {
        this.ID = 0;
        this.Nombre = "";
        this.FechaNacimiento = LocalDate.now();
        this.Rut = 0;
        this.Telefono = 0;
        this.Email = "";
        this.Vetado = false;
    }
    
    public Pasajero(int ID, String Nombre, LocalDate FechaNacimiento, String Rut, int Telefono, String Email, boolean Vetado) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.Rut = 0;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Vetado = Vetado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut,char dv ) {
        
        if(vali.validaRut(Rut, dv)){
            this.Rut = Rut;
            this.dv = String.valueOf(dv);
        }else{
            this.Rut = 0;
            this.dv = "";
        }
    }
    
    public String getdv() {
        return dv;
    }
    
    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {        
        if(vali.ValidarEmail(Email)){
            this.Email = Email;
        }
        else{
            this.Email = "";
        }      
    }

    public boolean isVetado() {
        return Vetado;
    }

    public void setVetado(boolean Vetado) {
        this.Vetado = Vetado;
    }
    
    
}
