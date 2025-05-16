

/**
 *
 * @author lizet
 */
public class MainNarrativa {
    public static void main(String[] args) {
        PaqueteNarrativo paqueteNarrativo = new PaqueteNarrativo("Inicio de la aventura");
        
        TransicionHistoria transicionHistoria = new TransicionSimple();
        GestorDialogo gestorDialogo = new DialogoTexto();
        LogicaDecision logicaDecision = new DecisionBinaria();
        
        //dialogo
        gestorDialogo.mostrarDialogo(paqueteNarrativo);
        String accion = logicaDecision.tomarDecision();
        transicionHistoria.realizarTransicion(accion);
    }
}
