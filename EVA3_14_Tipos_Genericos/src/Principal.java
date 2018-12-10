
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
      persona<String, Double>pObj = new persona();
        pObj.setNombre("Juan");
        pObj.setApellido("Perez");
        pObj.setClave("1231321654");
        pObj.setOtroDato(45.2);
        persona<Integer, Boolean>pObjEntero = new persona();
        //int --> Integer
        //double --> Double
        pObjEntero.setNombre("Yo");
        pObjEntero.setApellido("Hernandez");
        pObjEntero.setClave(100);
        pObjEntero.setOtroDato(true);
        // se imprime mensaje y los datos ingresados
        System.out.println("Datos de persona1:\n" + "Nombre:" + pObj.getNombre() 
                + "\nApellido: " + pObj.getApellido() + "\nClave: " + pObj.getClave());
        
    }
    
}
// se crea una clase para persona
class persona<T, S>{
    //se crean variables 
    private String nombre;
    private String apellido;
    private T clave;
    private S otroDato;
// se crean sus metodos get y set 
    public S getOtroDato() {
        return otroDato;
    }

    public void setOtroDato(S otroDato) {
        this.otroDato = otroDato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public T getClave() {
        return clave;
    }

    public void setClave(T clave) {
        this.clave = clave;
    }
    
    
}