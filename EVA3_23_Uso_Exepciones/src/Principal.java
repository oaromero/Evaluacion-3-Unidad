

/**
 *
 * @author Oscar aron romero camacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado eEmp = new Empleado();
        eEmp.setNombre("Juan");
        eEmp.setApellido("Perez");
        try{
        eEmp.setSalario(-1000);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Nombre = " + eEmp.getNombre() + "Apallido " + eEmp.getApellido() + "Salario");
    }         
}
//se creo una clase para empleado
class Empleado{
    // se crearon 3 variables 
    private String Nombre, Apellido;
   // se usa double cuando son cantidades decimales
    private double salario;
//se crean sus metodos get y set 
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getSalario() {
        return salario;
    }
//en este metodo set se incluyo una excepcion en caso de que el salario se menor(negativo)
    public void setSalario(double salario) throws Exception {
        if(salario < 0)//Salarios Negativos
            // este sera el mensaje en caso de que salga una cantidad negativa
            throw new Exception("Nose permiten salarios negativosd");
        
        this.salario = salario;
    }
    
}