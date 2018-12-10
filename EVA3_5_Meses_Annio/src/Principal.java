
import java.util.Scanner;

/*
 *Los arreeglos son imutables
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // se crea un arreglo para los meses cada uno posee un numero
        String[] asMeses = new String[12];
         asMeses[0] = "Enero";
         asMeses[1] = "Febrero";
         asMeses[2] = "Marzo";
         asMeses[3] = "Abril";
         asMeses[4] = "Mayo";
         asMeses[5] = "Junio";
         asMeses[6] = "Julio";
         asMeses[7] = "Agosto";
         asMeses[8] = "Septiembre";
         asMeses[9] = "Octubre";
         asMeses[10] = "Noviembre";
         asMeses[11] = "Diciembre";
         
         String[] asMeses2 = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre",
             "Noviembre", "Diciembre"};
         Scanner leer = new Scanner(System.in);
         //Restamos uno porque en el arreglo empezamos desde 0
         int iMes =leer.nextInt() - 1;
         //se utiliza para leer 
         System.out.println("El mes es: " + asMeses[iMes]);
         }
         
    }
    

