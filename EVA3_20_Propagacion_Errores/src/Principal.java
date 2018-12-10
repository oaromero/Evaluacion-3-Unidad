

/**
 *
 * @author 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //imprime mensaje
        System.out.println("Inicia main");
       A(); // llama al objeto a
        //imprime mensaje
        System.out.println("Termina main");
    }
    
    public static void A(){
         //imprime mensaje
        System.out.println("inica A");
        B();//llama al objeto b
         //imprime mensaje
        System.out.println("termina A");
    }
     public static void B(){
          //imprime mensaje
        System.out.println("Inicia B");
        C();//llama al objeto c
         //imprime mensaje
        System.out.println("Termina B");
    }
      public static void C(){
           //imprime mensaje
        System.out.println("Inicia C");
        //El try captura el error que se da cuando la division si se hace 0/1
        try{
            //se crea una variable junto con la division
        int iDivi = 1 / 0;
        //uso del catch en caso de que falle el try
        }catch(ArithmeticException e){
            //se usa una exepcion
            e.printStackTrace();
        }
         //imprime mensaje
        System.out.println("Termina C");
    }
}
