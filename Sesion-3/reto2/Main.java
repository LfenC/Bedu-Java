
package com.sesion3.reto2;

/**
 *
 * @author lizet
 */
public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura(3000.00, "Servicio de consultoria", "ABCC010101XYZ");
        
        //factura sin rfc
        Factura facturaSinRFC = new Factura(2000.00, "Cambio de laptop", null);
        
        //se muestran ambas
        System.out.println(factura.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}
