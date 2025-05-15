/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sesion5.reto2;

/**
 *
 * @author lizet
 */
public class PagoEfectivo extends MetodoPago {
    
    public PagoEfectivo(double monto){
        super(monto);
    }    
    
    @Override
    public boolean autenticar(){
        return true;
    }
    
    @Override
    public void procesarPago(){
        System.out.println("Procesando pago en efectivo por $" + monto);
    }
}
