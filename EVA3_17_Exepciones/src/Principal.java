
import java.util.InputMismatchException;
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
        // se crea uso de la libreria Scanner 
    Scanner input = new Scanner(System.in) ;
    //S crea una variabled
      int iResu = 0; 
      //uso del metodo try es en caso de que el problema falle,
      //en caso de que el comando falle dentro del try, se hace uso de catch
     try{//
         //Imprime mensaje
        System.out.println("Divisor");
        // se crea una nueva variable la cual lee lo que se escanea
        int divi = input.nextInt();
        //imprime mensaje 
        System.out.println("Dividiendo");
        // es para ller la cantidad escaneada
        int dividendo = input.nextInt();
    // efectua la resolucion del problema dividiendo las cantidades
         iResu = dividendo/ divi;
         //uso del catch en caso de alguna falla con el try
     }catch(ArithmeticException e){
         //imprime mensaje
         System.out.println("El divisor es CERO, no se pude realizar la operacion");
         //int iCero = 0;
         //int iExcepcion = 10/ iCero;
         // crea una exepcion el cual desplegrara de que si no es un numero, imprima el memnsaje
          }catch(InputMismatchException e){
             System.out.println("El valor capturado no es un numero valido");
  }
     // Imprime resultado
        System.out.println("Resultado  = " + iResu);
}
}
