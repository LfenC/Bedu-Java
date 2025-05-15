/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sesion5.reto1;

/**
 *
 * @author lizet
 */
public class Patrulla extends UnidadEmergencia{
    private SistemaGPS sistemagps;
    private Sirena sirena;
    private Operador operador;
    
//ya que se tiene constructor
    //en clase padre de name se agrega super para llamarlo
    
    public Patrulla(String name, String operador){
        super(name);
        this.sistemagps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(operador);
    }
    
    @Override
    public void response() {
        System.out.println("Patrulla atendiendo situación de seguridad ciudadana.");
    }
    
    public void iniciateOperation(){
        activateUnit();
        sistemagps.localize();
        sirena.activateSiren();
        operador.report();
        response();
    }
}
