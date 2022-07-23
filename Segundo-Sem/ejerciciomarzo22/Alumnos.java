package ejerciciomarzo22;

public class Alumnos extends Persona {
    
    private final int expediente;
    private final float promedio;
    String materiasActuales;
    int semestre;
    
    public int getexpediente(){
    return this.expediente;
    }
    
    public float getpromedio(){
    return this.promedio;
}
    
    
     public Alumnos (String nombre, String apellidos, float altura, String correoElectronico, String nip, float peso, int expediente, float promedio, String materiasActuales, int semestre){
        super (nombre, apellidos, altura, correoElectronico, nip, peso);
        /* //Se declaran los nuevos de esta clase*/
        this.expediente=expediente;
        this.promedio=promedio;
        this.materiasActuales=materiasActuales;
        this.semestre=semestre;
    }
     
     public void mostrarDatos(){
         System.out.println("Nombre: "+this.nombre);
         System.out.println("Apellidos: "+this.apellidos);
         System.out.println("Altura: "+this.altura);
         System.out.println("Correo: "+this.correoElectronico);
         System.out.println("Nip: "+this.getnip()); //SE DECLARAN ESTOS YA QUE SON LOS PRIVADOS DE OTRA CLASE
         System.out.println("Peso: "+this.getpeso());
         System.out.println("Expediente: "+this.expediente);
         System.out.println("Promedio: "+this.promedio);
         System.out.println("Las materias son: "+this.materiasActuales);
         System.out.println("Semestre "+this.semestre);
}
      
       //METODOS
    public void altaMaterias(){
       
    }
    
    //METODOS
    public void bajaMaterias(){
       
    }
    
    //METODOS
    public void ConsultarCalificación(){
       
    }
    
    //METODOS
    public void solicitarKardex(){
       
    }
    
    //METODOS
    public void solicitarConstancia(){
       
    }
    
    //METODOS
    public void generarRecibo(){
       
    }
    
}
