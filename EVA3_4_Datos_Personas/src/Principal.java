
import java.util.Scanner;
/**
 *
 * @author Oscar Aron Romero Camacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // utilizamos un scanner para leer los datos
        Scanner leer = new Scanner(System.in);
        //declaramos una varible y les creamos un arreglo
        String[] pNombre  = new String [10];;
        int[] eEdad  = new int [10];;
        int Media;
        
      
        
        // se crea un for para ingresar los datos y repita las veces que se indican en el arreglo
        for (int i = 0; i < pNombre.length; i++){
            System.out.println("Escribe el nombre: ");
            pNombre[i] = leer.nextLine();
            leer.nextLine();
        }
        // en este ciclo se desplega el mensaje junto con la varible
        for (String i : pNombre) {
            System.out.println("El Nombre es: " + i);
        }
        
        for (int i = 0; i < eEdad.length; i++) {
            System.out.println("Escribe tu edad: ");
            eEdad[i] = leer.nextInt(); 
            leer.nextInt();
        }
        
        for (int i : eEdad) {
            System.out.println("Su edad es: " + i);
        }
        
    }
    
}
