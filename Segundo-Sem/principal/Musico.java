package principal;

public class Musico {
    String nombre;
    int edad, aniosExperiencia;
    double eficienciaAlTocar;
    boolean tocandoInstrumento;
    
    public Musico(String nombre, int edad, int aniosExperiencia, double eficienciaAlTocar, boolean tocandoInstrumento){
        this.nombre = nombre;
        this.edad =edad;
        this.aniosExperiencia = aniosExperiencia;
        
        if(eficienciaAlTocar < 0.0 || eficienciaAlTocar > 9.9){
            this.eficienciaAlTocar =5.5;
        }
        else{
            this.eficienciaAlTocar = eficienciaAlTocar;
        }
        this.tocandoInstrumento = tocandoInstrumento;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public int getAniosExperiencia(){
        return aniosExperiencia;
    }
    
    public double getEficienciaAlTocar(){
        return eficienciaAlTocar;
    }
    
    public boolean isTocandoInstrumento(){
        return tocandoInstrumento;
    }
    
    public void TocarInstrumento(InstrumentoDeViento instrumentoDeViento, Acorde acorde){
        instrumentoDeViento.tocar(acorde);
        this.tocandoInstrumento = true;
    }
    
    public void DejarInstrumento(InstrumentoDeViento instrumentoDeViento){
        instrumentoDeViento.dejar();
        this.tocandoInstrumento = false;
    }
    
    public void AfinarInstrumento (InstrumentoDeViento instrumentoDeViento){
        instrumentoDeViento.afinar();
    }
}
