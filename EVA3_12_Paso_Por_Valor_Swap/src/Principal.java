
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
        //se crea un objeto 
        Valor vobj = new Valor();
        //Obtiene valor 
        vobj.ix = 100;
        //se crea otro objeto
        Valor vob2 = new Valor();
        //se le da valor
        vob2.ix = 500;
        //llama al metodo intercambiar efectuandolo
        intercambiar(vobj, vob2);
        // imprime el mensaje y la cantidad i
        System.out.println("obj 1 = " + vobj.ix);
        System.out.println("obj 2 = " + vob2.ix);
        // metodo para intercambiar
        Valor vTemp = vobj;
        vobj = vob2;
        vob2 = vTemp;
    }
    
    public static void intercambiar(Valor v1, Valor v2){
        //se pueden cambiar la cantidad
        
        Valor vTemp = v1;
        v1 = v2;
        v2 = vTemp;
        
    }
}
//se crea la clase para declarar una variable para el valor
class Valor {
    int ix;
    
}