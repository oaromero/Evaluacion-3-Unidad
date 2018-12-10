

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
        //se crea un arreglo
        int aiArreglo[] = new int[5];
        //se llama al comando llenar para que ejecute su funcion con el arreglo
        llenar(aiArreglo);
        //se hace para que se despliegue en vertical
        for (int i = 0; i < aiArreglo.length; i++) {
            // se utilizo para encerrar en corchetes la variable
            System.out.println("[" + aiArreglo[i] + "]");
        }
    }
    // se crea una variable con una dimension 
    public static void llenar(int aiArre[]){
        //se crea su ciclo for para almacenar y desplegar un numero aleatorio
        for (int i = 0; i < aiArre.length; i++) {
            aiArre[i] = (int)(Math.random() * 100) + 1;
        }
    }
}
