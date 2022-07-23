package ejerciciomarzo22;

public class Persona {
 
    private final String nip; 
    private final float peso; 
    String nombre;
    String apellidos;
    float altura;
    String correoElectronico;
    
    public String getnip(){
        return this.nip;
    }
    
    public float getpeso(){
        return this.peso;
    }
    
    //OBJETO PARA PASAR CON CLASE PRINCIPAL
     public Persona(String nombre, String apellidos, float altura, String correoElectronico, String nip, float peso){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.altura=altura;
        this.correoElectronico=correoElectronico;
        this.nip=nip;
        this.peso=peso;
    
    }
   
     //METODOS
    public void cambioNip(){
       
    }
    
}
