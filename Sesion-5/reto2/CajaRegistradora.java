
package com.sesion5.reto2;

/**
 *
 * @author lizet
 */
public class CajaRegistradora {
    public static void main(String[] args) {
    
        MetodoPago[] metodos = {
            new PagoEfectivo(100.0),
            new PagoTarjeta(150.0,200.0),
            new PagoTransferencia(200.0, false)
        };     

        for (MetodoPago metodo: metodos) {
            if (metodo.autenticar()){
                System.out.println("Autenticación exitosa");
                metodo.procesarPago();
                metodo.mostrarResumen();
            } else {
                System.out.println("Fallo de autenticación. " + metodo.getClass().getSimpleName() + " no válido.");
            }
            System.out.println("");
        }

    }
    
}
