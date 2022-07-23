package mainejercicio;

public class Alumnos extends Persona{
    int expediente;
    float promedio;
    int semestre;
    
    //Constructor
    public Alumnos (int expediente, float promedio, int semestre, String nombre, String apellidos){
        super(nombre, apellidos);
        this.expediente=expediente;
        this.promedio=promedio;
        this.semestre=semestre;
    }
    
    //gets y sets
    public float getPromedio (){
        return promedio;
    }
    
    //Método (mostrar datos)
    public String mostrarDatosAlumnos(){
        return "Nombre: "+nombre+ "Apellido: "+apellidos+"Expediente: "+expediente+"\n promedio: "+promedio+"\n semestre: "+semestre;
    }
}
