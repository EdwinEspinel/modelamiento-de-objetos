
package modelamiento.de.objetos;
/**
 * Clase para objetos de tipo bicicleta. hereda de la clase vehiculo
 * @author edwin
 */
public class Bicicleta extends Vehiculo{
    /**
     * Determina si la bicicleta es de contrapedal
     */
    public boolean contrapedal;
    /**
     * Captura si la bicicleta es o no de contrapedal
     */
    public void capturarContrapedal(){
        System.out.println("Ingrese true si la bicicleta es de contrapeda y false en caso contrario ");
        contrapedal=input.nextBoolean();
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "contrapedal=" + contrapedal + '}';
    }
    
}
