
/**
 *
 * @author lizet
 */
public class Factura {
    private String folio;
    private String cliente;
    private double total;

    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }
    
    //toString para mostrar la informacion de la factura de manera legible
    @Override
    public String toString() {
        return "Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }
    
    // Sobrescribimos equals() para comparar contenido
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura factura = (Factura) obj;
        return this.folio.equals(factura.folio);
    }
    
    // hashCode() compatible con equals()
    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}
