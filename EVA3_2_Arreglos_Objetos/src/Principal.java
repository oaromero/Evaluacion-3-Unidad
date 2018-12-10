/*
 * 
 */

/**
 *
 * @author Oscar Aron Romero Camcho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se creo el arrreglo pero no los objetos
        persona[] apAlumnos = new persona[5];
        //Creacion de objetos
         for (int i = 0; i < apAlumnos.length; i++) {
            apAlumnos[i] = new persona("Juen Perez");
        }
        // Uso para imprimir los nombres
        for (int i = 0; i < apAlumnos.length; i++) {
            apAlumnos[i].imprimir();
        }
    }
    
} 
// se crea una clase para desplegar el nombre de la persona
class persona{
    public String nombre;
    public void imprimir(){
        System.out.println(nombre);
        
    }
    // constructor de persona
    public persona(String nombre){
        this.nombre = nombre;
    }
    
}
