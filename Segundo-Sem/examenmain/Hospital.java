package examenmain;

public class Hospital {
    //LA CLASE HOSPITAL CONTIENE LA INFORMACIÓN DE CADA PERRO
    
    //  ATRIBUTOS
    private String nombreP; //nombre del perro
    private String raza; //raza del perro
    private int edad; //edad del perro
    private double vida; //vida del perro
    String comidafav="Mi comida favorita es el pollo";
    int duenos=4;
    String enfermedades ="Rabia";
    
    //VARIABLES PUBLICAS SOLO PARA LOS MÉTODOS
    int vidaTotal=100, vidaActual=vidaTotal, fuerza=100, stam=100;
    boolean sonido;
         
    //METODOS
    public void Curar(){
        while (vidaActual<0){
            this.fuerza=2;
            this.stam=50;
            System.out.println("ALERTA: PERRITO NECESITA AYUDA");
        }
    }
      
    public void Ladrar(){
        if (sonido=true){
            this.stam=this.stam-10;
        }
    }
    
    public void Caminar(){
        
    }
 
    public void Comer(){
        int vida;
        vida = this.fuerza-(int)Math.round(this.fuerza*this.stam);
    }
    
    
    
       //  MÉTODOS PÚBLICOS GET Y SET
    
    //Para devolver el nombre 
    public String getnombreP(){
        return nombreP;
    }
    
    //Para modificiar el nombre 
    public void setnombreP(String nombreP){
        this.nombreP = nombreP;
    }
    
    //Para devolver la edad 
    public int getedad(){
        return edad;
    }
    
    //Para modificiar la edad 
    public void setedad(int edad){
        this.edad = edad;
    }
    
    //Para devolver la vida
    public double getvida(){
        return vida;
    }
    
    //Para modificiar la vida
     public void setvida(double salario){
        this.vida = vida;
    }
     
    //Para devolver la raza
    public String getraza(){
        return raza;
    }
    
    //Para modificiar la raza
    public void setraza(String raza){
        this.raza = raza;
    }
    
    //OBJETO PARA PASAR CON CLASE PRINCIPAL
     public Hospital(String nombreP, String raza, int edad, double vida){
        this.nombreP=nombreP;
        this.raza=raza;
        this.edad=edad;
        this.vida=vida;
    }
     
     
     //PARA MOSTRAR TODA LA INFO DE PERRO
      public String MostrarInformacion (String psw){ //si nuestro string password es igual a la contraseña va regresar
        if (psw == "perritosbonitos"){
            return "Nombre: "+this.getnombreP()+
                    "\n Raza: "+this.getraza()+
                    "\n Edad: "+ this.getedad()+
                    "\n Vida: "+ this.getvida(); //va regresar
        }
                else return "Incorrecto";
                }
      
}
