

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author lizet
 */
public class AnalizadorDeLogs {
     public static void main(String[] args) {
        Path path = Paths.get("C:/Users/lizet/Documents/GitHub/Bedu-Java/Sesión 7/reto2/errores.log");
        Path pathError = Paths.get("C:/Users/lizet/Documents/GitHub/Bedu-Java/Sesión 7/reto2/errores_fallo.txt");
        
        int totalLineas = 0;
        int conteoErrores = 0;
        int conteoWarnings = 0;
        
        //lectura del archivo
        try (BufferedReader lector = Files.newBufferedReader(path)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;
                //contar
                if(linea.contains("ERROR")){
                    conteoErrores++;
                }
                if(linea.contains("WARNING")){
                    conteoWarnings++;
                }
            } 
            //imprimir analisis
            System.out.println("Análisis completado:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Total de errores (ERROR): " + conteoErrores);
            System.out.println("Total de advertencias (WARNING): " + conteoWarnings);
            
            //obtener porcentaje de cada uno
            double porcentajeErrores = (totalLineas > 0) ? ((double) conteoErrores / totalLineas) * 100 : 0;
            double porcentajeWarnings = (totalLineas > 0) ? ((double) conteoWarnings / totalLineas) * 100 : 0;

            System.out.printf("Porcentaje de errores: %.2f%%\n", porcentajeErrores);
            System.out.printf("Porcentaje de advertencias: %.2f%%\n", porcentajeWarnings);
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());          
            //obtener error/fallo
            try (BufferedWriter writer = Files.newBufferedWriter(pathError)){
                writer.write("Se produjo un error al leer el archivo 'errores.log': " + e.getMessage());
            } catch (IOException ep){
                System.out.println("Además, no se pudo escribir en el archivo de registro de fallos");
            }
        }
    }
}
