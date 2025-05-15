/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sesion5.reto2;

/**
 *
 * @author lizet
 */
public class PagoTarjeta extends MetodoPago{ 
    private double saldoDisponible;
    
    public PagoTarjeta(double monto, double saldoDisponible){
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }
    @Override
    public boolean autenticar(){
        return saldoDisponible >= monto;
    }
    
    @Override
    public void procesarPago(){
        System.out.println("Procesando pago con tarjeta por $" + monto);
    }
}