
package modelamiento.de.objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Ejercicio 4. Se quiere implementar el control de un Ferry. 
   Para ello cree una clase Vehículo.Incluya aspectos comunes 
   a todos los vehículos como número de pasajeros, presencia 
   o ausencia de tripulación, número de ruedas, fecha de 
   matriculación,medio por el que se desplaza, etc. Incluya 
   los métodos que considere oportunos.Realice un programa 
   capaz de leer por teclado los datos de 10 vehículos y los 
   liste a continuación por pantalla.
 * @author edwin
 */

public class Ejercicio4 {
    /**
     * Definicion del scaner
     */
    Scanner input = new Scanner(System.in);
    /**
     * Cantidad de vehiculos que se desean ingresar
     */
    public int cant;
    /**
     * Listo de objetos tipo vehiculo
     */
    private List<Vehiculo>vehiculos= new ArrayList<>();
    /**
     * Metodo que agrega los vehiculos a la lista
     */
    public Ejercicio4() {
            System.out.println("Cuantos vehiculos desea ingresar?");
            cant=input.nextInt();
            Vehiculo newVehiculo = new Vehiculo();
            for(int i=0;i<cant;i++){                
                newVehiculo.capturarTripulacion();                
                newVehiculo.capturarNumPasajeros();
                newVehiculo.capturarNumRuedas();
                newVehiculo.capturarFechaMatricula();
                newVehiculo.capturarDesplazamiento();
                vehiculos.add(newVehiculo);
            }  
            for(Vehiculo iteVehiculos:vehiculos){
                System.out.println(iteVehiculos.toString()); 
            }
    }
}
