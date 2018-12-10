
import java.util.logging.Level;
import java.util.logging.Logger;


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
        // imprime mensaje
           System.out.println("Inicia main");
           //usa un try catch para en caso de un error
        try { 
            //llama al objeto A
            A();
        } catch (Exception ex) {// se crea la exepcion
        ex.printStackTrace();
        }
        //imprime mensaje
        System.out.println("Termina main");
    }
    // los objetos van llamando se unos a otros y cada uno tiene un exeption el cual desplegara un mensaje cuando se realize el error
    public static void A() throws Exception{
        // mensaje a imprimir y el objeta al que llama.
        System.out.println("inica A");
        B();
        System.out.println("termina A");
    }
     public static void B() throws Exception{
        System.out.println("Inicia B");
        C();
        System.out.println("Termina B");
    }
      public static void C() throws Exception{
        System.out.println("Inicia C");
        // mensaje que se va impriri
        throw new Exception("Ya valio!!!");
       
    }
    }
    


