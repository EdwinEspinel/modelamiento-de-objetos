
package modelamiento.de.objetos;
/**
 * Ejercicio 2. ¿Es posible ejecutar un programa en java que
   contenga varias clases con métodos main? En caso positivo,
   ¿cómo se determina el punto de entrada a un programa?
 * @author edwin
 */
public class Ejercicio2 {
    /**
     * Funcion que instancia objetos de las clases
     */
    public Ejercicio2() {
        Main1_Ejercicio2 main1=new Main1_Ejercicio2();
        main1.main();
        Main2_Ejercicio2 main2=new Main2_Ejercicio2();
        main2.main();
    }
    
    
}
