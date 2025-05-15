/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sesion5.reto1;

/**
 *
 * @author lizet
 */
public class Ambulancia extends UnidadEmergencia {
    private SistemaGPS sistemagps;
    private Sirena sirena;
    private Operador operador;
    
    public Ambulancia(String name, String operador){
        super(name);
        this.sistemagps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(operador);
    }
    
    @Override
    public void response() {
        System.out.println("Ambulancia en camino al hospital más cercano.");
    }
    
    public void iniciateOperation(){
        activateUnit();
        sistemagps.localize();
        sirena.activateSiren();
        operador.report();
        response();
    }
}
