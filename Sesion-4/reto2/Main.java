
/**
 *
 * @author lizet
 */
public class Main {
    public static void main(String[] args) {
        
        //se crea la declaracion de impuestos
        DeclaracionImpuestos declaracionImpuestos = new DeclaracionImpuestos("ABCDE123445", 5200.0);
        
        //Se crea una cuenta fiscal
        CuentaFiscal cuentaFiscal = new CuentaFiscal("ABCDE123445", 7200.0);
    
        //mostrar informacion
        System.out.println("Declaracion enviada por RFC: " + declaracionImpuestos.rfcContribuyente()
                            + " por $" + declaracionImpuestos.montoDeclarado());
        cuentaFiscal.mostrarCuenta();
    
        //se valida si el rfc de la declaracion es valido
        boolean rfcValido = cuentaFiscal.validarRFC(declaracionImpuestos);
        System.out.println("¿RFC válido para esta cuenta?: " + rfcValido);
    }
}
