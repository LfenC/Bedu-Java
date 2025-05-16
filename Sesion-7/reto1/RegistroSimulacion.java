

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author lizet
 */
public class RegistroSimulacion {
    
    public static void main(String[] args) {
        /*ruta lap
        Path carpeta = Paths.get("src/main/java/com/sesion7/reto1/config");
        */
        /*github*/
        Path carpeta = Paths.get("C:/Users/lizet/Documents/GitHub/Bedu-Java/Sesión 7/config");
        
        Path archivo = carpeta.resolve("parametros.txt");
        guardarParametros(carpeta, archivo);
        leeParametros(archivo);

    }
    public static void guardarParametros(Path carpeta, Path archivo){      
        //objeto path para definir la ruta del archivo parametros
        //carpeta
        
        String parametros = "Tiempo de ciclo: 55.8 segundos\n"
                          + "Velocidad de línea: 1.2 m/s\n"
                          + "Número de estaciones: 8\n";       
        try {
            //crear la carpeta si no existe
            if (!Files.exists(carpeta)){
                Files.createDirectory(carpeta);
                System.out.println("Carpeta 'config/' creada");
            }
            
            Files.write(archivo, parametros.getBytes());
            System.out.println("Archivo de parámetros escrito correctamente");
        } catch (IOException e) {
            System.err.println("Error al trabajar con el archivo: " + e.getMessage());
        
        }
    }
    
    public static void leeParametros(Path archivo){
       
        try {
        //validar si existe el archivo
            if (Files.exists(archivo)){
                System.out.println("El archivo fue creado exitosamente");
                //leer contenido
                String contenido = Files.readString(archivo);
                System.out.println("Contenido del archivo:");
                System.out.println(contenido);
            } else {            
                System.out.println("El archivo no fue creado");
            }
        } catch (IOException e) {
            System.err.println("Error al trabajar con el archivo: " + e.getMessage());

        }
    }
}
