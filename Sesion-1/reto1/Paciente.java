/**
 *
 * @author lizet
 */
public class Paciente {
    // Caracteristicas del paciente
        String nombrePaciente;
        int edadPaciente;
        String numeroExpediente;
     
    //metodo mostrar informacion
        public void mostrarInformacion() {
        System.out.println("Paciente: " + nombrePaciente);
        System.out.println("Edad: " + edadPaciente );        
        System.out.println( "Expediente: " + numeroExpediente);           
    }
}
