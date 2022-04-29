package modelamiento.de.objetos;

import java.io.IOException;
import java.util.Scanner;

/**
 * Ejercicio 3. Escriba un programa en java que genere aleatoriamente (Ayuda:
 * Vea la clase Math para saber cómo generar números aleatorios en java) un
 * array de números reales, y lo ordene mediante el algoritmo de la burbuja o
 * mediante quick sort (esto deberá poder elegirlo el usuario).
 *
 * @author edwin
 */
public class Ejercicio3 {

    int[] ale = new int[21];
    private static boolean bandera = true;
    private static int opcion;

    /**
     * Llama los diferentes metodos de la clase
     *
     * @throws IOException
     */
    public void aleatorios() throws IOException {
        do {
            limpiarPantalla();
            aleatorio();
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);
    }

    /**
     * Menu
     */
    private static void menu() {
        System.out.println("Que desea hacer?");
        System.out.println("1. Organizar con algoritmo de la burbuja");
        System.out.println("2. Organizar mediante quick sort");
        System.out.println("0. Salir");

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
     * switch para evaluar la opcion ingresada por el usuario
     * @param opcion
     * @return
     * @throws IOException 
     */
    private boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                burbuja();
                return true;
            case 2:
                Quick(0, 20, ale);
                imprimir();
                return true;
            case 0:
                return false;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
    }
    /**
     * Genera un arreglo de numeros aleatorios
     */
    public void aleatorio() {
        for (int i = 0; i < 21; i++) {
            ale[i] = (int) (Math.random() * 100) + 1;            
        }
    }
    /**
     * Ordena el arreglo con el metodo burbuja
     */
    public void burbuja() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (ale[j] > ale[j + 1]) {
                    int aux = ale[j];
                    ale[j] = ale[j + 1];
                    ale[j + 1] = aux;
                }
            }
        }
        for (int l = 0; l < 21; l++) {
            System.out.print(ale[l] + " ");
        }
        System.out.println("");
    }
    /**
     * Organiza el arreglo con el metodo Quick sort
     * @param primero
     * @param ultimo
     * @param v 
     */
    public void Quick(int primero, int ultimo, int v[]) {
        int i = primero;
        int j = ultimo;
        int posPivote = primero;
        int pivote = v[posPivote];
        int temp;
        while (i < j) {
            while (pivote >= v[i] && i < j) {
                i++;
            }
            while (pivote < v[j]) {
                j--;
            }
            if (i < j) {
                temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
        }
        v[primero] = v[j];
        v[j] = pivote;
        if (primero < j - 1) {
            Quick(primero, j - 1, v);
        }
        if (ultimo > j + 1) {
            Quick(j + 1, ultimo, v);
        }

    }
    /**
     * Metodo para imprimir el vector
     */
    public void imprimir() {
        for (int l = 0; l < 21; l++) {
            System.out.print(ale[l] + " ");
        }
        System.out.println("");
    }
}
