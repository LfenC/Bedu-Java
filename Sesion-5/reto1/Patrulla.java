
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
