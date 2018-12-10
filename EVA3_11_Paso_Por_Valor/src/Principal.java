
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
        //se crea una variable
        int iVal = 0;
        //Hace uso del metodo llanar para que lo que valga el ival tambien la copia
        llenar(iVal);
        //imprime cantidad
        System.out.println(iVal);
    }
    // recive iVal, La copia es i, NO se modifico ival se modifico la copia de ival 
    public static void llenar(int i){
        i = (int)(Math.random() * 100) + 1;
        System.out.println("llenar " + i);
    }
}
