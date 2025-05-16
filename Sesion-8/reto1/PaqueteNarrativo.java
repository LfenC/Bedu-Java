
/**
 *
 * @author lizet
 */
public class PaqueteNarrativo {
    private String escenaActual;
    
    //constructor
    public PaqueteNarrativo(String escenaActual) {
        this.escenaActual = escenaActual;
    }
    
    //getter y setter
    public String getEscenaActual(){
        return escenaActual;
    }
    public void setEscenaActual(String nuevaEscena){
        this.escenaActual = nuevaEscena;
    }
}
