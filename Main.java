
package modelamiento.de.objetos;

import java.io.IOException;
import java.util.Scanner;
/**
 * Contiene los ejercicios de taller de modelamiento de objetos
 * @author edwin
 */
public class Main {
    private static boolean bandera=true;
    private static int opcion;
    /**
     * funcion que instancia el funcionamiento del main
     */
    public static void main(String[] args) throws IOException{
        do {
            limpiarPantalla();
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);
    }
    /**
     * Menu perteneciente al main
     */
    private static void menu() {
        System.out.println("Escoja un punto del taller");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");        
        System.out.println("0. Salir del programa");
        
    }
    /**
     * Captura la opcion escogida por el usuario
     * @return entero
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
     * switch que permite al usuario escoger el ejercicio que deses visualizar
     * @param opcion
     * @return boleano que determina si el programa sigue funcionando
       o para de funcionar
     */
    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                Ejercicio1 listaAstros = new Ejercicio1();
                listaAstros.astros();
                return true;
            case 2:
                Ejercicio2 texto = new Ejercicio2();                
                return true;
            case 3:
                Ejercicio3 aleatorio = new Ejercicio3();
                aleatorio.aleatorios();
                return true;
            case 4:
                Ejercicio4 vehiculo = new Ejercicio4();
                return true;
            case 5:
                Ejercicio5 miTransporte = new Ejercicio5();
                miTransporte.transporte();
                return true;
            case 6:
                Ejercicio6 miVector = new Ejercicio6();
                miVector.llenarVector();
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
