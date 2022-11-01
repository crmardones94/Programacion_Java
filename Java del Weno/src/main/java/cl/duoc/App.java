package cl.duoc;
import cl.duoc.models.*;
import java.time.LocalDate;
public class App 
{
    public static void main( String[] args )
    {
        /*
         * Hola, lo siento, se que es poco lo que rescaté de la información y poco contexto te dí,
         * pero de verdad necesito tu ayuda.
         * 
         * El programador que teníamos se fué y nos dejó sin nada que probar ni hacer,
         * lo bueno es que tenemos los archivos de TEST que vamos a aplicar, asi que 
         * al menos sabemos el resultado que debiese hacer, pero el cómo se hacía, no hay mucho.
         * 
         * Sientete en libertad de trabajar con alguien más en esto. Te aseguro que valdrá
         * la pena.
         * 
         * Lo necesitamos si o si para antes de la media noche entre el Martes 1ro de Noviembre y el Miércolewenaas
         * 2 de Noviembre. Debe estar operativo y subido en github sino, nada valdrá la pena.
        */
        VehiculoAereo av = new Avion("El Mas Veloz",44,false,LocalDate.of(2022, 05, 23),0,"Esta malo");
        System.out.println(av.toString());
        
        
    }
}