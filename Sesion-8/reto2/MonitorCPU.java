

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author lizet
 */
public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //hashset
        Set<Integer> registros = new HashSet<>();
        
        try{
            System.out.println("Ingresa el consumo de CPU (en porcentaje) o escribe -3 para salir");
            //validaciones
            while(true){
                System.out.println("Porcentaje de CPU: ");
                int valor = scanner.nextInt();
                //salir
                if(valor == -3){
                    break;
                }
                if (valor < 0 || valor > 100) {
                    System.out.println("Valor fuera de rango. Debe estar entre 0 y 100. ");
                    continue;
                }
                
                if(!registros.add(valor)){
                    System.out.println("Valor duplicado: " + valor + "%");
                    continue;
                }
                
                if(valor > 95){
                    throw new ConsumoCriticoException("Alerta: Consumo crítico detectado (" + valor + "%)");
                }
                
                System.out.println("Registro aceptado: " + valor + "%");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero válido");
        } catch (ConsumoCriticoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Recursos cerrados correctamente.");
        }   
    }
}
