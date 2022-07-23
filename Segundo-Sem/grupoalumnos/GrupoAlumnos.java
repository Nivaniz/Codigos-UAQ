package grupoalumnos;

import java.util.Scanner;

public class GrupoAlumnos {
    
    public static int promedioAlto(Alumnos directivo[]){ //MÉTODO QUE NOS VA AYUDAR PARA COMPARAR 
        float promedio;
        int indice=0;
        
        promedio=directivo[0].getpromedio(); //SE TOMA EL MAYOR Y SE VA ALMACENANDO
        for( int i=1; i<directivo.length; i++){
            if(directivo[i].getpromedio()>promedio){ //COMPARANDO QUE ES MAYOR QUE EL ANTERIOR
                promedio=directivo[i].getpromedio(); //CHECA CUAL ES MAYOR Y LA ALMACENA
                indice=i;
            }
        }
        return indice;
    }
    
    public static int promedioBajo(Alumnos directivo[]){
        float promedio1;
        int indice=0;
        
        promedio1=directivo[0].getpromedio(); //SE TOMA EL MAYOR Y SE VA ALMACENANDO
        for( int i=1; i<directivo.length; i++){
            if(directivo[i].getpromedio()<promedio1){ //COMPARANDO QUE ES MAYOR QUE EL ANTERIOR
                promedio1=directivo[i].getpromedio(); //CHECA CUAL ES MAYOR Y LA ALMACENA
                indice=i;
            }
        }
        return indice;
    }
    
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
         
       float expediente;
       String nombre;
       int semestre;
       String carrera;
       float promedio;
       
       int numeroAlumnos;
       int PromedioAlto;
       int PromedioBajo;
       
        System.out.println("Digita el número de alumnos que vas a ingresar: ");
        numeroAlumnos = entrada.nextInt();
        
        Alumnos directivo[]= new Alumnos [numeroAlumnos];
        
        for(int i=0; i<directivo.length;i++){  //Para que se repita el que nos pida número de alumnos
              
            System.out.println("Ingresa la información del Alumno: "+(i+1)+";"); //ingresa la info del alumno 1,2,3,4
            
            System.out.println("Ingresa el expediente del Alumno: ");
            expediente = entrada.nextFloat();
            entrada.nextLine();
            System.out.println("Ingresa el nombre del Alumno: ");
            nombre = entrada.nextLine();
           
            System.out.println("Ingresa el semestre del Alumno: ");
            semestre = entrada.nextInt();
            
            entrada.nextLine();
            System.out.println("Ingresa la carrera del Alumno: ");
            carrera = entrada.nextLine();
            
            System.out.println("Ingresa el promedio del Alumno: ");
            promedio = entrada.nextFloat();
            
            directivo[i] = new Alumnos (expediente, nombre, semestre, carrera, promedio);
        }
        
        PromedioAlto = promedioAlto (directivo);
            System.out.println("\n El Alumno con el promedio más alto es: ");
            System.out.println(directivo[PromedioAlto].mostrarDatos());
        PromedioBajo = promedioBajo (directivo);
            System.out.println("\n El alumno con el promedio más bajo es: ");
            System.out.println(directivo[PromedioBajo].mostrarDatos());
    }
    
}
