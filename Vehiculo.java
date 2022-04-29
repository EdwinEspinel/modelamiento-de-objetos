
package modelamiento.de.objetos;

//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Scanner;
/**
 * Clase para instanciar objetos de tipo vehiculo
 * @author edwin
 */

public class Vehiculo {
    /**
     * El vehiculo esta o no tripulado
     */
    public boolean tripulacion;
    /**
     * Cantidad de pasajeros
     */
    public int numPasajeros;
    /**
     * Cantidad de ruedas del vehiculo
     */
    public int numRuedas;
    /**
     * Fecha que se matriculo el vehiculo
     */
    public String fechaMatricula;
    /**
     * Medio que utiliza el vehiculo para transportarse
     */
    public String desplazamiento;
    Scanner input = new Scanner(System.in);

    public Vehiculo() {
        this.tripulacion = tripulacion;
        this.numPasajeros = numPasajeros;
        this.numRuedas = numRuedas;
        this.fechaMatricula = fechaMatricula;
        this.desplazamiento = desplazamiento;
        
    }
    /**
     * Capturar variable tripulacion
     */
    public void capturarTripulacion(){
        System.out.println("Ingrese true si el vehiculo esta tripulado. En caso contrario ingrese false: ");
        tripulacion=input.nextBoolean();
    }   
    /**
     * Capturar numero de pasajeros
     */
    public void capturarNumPasajeros(){
        System.out.println("Numero de pasajeros: ");
        numPasajeros =input.nextInt();
        input.skip("\n");

    }
    /**
     * Capturar numero de ruedas
     */
    public void capturarNumRuedas(){
        System.out.println("Numero de ruedas del vehiculo: ");
        numRuedas =input.nextInt();
        input.skip("\n");
    }
    /**
     * Capturar fecha de matricula
     */
    public void capturarFechaMatricula(){
        System.out.println("Fecha de matricula: (dd//mm//aaaa)");
        //input.nextLine();
        fechaMatricula = input.nextLine();
    }
    /**
     * Capturar medio por el cual se transporta
     */
    public void capturarDesplazamiento(){
        System.out.println("Por que medio se desplaza el vehiculo");
        desplazamiento = input.nextLine();
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "tripulacion=" + tripulacion + ", numPasajeros=" + numPasajeros + ", numRuedas=" + numRuedas + ", fechaMatricula=" + fechaMatricula + ", desplazamiento=" + desplazamiento + '}';
    }    
}
