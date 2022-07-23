package main;

public class Profesor {
    //clave, nombre, grado académico, año de ingreso, cantidad de horas frente a grupo, cantidad de horas administrativas
      
    
    int clave;
    String nombre;
    String grado;
    private int ingresoYear;
    int horasTrabajadas;
    int horasAdministrativas;
   
    //gets y sets
    public float getingresoYear (){
        return ingresoYear;
    }
    
    
     public Profesor (int clave, String nombre, String grado, int ingresoYear, int horasTrabajadas, int horasAdministrativas){
        this.clave=clave;
        this.nombre=nombre;
        this.grado=grado;
        this.ingresoYear=ingresoYear;
        this.horasTrabajadas=horasTrabajadas;
        this.horasAdministrativas=horasAdministrativas;
    }
     
     public String mostrarDatos(){
         return "Clave: "+clave+"\n Nombre: "+nombre+"\n Grado: "+grado+"\n Año de ingreso: "+ingresoYear+"\n Horas trabajadad:"+ingresoYear+" \n Horas Administrativas: "+horasAdministrativas;               
}

}