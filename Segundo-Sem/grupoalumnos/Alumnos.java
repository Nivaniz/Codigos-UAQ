package grupoalumnos;

public class Alumnos {
    
    //Atributos
    private float expediente;
    private String nombre;
    private int semestre;
    private String carrera;
    private float promedio;
    
    //Constructor
    public Alumnos (float expediente, String nombre, int semestre, String carrrera, float promedio){
        this.expediente=expediente;
        this.nombre=nombre;
        this.semestre=semestre;
        this.carrera=carrera;
        this.promedio=promedio;
    }
    
    //gets y sets
    public float getpromedio (){
        return promedio;
    }
    
    //Método (mostrar datos)
    public String mostrarDatos(){
        return "Expediente: "+expediente+"\n Nombre: "+nombre+"\n Semestre: "+semestre+"\n Carrera: "+carrera+"\n Promedio:"+promedio;
    }
}
