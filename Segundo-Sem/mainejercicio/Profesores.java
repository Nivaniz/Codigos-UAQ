package mainejercicio;

public class Profesores extends Persona{
    
    String gradoAcademico;
    int claveDocente;
    float salario;  
    
    //Constructor
    public Profesores (String gradoAcademico, int claveDocente, float salario , String nombre, String apellidos){
        super(nombre, apellidos);
        this.gradoAcademico=gradoAcademico;
        this.claveDocente=claveDocente;
        this.salario=salario;
    }
    
    //gets y sets
    public float getSalario (){
        return salario;
    }
    
    //Método (mostrar datos)
    public String mostrarDatosProfesores(){
        return "Nombre: "+nombre+ "\n Apellido: "+getApellidos()+"\n Grado Académico: "+gradoAcademico+"\n Clave Docente: "+claveDocente+"\n Salario: "+salario;
    }
}
