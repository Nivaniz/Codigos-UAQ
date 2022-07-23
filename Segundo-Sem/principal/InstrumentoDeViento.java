package principal;
 
enum Acorde{
    DO,
    RE,
    MI,
    FA,
    SOL,
    LA,
    SI
}
public class InstrumentoDeViento {
    
    private final int numCuerdas = 0;
    private boolean estadoAfinado, ocupado; //Variable de estado, si es true -> instrumento afinado; si es false -> desafinado
    private String nombre;
    private double largo, alto;
    
    public InstrumentoDeViento(boolean estadoAfinado, boolean ocupado, String nombre, double largo, double alto){
        this.estadoAfinado = estadoAfinado;
        this.ocupado = ocupado;
        this.nombre = nombre;
        this.largo = largo;
        this.alto = alto;
    }
    
    public int getNumCuerdas(){
        return 0;
    }
    
    public boolean isEstadoAfinado(){
        return estadoAfinado;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getLargo(){
        return largo;
    }
    
    public double getAlto(){
        return alto;
    }
    
    public boolean isOcupado(){
        return ocupado;
    }
    
    public void dejar(){
        this.ocupado = false;
    }
    
    public void tocar (Acorde acorde){
        System.out.println(acorde.toString().toLowerCase());
        this.ocupado = true;
    }
    
    public void afinar(){
        this.estadoAfinado = true;
        System.out.println("El instrumento esta afinado");
    }
    
}
