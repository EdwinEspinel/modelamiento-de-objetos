
package modelamiento.de.objetos;

public class Moto extends Vehiculo{
    public int cascos;
    public void capturarCacos(){
        System.out.println("Ingrese el kilometraje del vehiculo");
        cascos=input.nextInt();
    }
}
