
package com.sesion8.reto1;

/**
 *
 * @author lizet
 */
public class TransicionSimple implements TransicionHistoria{
    public void realizarTransicion(String decision){
        if(decision.equalsIgnoreCase("A")){
            System.out.println("El jugador decide acariciar un gatito");
        } else {
            System.out.println("El jugador decide ir de comprar");
        }
    }
}
