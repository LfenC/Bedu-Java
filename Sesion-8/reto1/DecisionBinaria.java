
import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class DecisionBinaria implements LogicaDecision {
    
    //tomarDecision -->interface
    public String tomarDecision(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Hola, ¿Qué te gustaría hacer?");
        System.out.println("A: Acariciar un gatito");
        System.out.println("B: Ir de compras");
        System.out.println("Selecciona A o B:");
        String input = scanner.nextLine();
        scanner.close();
        return input.toUpperCase();
    }
}
