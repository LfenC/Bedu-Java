
/**
 *
 * @author lizet
 */
public class SimuladorFarmacia {
    String nombreMedicamento;
    double precioUnitario;
    int cantidadPiezas;

    public SimuladorFarmacia(String nombreMedicamento, double precioUnitario, int cantidadPiezas) {
        this.nombreMedicamento = nombreMedicamento;
        this.precioUnitario = precioUnitario;
        this.cantidadPiezas = cantidadPiezas;
    }
    
    public void mostrarInformacion() {
    //calcular total usando var (solo se permite dentro de métodos o bloques)
    var total = (precioUnitario * cantidadPiezas);

    //condicion para aplicar descuento
    boolean aplicaDescuento = total > 500.00;
    
    //condicional para aplicar el descuento sino, no
    double descuento = aplicaDescuento ? total * 0.15 : 0;
    
    double totalConDescuento = total- descuento;
    

    System.out.println("Medicamento: " + nombreMedicamento);
    System.out.println("Cantidad: " + cantidadPiezas);    
    System.out.println("Precio unitario: $" + precioUnitario);  
    System.out.println("Total sin descuento: $" + total);       
    System.out.println("¿Aplica descuento?: " + aplicaDescuento);       
    System.out.println("Descuento: $" + descuento);       
    System.out.println("Total a pagar: $" + totalConDescuento);       

    }

}
