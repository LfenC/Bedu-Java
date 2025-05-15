
package com.sesion3.reto1;

/**
 *
 * @author lizet
 */
public class Vuelo {
    //final
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado;
    
    //constructor
    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }
    
    //metodo 
    public boolean reservarAsiento(Pasajero pasajero){
        if(asientoReservado == null){
            asientoReservado = pasajero;
            return true;
        } else {
            return false;
        }
    }
    
    //sobrecarga de metodo
    public boolean reservarAsiento(String nombre, String pasaporte){
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }
    
    //metodo retonor void
    public void cancelarReserva(){
        asientoReservado = null;
    }
    
    //metodo retorno string
    public String obtenerItinerario(){
        String informacion = "Itinerario de vuelo: \n";
        informacion += "Código: " + codigoVuelo + "\n";
        informacion += "Destino: " + destino + "\n";
        informacion += "Salida: " + horaSalida + "\n";
        if(asientoReservado != null){
            informacion += "Pasajero: " + asientoReservado.nombre + "\n";
        } else {
            informacion += "Pasajero: [Sin reserva]\n";
        }
        return informacion;
    }
}
