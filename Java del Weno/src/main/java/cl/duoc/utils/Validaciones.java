/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.utils;

/**
 *
 * @author cmard
 */
public class Validaciones {
          
    public Boolean ValidarString(int cantidad, String nombre){
        
        return nombre.length()>cantidad;
    }
    
    public boolean ValidarNombre(String nombre){
        if(nombre.length()>0){
            return true;
        }
        else{
            return false;
        }           
    }    
    public boolean ValidarEmail(String email){
        if(email.contains("@") && (email.contains(".com") ||  email.contains(".cl"))){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean validaRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
}
