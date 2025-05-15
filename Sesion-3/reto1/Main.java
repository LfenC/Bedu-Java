
package com.sesion3.reto1;

/**
 *
 * @author lizet
 */
public class Main {
    public static void main(String[] args) {
        
        //crear objeto
        Pasajero pasajero = new Pasajero("Antonio Ruelas", "P123456");
        
        //vuelo
        Vuelo vuelo = new Vuelo("MX456", "China", "13:00");
        
        //se reserva asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if(reservado){
            System.out.println("Reserva realizada con éxito.");
        } else {
            System.out.println("No se pudo realizar la reserva");
        }
        
        //mostrar el itinerario
        System.out.println(vuelo.obtenerItinerario());
        //cancelarlo
        System.out.println("Cancelando reserva...");
        vuelo.cancelarReserva();
        
        //mostrar el itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());
        //se realiza otra reservacion
        vuelo.reservarAsiento("Kennia Vega", "A452368");
        System.out.println(vuelo.obtenerItinerario());       
    }
}
