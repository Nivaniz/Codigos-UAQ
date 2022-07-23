package ejerciciomarzo22;

public class Profesor extends Persona{
    
    private final int claveDocente; 
    
     public int getclaveDocente(){
         return this.claveDocente;
     }
     
     public Profesor (String nombre, String apellidos, float altura, String correoElectronico, String nip, float peso, int claveDocente){
        super (nombre, apellidos, altura, correoElectronico, nip, peso);
         //Se declaran los nuevos de esta clase
        this.claveDocente=claveDocente;
    }
     

  public void mostrarDatosp(){ //no se declaran los otros por que no tiene herencia
      System.out.println("Nombre: "+this.nombre);
      System.out.println("Apellidos: "+this.apellidos);
      System.out.println("Correo: "+this.correoElectronico);
      System.out.println("Nip: "+this.getnip());
      System.out.println("Altura: "+this.altura);
      System.out.println("Peso: "+this.getpeso());
      System.out.println("Clave docente:"+this.claveDocente);
}

   //METODOS
    public void confirmasListas(){
       
    }
    
    public void subirCalificaciones(){
       
    }
    
  
    
    
}
