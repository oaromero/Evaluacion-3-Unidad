
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oscar Aron romero Camacho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // se crea un arreglo
        List lsMilista = new ArrayList();
        // ha ese arreglo se le agregaron distintas cantidades
        lsMilista.add(100);
        lsMilista.add(500);
        lsMilista.add(600);
        lsMilista.add(700);
        lsMilista.add(90);
        //System.out.println(lsMilista);
        // se crea un ciclo for creando una varible, la cual despliega cada una de las cantidades
        for (int i = 0; i < lsMilista.size(); i++) {
            System.out.println( lsMilista.get(i));
        }
    }
    
}
