//librerias
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;



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
        //Archivos de texto 
        //Abrir elk archivo --> InputStream
        //Leer bytes        --> InputStreamReader
        //Convertir a texto --> BufferedReader
        InputStream isAbrir = null;
        InputStreamReader isLeer = null;
        BufferedReader brTexto = null;
        // se crea un try para en caso de errores
        try {
            //Buscamos un archivo para abrirlo y leerlo
            isAbrir = Files.newInputStream(Paths.get("c:/Archivos/Ok.txt"));
            isLeer = new InputStreamReader(isAbrir);
            brTexto = new  BufferedReader(isLeer);
            String sLinea = brTexto.readLine();
            while(sLinea != null){
                System.out.println(sLinea);
                sLinea = brTexto.readLine();
            }
            brTexto.close();
        } catch (IOException ex) {
          ex.printStackTrace();
        }
        
    }
    
}
