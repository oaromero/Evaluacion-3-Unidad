
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
         
         //Usando exepciones y ciclos, preguntar hasta que capturen valores validos y el divisor no sea cero
         while(true){
             // se tiene que tener el scanner dentro para que pueda tomar la captura
             Scanner input = new Scanner(System.in) ;
             //se hace uso del try catch en caso de una falla
         try{ 
             //imprime mensaje
          System.out.println("Divisor");
          // lee la variable ingresada
        int divi = input.nextInt();
        //imprime mensaje
        System.out.println("Dividiendo");
        //introduces la variable la cantidad
        int dividendo = input.nextInt();
    break;//cierre del while
    //se crea la exepcion en caso de que falle el try
         }catch(InputMismatchException e){
             System.out.println("Valores incorrectos");
            }
    // mostrar el resultado de la division
      } 
   }
}