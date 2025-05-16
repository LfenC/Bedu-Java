
/**
 *
 * @author lizet
 */
public class Main {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Ana");
        Patrulla patrulla = new Patrulla("Patrulla", "Antonio");
        UnidadBomberos unidadBomberos = new UnidadBomberos("UnidadBomberos", "Carlos");

        ambulancia.iniciateOperation();
        System.out.println();
        
        patrulla.iniciateOperation();
        System.out.println();
        
        unidadBomberos.iniciateOperation();
        
    }
}
