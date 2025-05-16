/**
 *
 * @author lizet
 */
public class Principal {
        public static void main(String[] args) {
        // Crear un objeto de tipo Producto utilizando el constructor
        Entrada entrada1 = new Entrada("Concierto", 600.0);
        Entrada entrada2 = new Entrada("Película Flow", 70.0);

        // Llamar al método para mostrar la información del producto
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

    }
}

