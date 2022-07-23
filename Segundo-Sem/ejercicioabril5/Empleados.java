package ejercicioabril5;

public class Empleados {
    //NOMBRE CLAVE PUESTO SALARIO
    
    //Atributos
    private String nombre;
    private int clave;
    private String puesto;
    private float salario;
    
    
    //Constructor
    public Empleados (String nombre, int clave, String puesto, float salario){
        this.nombre=nombre;
        this.clave=clave;
        this.puesto=puesto;
        this.salario=salario;
    }
    
    //gets y sets
    public float getSalario (){
        return salario;
    }
    
    //Método (mostrar datos)
    public String mostrarDatos(){
        return "nombre: "+nombre+"\n clave: "+clave+"\n puesto: "+puesto+"\n salario: "+salario+"\n";
    }
    
    
    
}
