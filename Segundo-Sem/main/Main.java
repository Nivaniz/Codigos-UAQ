/*
Realizar un programa donde pueda ingresar un conjunto de profesores con los atributos de
clave, nombre, grado académico, año de ingreso, cantidad de horas frente a grupo, 
cantidad de horas administrativas. Este debe permitir ingresar una cantidad de profesores e
imprimir el maestro que tiene más tiempo laborando.
 */
package main;

import java.util.Scanner;

public class Main {
        
        public static int laborando (Profesor directivo[]){ //MÉTODO QUE NOS VA AYUDAR PARA COMPARAR NUESTO SALARIO
        float ingresoYear;
        int indice=0;
        
        ingresoYear=directivo[0].getingresoYear(); //SE TOMA EL MAYOR Y SE VA ALMACENANDO
        for( int i=1; i<directivo.length; i++){
            if(directivo[i].getingresoYear()>ingresoYear){ //COMPARANDO QUE ES MAYOR QUE EL ANTERIOR
                ingresoYear=directivo[i].getingresoYear(); //CHECA CUAL ES MAYOR Y LA ALMACENA
                indice=i;
            }
        }
        return indice;
    }
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
      int clave;
      String nombre;
      String grado;
      int ingresoYear;
      int horasTrabajadas;
      int horasAdministrativas;
      int numeroProfesores;
      int IngresoYear;
       
        System.out.println("Digita el número de profesores que vas a ingresar: ");
        numeroProfesores = entrada.nextInt();
        
        Profesor directivo[]= new Profesor [numeroProfesores];
        
        for(int i=0; i<directivo.length;i++){  //Para que se repita el que nos pida número de profesores
            entrada.nextLine();
            System.out.println("Ingresa la información del profesor: "+(i+1)+";"); //ingresa la info del profesor 1,2,3,4
            System.out.println("Ingresa la clave del profesor: ");
            clave = entrada.nextInt();
            
            System.out.println("Ingresa el nombre del profesor: ");
            nombre= entrada.nextLine();//pq es string
            entrada.nextLine();
            
            System.out.println("Ingresa el grado del profesor: ");
            grado = entrada.nextLine();
            
            System.out.println("Ingresa el año de ingreso del profesor: ");
            ingresoYear =entrada.nextInt();
            
            System.out.println("Ingresa las horas trabajadas: ");
            horasTrabajadas =entrada.nextInt();
            
            System.out.println("Ingresa las horas administrativas: ");
            horasAdministrativas =entrada.nextInt();
           
            directivo[i] = new Profesor (clave, nombre, grado, ingresoYear, horasTrabajadas, horasAdministrativas);
        }
        
            IngresoYear = laborando (directivo);
            System.out.println("\n El profesor con el mayor tiempo laborado es: ");
            System.out.println(directivo[IngresoYear].mostrarDatos());
         
    }
    
}
