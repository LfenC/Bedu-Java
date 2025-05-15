
package com.sesion4.reto2;

import java.util.Objects;

/**
 *
 * @author lizet
 */
public class CuentaFiscal {
   //es final no es modificable una vez asignado
    private final String rfc;
    private double saldoDisponible;
    
    //constructor
    public CuentaFiscal(String rfc, double saldoDisponible){
        this.rfc = rfc;
        //validacion
        if(saldoDisponible >= 0){
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("El saldo no puede ser negativo");
            this.saldoDisponible = 0;
        }
    }
    
    //getters

    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }
    
    //metodo para validar si el rfc coincide con el rfc de la cuenta
    public boolean validarRFC(DeclaracionImpuestos declaracionImpuestos){
        return Objects.equals(this.rfc, declaracionImpuestos.rfcContribuyente());
    }
    
    //metodo para mostrar la informacion de la cuenta
    public void mostrarCuenta(){
        System.out.println("Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible);
    }
}
