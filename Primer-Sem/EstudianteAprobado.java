//Crea un programa que dibuje por pantalla 
//si un estudiante ha aprobado o no en matem áticas
package estudianteaprobado;
import java.util.Scanner;

public class EstudianteAprobado {

    public static void main(String[] args) {
       
        //variables
        Scanner calificacion = new Scanner(System.in);//OBJETO
        String nombre="";
        double examen , trabajogrupo , notafinal, notaexamen, notatrabajogrupo;
        boolean asistencia=true;
     
        //introducción de valores
        System.out.println("*************************************************");
        System.out.println("Bienvenido alumno al sistema de calificaciones");
        System.out.println("*************************************************");
        System.out.println("");
        
        System.out.println("¿Cuál es tu nombre?");
        nombre=calificacion.nextLine();
        System.out.println("");
        
        System.out.println("¿Cuál fue la nota del examen del alumno (0-10)?");
        examen=calificacion.nextInt();
        System.out.println("");
        
        System.out.println("¿Cuál es la calificación del trabajo en grupo del alumno (0-10)");
        trabajogrupo=calificacion.nextInt();
        System.out.println("");
        
        System.out.println("La asistencia cumple el mínimo (true or false))");
        asistencia=calificacion.nextBoolean();
        System.out.println("");

        //porcentaje del examen en relación nota+60%
        notaexamen=examen*60/10;
        //porcentaje del trabajogrupal en relación nota+40%
        notatrabajogrupo=trabajogrupo*40/10;
        
        //media DEL PORCENTAJE
	notafinal=notaexamen+notatrabajogrupo;
        
        //PARA CUANDO LA NOTA FINAL DEL PORCENTAJE SEA MAYOR A 5 CON Y SIN EL MÍNIMO DE ASISTENCIA
         if (notafinal>= 50){
                 if (asistencia){
                 System.out.println("El alumno: "+nombre+" aprobo matemáticas con el mínimo de asistencias y con media de: "+notafinal);
                 }//if de asistencia
                 else{
                     System.out.println("El alumno: "+nombre+" tiene nota finalapropiada de: "+notafinal+ " más no se cumple con el mínimo de asistencia" );         
                 }         
       } 
         //PARA CUANDO LA NOTA FINAL DEL PORCENTAJE SEA MENOR A 5 CON Y SIN EL MÍNIMO DE ASISTENCIA
         if (notafinal<=49){
                 if (asistencia){
                     System.out.println("El alumno: "+nombre+" tiene nota final no aprobatoria de "+notafinal+ " más cumple con el mínimo de asistencia" );
                 }                 else{
                     System.out.println("El alumno: "+nombre+" tiene nota final no aprobatoria de: "+notafinal+ " y no cumple con el mínimo de asistencia");
                 }//if de asistencia
         
       } 
    }
}
