
package modelamiento.de.objetos;

import static java.lang.Math.pow;
import java.util.Scanner;
import java.util.logging.Logger;
/**
 * Clase que sirve para instanciar objetos de tipo Astro
 * @author edwin
 */
public class Astro {
    /**
     * Nombre del astro
     */
    String nombre;
    /**
     * Diametro del astro
     */
    int diametro;
    /**
     * Id del astro. Sirve para diferenciarlo
     */
    int id;
    /**
     * Masa del astro
     */
    int masa;
    /**
     * Densidad del astro
     */
    int densidad;
    /**
     * Distancia entre el astro y el sol
     */
    int distSol;
    /**
     * Gravedad calculada entre dos astros
     */
    int Gravedad;
    /**
     * Separacion entre dos astros
     */
    int separación;
    /**
     * Permite buscar datos de un astro guardados
     */
    int id1;
    /**
     * Permite buscar datos de un segudo astro, tambien guardado
     */
    int id2;
    /**
     * Masa del primer astro que se consulto
     */
    int masa1;
    /**
     * masa del segundo astro que se consulto
     */
    int masa2;
    Scanner input = new Scanner(System.in);       
    /**
     * Permite capturar el id de un astro
     */
    public void capturarId(){
        System.out.println("Ingrese el id del astro");
        id=input.nextInt();
    }
    /**
     * Permite capturar la masa de un astro
     */
    public void capturarMasa(){
    System.out.println("Ingrese la masa del astro en kg");
    masa=input.nextInt()*1000;}
    /**
     * Permite capturar el diametro de un astro
     */
    public void capturarDiametro(){
        System.out.println("Ingrese el diametro del astro en kilometros");
        diametro=input.nextInt();
    }
    /**
     * Permite captura la distancia de un astro hasta el sol
     */
    public void capturarDistancia(){
        System.out.println("Ingrese la distancia al sol en kilometros");
        distSol=input.nextInt();
    }
    /**
     * Permite captura del nombre de un astro
     */
    public void capturarNombre(){
        System.out.println("Ingrese el nombre del astro");
        input.nextLine();
        nombre=input.nextLine();
    }
    /**
     * Permite captura la densidad de un astro
     */
    public void capturarDensidad(){
        System.out.println("Ingrese la densidad del astro en kg/m^3");
        densidad=input.nextInt();
    }
    /**
     * Funcion que permite capturar los datos necesarios para calcular
       la gravedad entre dos astros
     */
    public void Datos(){ 
        System.out.println("Ingrese la separacion entre los dos astros en km");
        separación=input.nextInt()*1000;
        System.out.println("Ingrese el id del primer astro");
        id1=input.nextInt();
        System.out.println("Ingrese el id del segundo astro");
        id2=input.nextInt();
    }
    /**
     * Funcion que calcula la gravedad entre dos astros
     * @param Masa del primer astro
     * @param Masa del segundo astro
     */
    public void Calcular(int masa1,int masa2){
        double gravedad;
        gravedad=(6.661*(Math.pow(10,-11)))*(masa1*masa2)/Math.pow(separación,2);
        System.out.println("La atracción gravitacional entre los astros es de: "+gravedad);
        
    }
    /**
     * Permite retornar la masa de un astro
     * @return 
     */
    public int getMasa() {
        return masa;
    }
    /**
     * Permite retornar el id del primer astro para calcular la gravedad
     * @return 
     */
    public int getId1() {
        return id1;
    }
    /**
     * Permite retornar el id del segundo astro para calcular la gravedad
     * @return 
     */
    public int getId2() {
        return id2;
    }
    /**
     * Permite retornar el id del astro que se desea buscar
     * @return 
     */
    public int getId() {
        return id;
    } 
}
