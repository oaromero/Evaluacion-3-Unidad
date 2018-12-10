
/**
 *
 * @author  Oscar Aron Romero Camacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona[] apTodos = new Persona[10];
        apTodos[0] = new Alumno();
        apTodos[1] = new Alumno();
        apTodos[2] = new Alumno();
        apTodos[3] = new Alumno();
        apTodos[4] = new Alumno();
        apTodos[5] = new Empleado();
        apTodos[6] = new Empleado(); 
        apTodos[7] = new Empleado(); 
        apTodos[8] = new Empleado(); 
        apTodos[9] = new Empleado(); 
        for (int i = 0; i < apTodos.length; i++) {
            // Si es alumno llenarlo con juen perez y 0011
            // Si es Empleado llenarlo con pedro paramo y 1000
            if(apTodos[i] instanceof Alumno){
                Alumno aobj = (Alumno)apTodos[i];
                aobj.nombre = "juan ";
                aobj.apellido = "perez";
                aobj.NumControl = "0111";
            }
            else{
                
            }
        }
    }
    
}
//se crea una clase que se extinde de persona y declaramos una variable
class Empleado extends Persona{
    int claveEmpl;
} 
//se crea una clase que se extinde de persona y declaramos una variable
class Alumno extends Persona{
    String NumControl;
}
//se crea una clase con los datos basicos de una persona, teniendo dos String
class Persona{
    String nombre;
    String apellido;
}