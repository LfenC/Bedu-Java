
package com.sesion3.reto2;

import java.util.Optional;

/**
 *
 * @author lizet
 */
public class Factura {
    
    //atributos
    private double monto;
    private String descripcion;
    //se maneja de manera seegura un valor null
    private Optional<String> rfc;
    
    //constructor
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }
    
    //metodo que devuelve el resumen de la factura
    
    public String getResumen(){
        String resumen = "Factura generada:\n";
        resumen += "Descripcion: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";
        
        //si no se tiene rfc se muestra lo siguiente
        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";
        
        return resumen;
    }
    
}
