
package modelamiento.de.objetos;
/**
 * Clase para objetos de tipo coche. hereda de la clase vehiculo
 * @author edwin
 */
public class Coche extends Vehiculo {
    /**
     * Cantida de kilometros recorridos por el coche
     */
    public int kilometraje;
    /**
     * Captura la cantidad de kilometros recorridos por el coche
     */
    public void capturarKilometraje(){
        System.out.println("Ingrese el kilometraje del vehiculo");
        kilometraje=input.nextInt();
    }
}
