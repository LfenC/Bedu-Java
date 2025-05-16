

/**
 *
 * @author lizet
 */

public class DialogoTexto implements GestorDialogo{
    //mostrar Dialogo --> interface
    public void mostrarDialogo(PaqueteNarrativo paqueteNarrativo){
        System.out.println("Escena actual: " + paqueteNarrativo.getEscenaActual());
        System.out.println("Una persona misteriosa aparece y te ofrece sólo dos opciones");
    }
}
