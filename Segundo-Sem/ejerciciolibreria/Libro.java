package ejerciciolibreria;

public class Libro { 
    //NOMBRE / TÍTULO / ESTADO 
    
    //Atributos
    private String nombre;
    private String titulo;
    private boolean estado;
    
    
    //Constructor
    public Libro (String nombre, String titulo, boolean estado){
        this.nombre=nombre;
        this.titulo=titulo;
        this.estado=estado;
    }
    
    //gets y sets
    public boolean getEstado (){
        return estado;
    }
    
    //gets y sets
    public String getTitulo (){
        return titulo;
    }
    
    //Método (mostrar datos)
    public String datos(){ //retornar datos
        return "nombre: "+nombre+"\n Título: "+titulo+"\n Estado: "+estado;
    }
}
