
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



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
          // TODO code application logic here
        FileInputStream fisLeerArchivo = null;
      
       // se hace uso del try en caso de no funcionar
        try {
            //Se identifica la ruta a la cual buscar
            fisLeerArchivo = new FileInputStream("c:/Archivos/Oscar.txt");
           
            
            int iValor = fisLeerArchivo.read();//lee los bytes
            while(iValor != -1){//fin del archivo
                //Escribir lo que leemos en el otro archivo
                System.out.println("" + (char)iValor);
                iValor = fisLeerArchivo.read();
            }
           // en caso de un error de la direccion del try, va al catch mostrando un mensaje de que el archivo no existe
        } catch (FileNotFoundException ex) {
            System.out.println("El Archivo no existe");
           ex.printStackTrace();
          
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("El archivo no puede abrir");
        }finally{
            //Cerramos los archivos
            try{// es para que termine cerrando el ciclo
            if(fisLeerArchivo != null){
                  fisLeerArchivo.close();
            }
         
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        
    }
    
    }
    

