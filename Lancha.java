
package modelamiento.de.objetos;
/**
 * Clase para objetos de tipo lancha. hereda de la clase vehiculo
 * @author edwin
 */
public class Lancha extends Vehiculo{
    /**
     * tipo de combustible que usa la lancha
     */
    public String Combustible;
    /**
     * Captura el tipo de combustible
     */
    public void capturarCombustible(){
        System.out.println("Ingrese el tipo de combustible que usa el vehiculo");
        Combustible=input.nextLine();
    }

    @Override
    public String toString() {
        return "Lancha{" + "Combustible=" + Combustible + '}';
    }
    
}
