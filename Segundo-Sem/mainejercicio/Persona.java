package mainejercicio;

public class Persona {
    
    String nombre;
    String apellidos;
    
    public Persona(String nombre, String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;        
    }
    
    //gets y sets
    public String getNombre (){
        return nombre;
    }
    
    //gets y sets
    public String getApellidos (){
        return apellidos;
    }
    
}
