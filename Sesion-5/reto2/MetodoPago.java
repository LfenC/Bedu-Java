
/**
 *
 * @author lizet
 */
public abstract class MetodoPago implements Autenticable {
    //accesible para clases y subclases
    protected double monto;

    public MetodoPago(double monto) {
        this.monto = monto;
    }
    
    //obliga a clases hijas a usar este metodo
    public abstract void procesarPago();
    
    public void mostrarResumen(){
        System.out.println("Tipo: " + this.getClass().getSimpleName() + " - " + "Monto: $" + monto);
    }
    
}
