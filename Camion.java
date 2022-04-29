
package modelamiento.de.objetos;
/**
 * Clase para objetos de tipo camion. hereda de la clase vehiculo
 * @author edwin
 */
public class Camion extends Vehiculo{
    /**
     * Tipo de carga del camion
     */
    public String carga;
    /**
     * Captura el tipo de carga
     */
    public void capturarCarga(){
        System.out.println("Ingrese el tipo de carga que transporta ");
        carga=input.nextLine();
    }
    @Override
    public String toString() {
        return "Camion{" + "carga=" + carga + '}';
    }    
}
