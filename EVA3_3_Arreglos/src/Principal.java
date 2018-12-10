/*
 *
 */

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
        // todos son arreglos
        int[] aiEnteros, x, y, z;
        //Este es un arreglo
        int aiEnteros2[], a, b, c;
        //arreglo para 10 enteros
        aiEnteros = new int [10];
        System.out.println(aiEnteros); //dirección de la memoria
        for (int i = 0; i < aiEnteros.length; i++) {
            aiEnteros[i] = (int)(Math.random() * 100);
            
        }
        for (int i : aiEnteros) {
            System.out.println("Valor = " + i);
        }
    }
    
}
