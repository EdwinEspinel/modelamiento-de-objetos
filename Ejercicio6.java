
package modelamiento.de.objetos;
/**
 *
 * @author edwin
 */
import java.util.*;
public class Ejercicio6 {
    Scanner input = new Scanner(System.in);
    Vector vector = new Vector(20,5);
    int num;
    public void llenarVector(){
        int a=0;
        while(a==0){
            System.out.println("Ingrese un numero");
            num=input.nextInt();
            
            int longi=vector.size();            
            for(int i=0;i<longi;i++){
                //System.out.println(vector.elementAt(i));
                if((int)vector.elementAt(i)==num){                                      
                    a=1;                                                           
                }
            }
            vector.add(num);
        }
        int longitudT=vector.size();
        for(int i=0;i<longitudT;i++){
                System.out.print(vector.elementAt(i)+" ");    
            }
        System.out.println(" ");
    }
}
