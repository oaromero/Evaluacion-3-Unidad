

/**
 *
 * @author Oscaqr Aron Romero Camacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // se crea un array de dos dimensiones 
        int aiMatriz[][] = new int [3][3];
        //se crea un for para las dos dimensiones
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // se hace uso del random para desplegar cualquier numero
             aiMatriz[i][j] = (int)(Math.random() * 100);   
            }
        }
        System.out.println(aiMatriz);//Arreglo
        System.out.println(aiMatriz[0]);  //Arreglo
        System.out.println(aiMatriz[0] [0]);// Valor
        // NOmbre del arreglo
        // se hace uso de un array
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                System.out.println(aiMatriz[i][j]);
            }
        }
        //recorre una matriz, de forma estrictamente secuencial, de principio a fin.
        System.out.println("Usando FOR EACH");
        for (int[] is : aiMatriz) {
            for (int i : is) {
                //Imprime el mensaje
                System.out.println(i);
                
            }
            
        }
    }
    
}
