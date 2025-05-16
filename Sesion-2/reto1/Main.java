
import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class Main {
       public static void main(String[] args) {    
        Scanner scanner = new Scanner (System.in);           
            System.out.println("Introduce el nombre del medicamento:");
            String nombreMedicamento= scanner.nextLine();
            
            System.out.println("Introduce el precio unitario:");
            double precioUnitario = scanner.nextDouble();
             //solo se limpia buffer
             //si se usa nextint o double y luego nextline
            
            System.out.println("Introduce la cantidad de piezas");
            int cantidadPiezas = scanner.nextInt();
            
            //objeto farmacia(instancias)
            SimuladorFarmacia farmacia = new SimuladorFarmacia(nombreMedicamento,precioUnitario,cantidadPiezas);
            
            // Llamar al método mostrarInformacion() del objeto
            System.out.println("");
            System.out.println("Datos recibidos:");
            farmacia.mostrarInformacion();      
            
            //cerrar buffer
            scanner.close();
        } 
}
