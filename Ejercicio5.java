
package modelamiento.de.objetos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Ejercicio 5. A partir de la clase anterior, y mediante herencia 
   cree nuevas clases que permitan diferenciar si el objeto es un
   coche, una moto, un camión, una bicicleta, una lancha. Incluya 
   en cada clase algún atributo específico que la diferencie de 
   las demás. Por ejemplo, para el coche un booleano que determine
   si es de tres o cinco puertas, para el camión la altura 
   (indiferente en los otros vehículos), etc. Realice un programa
   como el del ejercicio anterior capaz de trabajar con los 
   distintos tipos de vehículos.
 * @author edwin
 */
public class Ejercicio5 {
    /**
     * boleano que se usa para iniciar o acabar el sistema
     */
    private static boolean bandera=true;
    /**
     * opcion escogida por el usuario
     */
    private static int opcion;
    /**
     * Lista de objetos tipo Bicicleta
     */
    private List<Bicicleta>miCicla;
    /**
     * Lista de objetos tipo Camion
     */
    private List<Camion>miCamion;
    /**
     * Lista de objetos tipo Coche
     */
    private List<Coche>miCoche;
    /**
     * Lista de objetos tipo Lancha
     */
    private List<Lancha>miLancha;
    /**
     * Lista de objetos tipo Moto
     */
    private List<Moto>miMoto;
    /**
     * funcion que inicia el sistema e instancia los metodos
     * @throws IOException 
     */
    public void transporte() throws IOException{
        do {
            
            limpiarPantalla();
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);
    }
    /**
     * Menu del sistema
     */
    private static void menu() {
        System.out.println("Que desea hacer?");
        System.out.println("1. Ingresar una bicicleta");
        System.out.println("2. Ingresar un camion");  
        System.out.println("3. Ingresar un coche");
        System.out.println("4. Ingresar una lancha");
        System.out.println("5. Ingresar una moto");
        System.out.println("0. Salir del programa");
        
    }
    /**
     * Captura la opcion escogida por el usuario
     * @return 
     */
    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    /**
     * Limpia la pantalla
     */
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    /**
     * switch dependiendo de la opcion que escogio el usuario
     * @param opcion
     * @return
     * @throws IOException 
     */
    private boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                miCicla=new ArrayList<Bicicleta>();
                Bicicleta newCicla = new Bicicleta();
                newCicla.capturarDesplazamiento();
                newCicla.capturarFechaMatricula();
                newCicla.capturarNumPasajeros();
                newCicla.capturarNumRuedas();
                newCicla.capturarTripulacion();
                newCicla.capturarContrapedal();
                miCicla.add(newCicla);
                for (Bicicleta iteCicla:miCicla){
                    iteCicla.toString();
                }
                return true;
            case 2:
                miCamion=new ArrayList<Camion>();
                Camion newCamion = new Camion();
                newCamion.capturarDesplazamiento();
                newCamion.capturarFechaMatricula();
                newCamion.capturarNumPasajeros();
                newCamion.capturarNumRuedas();
                newCamion.capturarTripulacion();
                newCamion.capturarCarga();
                miCamion.add(newCamion);
                for (Camion iteCamion:miCamion){
                    iteCamion.toString();
                }
                return true;
            case 3:
                miCoche=new ArrayList<Coche>();
                Coche newCoche = new Coche();
                newCoche.capturarDesplazamiento();
                newCoche.capturarFechaMatricula();
                newCoche.capturarNumPasajeros();
                newCoche.capturarNumRuedas();
                newCoche.capturarTripulacion();
                newCoche.capturarKilometraje();
                miCoche.add(newCoche);
                for (Coche iteCamion:miCoche){
                    iteCamion.toString();
                }
                return true;
            case 4:
                miLancha=new ArrayList<Lancha>();
                Lancha newLancha = new Lancha();
                newLancha.capturarDesplazamiento();
                newLancha.capturarFechaMatricula();
                newLancha.capturarNumPasajeros();
                newLancha.capturarNumRuedas();
                newLancha.capturarTripulacion();
                newLancha.capturarCombustible();
                miLancha.add(newLancha);
                for (Lancha iteCamion:miLancha){
                    iteCamion.toString();
                }
                return true;
            case 5:
                miMoto=new ArrayList<Moto>();
                Moto newMoto = new Moto();
                newMoto.capturarDesplazamiento();
                newMoto.capturarFechaMatricula();
                newMoto.capturarNumPasajeros();
                newMoto.capturarNumRuedas();
                newMoto.capturarTripulacion();
                newMoto.capturarCacos();
                miMoto.add(newMoto);
                for (Moto iteCamion:miMoto){
                    iteCamion.toString();
                }
                return true;
            case 0:
                return false;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
        }
}
