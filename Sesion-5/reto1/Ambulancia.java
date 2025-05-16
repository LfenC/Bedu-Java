
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
