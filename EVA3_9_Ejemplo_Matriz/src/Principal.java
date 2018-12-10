/*
 * Creacion de una matriz y una copia
 * valor (cipia del objeto
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
       // se crea dos dimension, dos for
        System.out.println("Matriz Num. 1");
        int aiMatriz[][] = new int[5][5];
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                aiMatriz[i][j] = (int)(Math.random() * 100 + 1);
            }
        }
         for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                //print para que se escriban en renglon
                 System.out.print("[" + aiMatriz[i][j] + "]");
            }
            //println para dar la separacion de los reglones
         System.out.println("");   
         
    }
         //Se creo una copia con los mismos datos
        System.out.println("");
        System.out.println("Copia");
        
     
         int aiMatriz2[][] = new int[5][5];
        for (int i = 0; i < aiMatriz2.length; i++) {
            for (int j = 0; j < aiMatriz2[i].length; j++) {
                aiMatriz2[i][j] = (int)(Math.random() * 100 + 1);
                // SE Uso Para Hacer que los valores sean losa mismos
             aiMatriz2[i][j] =  aiMatriz[i][j]; 
            }
        }
         for (int i = 0; i < aiMatriz2.length; i++) {
            for (int j = 0; j < aiMatriz2[i].length; j++) {
                //print para que se escriban en renglon
                 System.out.print("[" + aiMatriz2[i][j] + "]");
    
  }
             System.out.println("");
                ImprimirMatriz(aiMatriz2);
}         //imprime mensaje
         System.out.println("");
         System.out.println("Matriz Num3");
         //se crean dos dimensiones y sus dos for uno para la selecion de los numero.
          int aiMatriz3[][] = new int[10][10];
        for (int i = 0; i < aiMatriz3.length; i++) {
            for (int j = 0; j < aiMatriz3[i].length; j++) {
                aiMatriz3[i][j] = (int)(Math.random() * 100 + 1);
            }
        }
        //para ordenar en forma de matriz
         for (int i = 0; i < aiMatriz3.length; i++) {
            for (int j = 0; j < aiMatriz3[i].length; j++) {
                //print para que se escriban en renglon
                 System.out.print("[" + aiMatriz3[i][j] + "]");
            }
            //println para dar la separacion de los reglones
         System.out.println("");   
         
    }
}
    // es para imprimir la matriz, la cual solo posee funciones no la imprime.
    public static void ImprimirMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 100 + 1);
    }
}
    }
    
    }
