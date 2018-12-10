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
        //Arreglos --> Es una secuencia de variable del mismo tipo.
        //Capturar muchos deatos del mismo tipo
        //capturar edades, imprimir, calcular media
        //Tec 2 --> 3mil estudiantes (4bytes) = 12 mil bytes --> 12kb
        //Usar un Arreglo
        // tipo de dato [] nombre del identificador = new tipo de dato[Tamaño];
        // los arreglos son de acceso aleatorio
        // Acceso Secuencial: 
        int[] aiEdades = new int[3000];
        // Los Arreglos en java, c ,c++ tienen direcciones para cada posicion --> 0 es la primera --> n -1 la ultima
        // siendo N --> Tamaño del arreglo
        System.out.println(aiEdades.length);
        System.out.println("Primer Psicion" + aiEdades[0]);
        System.out.println("Ultima Posicion" + aiEdades[2999]);
        //llenarlos con edades:
        //17 - 40
        // es la longitud del arreglo 
        for (int i = 0; i < aiEdades.length; i++) {
            //Crea valores aleatorios
            int iEdad = (int)(Math.random() * 40) + 1;
            //Se utiliza el corchete para que imprima la direccion donde esta.
            aiEdades[i] = iEdad;
            
        }
        // los dos for hacen lo mismo
          // Imprimir Todo el Arreglo
          for (int i = 0; i < aiEdades.length; i++){
              System.out.println(aiEdades[i]);
          }
           // FOR EACH 
           for (int aiEdade : aiEdades) {
               System.out.println("For each - " + aiEdade);
        }
          //Sumatoria para calcular la media
          int iAcu = 0;
          for (int i = 0; i < aiEdades.length; i++) {
              iAcu = iAcu + aiEdades[i];
            
        }
          //se usa double para que la division se haga correctamente y utilize decimales.
        System.out.println("La medida es: " + (double)(iAcu/3000));
    }
    
}
