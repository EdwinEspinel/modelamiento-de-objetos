package modelamiento.de.objetos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Primer punto del taller.Desarrolle una clase en Java que realice
   la abstracción de un sistema planetario,debiendo tener en cuenta
   para cada cuerpo del sistema aspectos como: masa,densidad, 
   diámetro, distancia al sol (suponga órbitas circulares), un número
   de identificador único y un nombre textual. 
   Incluya métodos que calculen la atracción gravitatoria entre dos 
   cuerpos cualesquiera del sistema.
 * @author edwin
 */
public class Ejercicio1 {
    /**
     * Variable que tiene como funcion determinar si el switch 
       debe funcionar o no
     */
    private static boolean bandera = true;
    /**
     * Seleccion del usuario
     */
    private static int opcion;
    /**
     * Array list de objetos tipo Astro
     */
    private List<Astro> misAstros;
    
    /**
     * Funcion que instancia el funcionamiento de este sistema. 
     */
    public void astros() throws IOException {
        misAstros = new ArrayList<Astro>();
        do {
            limpiarPantalla();
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);
    }
    /**
     * Menu de este ejercicio
     */
    private static void menu() {
        System.out.println("Que desea hacer?");
        System.out.println("1. Ingresar un astro");
        System.out.println("2. Calcular la gravedad entre dos astros");
        System.out.println("0. Salir del programa");

    }
    /**
     * Funcion para capturar la opcion escogida por el usuario
     * @return 
     */
    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    /**
     * Limpiar pantalla
     */
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    /**
     * switch del sistema donde se desarrolla la opcion escogida
       por el usuario
     * @param opcion
     * @return bandera
     * @throws IOException 
     */
    private boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                Astro newAstro = new Astro();
                newAstro.capturarId();
                newAstro.capturarNombre();
                newAstro.capturarMasa();
                newAstro.capturarDensidad();
                newAstro.capturarDiametro();
                newAstro.capturarDistancia();
                misAstros.add(newAstro);
                return true;
            case 2:
                int masaTemp1 = 0;
                int masaTemp2 = 0;
                int cont = 0;
                int id1;
                int id2;
                Astro Gravedad = new Astro();
                Gravedad.Datos();
                id1 = Gravedad.getId1();
                id2 = Gravedad.getId2();
                for (Astro iteradorAstros : misAstros) {
                    if (iteradorAstros.getId() == (id1)) {
                        masaTemp1 = iteradorAstros.getMasa();
                        cont = cont + 1;
                    }
                    if (iteradorAstros.getId() == (id2)) {
                        masaTemp2 = iteradorAstros.getMasa();
                        cont = cont + 1;
                    }
                    if (cont == 2) {
                        break;
                    }
                }
                Gravedad.Calcular(masaTemp1, masaTemp2);
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
