/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sesion5.reto1;

/**
 *
 * @author lizet
 */
public abstract class UnidadEmergencia {
    //atributp
    String name; 

    //constructor
    public UnidadEmergencia(String name) {
        this.name = name;
    }
    
    //metodo abstracto
    public abstract void response();
    
    //metodo concreto
    
    public void activateUnit(){
        System.out.println("Activando unidad: " + name);
    }
}
    
/*
🚨 Activando unidad: Ambulancia
📍 GPS: Ubicación actual detectada.
🔊 Sirena: Activada.
👷 Operador Juan reportándose.
🩺 Ambulancia en camino al hospital más cercano.

🚨 Activando unidad: Patrulla
📍 GPS: Ubicación actual detectada.
🔊 Sirena: Activada.
👮 Operador Laura reportándose.
🚓 Patrulla atendiendo situación de seguridad ciudadana.

🚨 Activando unidad: UnidadBomberos
📍 GPS: Ubicación actual detectada.
🔊 Sirena: Activada.
👨‍🚒 Operador Marco reportándose.
🔥 Unidad de bomberos respondiendo a incendio estructural.

*/