
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
        //Se crea la libreria scanner para hacer las lecturas
        Scanner input = new Scanner(System.in);
        // se crean dos variables 
        int iDendo, iDsor; 
        //imprime mensaje
        System.out.println("El dividendo");
        // comando para ingresar un entero
        iDendo = input.nextInt();
        //imprime mensaje
        System.out.println("El divisor");
        //comando para ingresar un entero
        iDsor = input.nextInt();
        //se declara una variable igualandola a 0
        int iResu = 0;
        //se hace uso de un try en caso de alguna falla o en caso de que falle
        try{
            //ecuacion para resolver la divicion
            iResu = iDendo / iDsor;
            // en caso de que falle 
       }catch(ArithmeticException e){
           //se pueden generar exepciones cerrar archivos, liberar recursos
           e.printStackTrace();
            System.out.println("Division entre cero");
       }finally{
            //Siempre se ejecuta, cerrar archivo liberar recursos 
            System.out.println("Bloque finally");
        }
                
    }
    
}
