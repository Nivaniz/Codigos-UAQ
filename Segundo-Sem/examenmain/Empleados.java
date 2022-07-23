package examenmain;

public class Empleados {
    //LA CLASE EMPLEADO CONTIENE LA INFORMACIÓN DE CADA EMPLEADO
    
    //  ATRIBUTOS
    private String nombre; //nombre del empleado
    private String apellido; //apellido del empleado
    private int edad; //edad del empleado
    private double salario; //salario del empleado
    String animal1="Mi raza favorita son los chihuahuas";
    String animal2="Mi raza favorita son los pitbulls";
    String animal3="Mi raza favorita son los gran daneses";
    
    //  MÉTODOS PÚBLICOS GET Y SET
    
    //Para devolver el nombre del empleado
    public String getnombre(){
        return nombre;
    }
    
    //Para modificiar el nombre de un empleado
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    //Para devolver la edad del empleado
    public int getedad(){
        return edad;
    }
    
    //Para modificiar la edad de un empleado
    public void setedad(int edad){
        this.edad = edad;
    }
    
    //Para devolver el salario del empleado
    public double getsalario(){
        return salario;
    }
    
    //Para modificiar el salario de un empleado
     public void setsalario(double salario){
        this.salario = salario;
    }
     
    //Para devolver el apellido del empleado
    public String getapellido(){
        return apellido;
    }
    
    //Para modificiar el apellido de un empleado
    public void setapellido(String nombre){
        this.apellido = apellido;
    }
    
    //   MÉTODOS PRIVADOS
     private boolean compruebaNombre(){ //COMPREBA EL NOMBRE CAMBIADO
        if(nombre.equals("")){
            return false;
        }
        return true;
    }
 
     
     //OBJETO PARA PASAR CON CLASE PRINCIPAL
     public Empleados(String nombre, String apellido, int edad, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
    }
     
     
     //PARA MOSTRAR TODA LA INFO DE EMPLEADO 1 Y 2
      public String MostrarInformacion (String psw){ //si nuestro string password es igual a la contraseña va regresar
        if ("contraseña".equals(psw)){
            return "Nombre: "+this.getnombre()+
                    "\n Apellido: "+this.getapellido()+
                    "\n Edad: "+ this.getedad()+
                    "\n Salario: "+ this.getsalario(); //va regresar
        }
                else return "Incorrecto";
                }
      
    //METODOS
    public void Perseguir(){
        System.out.println("SE NOS ESCAPO UN PERRO!");
        System.out.println("SHAY QUE PERSEGUIRLO!");
    }
      
    public void Agregar(){
        
    }
    
    public void Borrar(){
        
    }
 
    public void MejoraSalario(){
        
    }
    
     public void Herida(){
        //Relacionado con curar de Hospital java
        System.out.println("Vamos a curarlo!");
    }
    
}
