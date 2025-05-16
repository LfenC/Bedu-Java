
/**
 *
 * @author lizet
 */
public class PagoTransferencia extends MetodoPago {    
    private boolean validacion;
    
    public PagoTransferencia (double monto, boolean validacion){
        super(monto);
        this.validacion = validacion;
    }
    
    @Override
    public boolean autenticar(){
        return validacion;
    }
    
    @Override
    public void procesarPago(){
        System.out.println("Procesando transferencia bancaria por $" + monto);
    }
}
