
import java.util.Scanner;


/**
 *
 * @author Oscar Aron romero Camacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    // el throws sirve para mandar el mensaje de error que es exeption
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        // se crea un scanner 
         Scanner input = new Scanner(System.in);
         // se crean dos varibles
        int iDendo, iDsor; 
        //imprime mensaje
        System.out.println("El dividendo");
        //imprime mensaje
        iDendo = input.nextInt();
        // utiliza la varible para que el usuario ingrese el entero
        System.out.println("El divisor");
        //imprime el mensaje
        iDsor = input.nextInt();
        // utiliza la varible para que el usuario ingrese el entero
        if(iDsor == 0){
            // Lanzamos Nuestras propia Exepcion
            // DOS COSAS CON LAS EXEPCIONES
            //Capturas-->
            //Propagarlas-->
           // este comando es el que hara que envie el mensaje 
            throw new Exception("Hola Mundo cruel!!");
        
    }
    }
}
