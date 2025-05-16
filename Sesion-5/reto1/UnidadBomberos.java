
/**
 *
 * @author lizet
 */
public class UnidadBomberos extends UnidadEmergencia {
    private SistemaGPS sistemagps;
    private Sirena sirena;
    private Operador operador;   

//ya que se tiene constructor
    //en clase padre de name se agrega super para llamarlo
    
    public UnidadBomberos(String name, String  nombreOperador){
        super(name);
        this.sistemagps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }
    
    @Override
    public void response() {
        System.out.println("Unidad de bomberos respondiendo a incendio estructural.");
    }
    
    public void iniciateOperation(){
        activateUnit();
        sistemagps.localize();
        sirena.activateSiren();
        operador.report();
        response();
    }
    
}
