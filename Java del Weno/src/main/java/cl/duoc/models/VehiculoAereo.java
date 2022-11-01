/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.time.LocalDate;

import cl.duoc.utils.Validaciones;
/**
 *
 * @author cmard
 */
public class VehiculoAereo {
    private String Nombre;
    private int ID;
    private boolean ListoParaVolar;
    private LocalDate FechaUltimoVuelo;
    private int HorasVoladas;
    
    Validaciones v = new Validaciones();
    
    public VehiculoAereo() {
        this.Nombre = "";
        this.ID = 0;
        this.ListoParaVolar = false;
        this.FechaUltimoVuelo = LocalDate.now();
        this.HorasVoladas = 0;
    }   
    
    public VehiculoAereo(String Nombre, int ID, boolean ListoParaVolar, LocalDate FechaUltimoVuelo, int HorasVoladas) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.ListoParaVolar = ListoParaVolar;
        this.FechaUltimoVuelo = FechaUltimoVuelo;
        this.HorasVoladas = HorasVoladas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        if(v.ValidarNombre(Nombre)){
             this.Nombre = Nombre;
        }
        else{
             this.Nombre = "";
        }       
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isListoParaVolar() {
        return ListoParaVolar;
    }

    public void setListoParaVolar(boolean ListoParaVolar) {
        this.ListoParaVolar = ListoParaVolar;
    }

    public LocalDate getFechaUltimoVuelo() {
        return FechaUltimoVuelo;
    }

    public void setFechaUltimoVuelo(LocalDate FechaUltimoVuelo) {
        this.FechaUltimoVuelo = FechaUltimoVuelo;
    }

    public int getHorasVoladas() {
        return HorasVoladas;
    }

    public void setHorasVoladas(int HorasVoladas) {
        this.HorasVoladas = HorasVoladas;
    }    
}
