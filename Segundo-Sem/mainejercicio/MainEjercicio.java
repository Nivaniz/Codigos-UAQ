/*
Se podrán ingresar
un conjunto de alumnos y docentes donde mostrará el alumno con la mejor
calificación y el profesor con el salario más alto.
 */
package mainejercicio;

import java.util.Scanner;

public class MainEjercicio {
    
        public static int salarioAlto(Profesores directivo[]){ //MÉTODO QUE NOS VA AYUDAR PARA COMPARAR 
        float salario;
        int indice=0;
        
        salario=directivo[0].getSalario(); //SE TOMA EL MAYOR Y SE VA ALMACENANDO
        for( int i=1; i<directivo.length; i++){
            if(directivo[i].getSalario()>salario){ //COMPARANDO QUE ES MAYOR QUE EL ANTERIOR
                salario=directivo[i].getSalario(); //CHECA CUAL ES MAYOR Y LA ALMACENA
                indice=i;
            }
        }
        return indice;
    }
        
         public static int promedioAlto(Alumnos alumnis[]){ //MÉTODO QUE NOS VA AYUDAR PARA COMPARAR 
        float promedio;
        int indice=0;
        
        promedio=alumnis[0].getPromedio(); //SE TOMA EL MAYOR Y SE VA ALMACENANDO
        for( int i=1; i<alumnis.length; i++){
            if(alumnis[i].getPromedio()>promedio){ //COMPARANDO QUE ES MAYOR QUE EL ANTERIOR
                promedio=alumnis[i].getPromedio(); //CHECA CUAL ES MAYOR Y LA ALMACENA
                indice=i;
            }
        }
        return indice;
    }
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       //PROFESOR
       String gradoAcademico;
       int claveDocente;
       float salario;  
       
       //ALUMNO
        int expediente;
        float promedio;
        int semestre;
        
       //PERSONA
       String nombre="";
       String apellidos="";
       
       int numeroProfesores;
       int SalarioAlto;
       int PromedioAlto;
       int numeroAlumnos;
       
          //PROFESORES ARRIBA
        System.out.println("Digita el número de Profesores que vas a ingresar: ");
        numeroProfesores= entrada.nextInt();
        
        Profesores[] profe= new Profesores [numeroProfesores];
        
        for(int i=0; i<profe.length;i++){  //Para que se repita el que nos pida número de profesores
            entrada.nextLine();
            System.out.println("Ingresa la información del Profesor: "+(i+1)+";"); //ingresa la info del profesor 1,2,3,4
            System.out.println("Ingresa el Nombre del profesor: ");
            nombre = entrada.nextLine();
            System.out.println("Ingresa el Apellido del profesor: ");
            apellidos = entrada.next();
            System.out.println("Ingresa el Grado Academico del profesor: ");
            gradoAcademico = entrada.nextLine();//pq es string
            System.out.println("Ingresa la clave del Profesor: ");
            claveDocente = entrada.nextInt();
            System.out.println("Ingresa el salario del empleado: ");
            salario = entrada.nextFloat();
            
            profe[i] = new Profesores (gradoAcademico, claveDocente, salario, nombre, apellidos);
        }
        
            SalarioAlto = salarioAlto (profe);
            System.out.println("\n El Profesor con el salario más alto es: ");
            System.out.println(profe[SalarioAlto].mostrarDatosProfesores());
        
            //ALUMNOS ABAJO
            
            
            System.out.println("Digita el número de Alumnos que vas a ingresar: ");
            numeroAlumnos= entrada.nextInt();
        
            Alumnos[] alumnis = new Alumnos [numeroAlumnos];
        
          for(int i=0; i<alumnis.length;i++){  //Para que se repita el que nos pida número de alumno
            entrada.nextLine();
            System.out.println("Ingresa la información del Alumno: "+(i+1)+";"); //ingresa la info del alumno 1,2,3,4
             System.out.println("Ingresa el Nombre del Alumno: ");
            nombre = entrada.nextLine();
            System.out.println("Ingresa el Apellido del Alumno: ");
            apellidos = entrada.nextLine();
            System.out.println("Ingresa el Expediente del Alumno: ");
            expediente = entrada.nextInt();
            System.out.println("Ingresa el Promedio del Alumno: ");
            promedio = entrada.nextFloat();
            System.out.println("Ingresa el Semestre del Alumno: ");
            semestre = entrada.nextInt();
            
            alumnis[i] = new Alumnos (expediente, promedio, semestre, nombre, apellidos);
        }
        
            PromedioAlto = promedioAlto (alumnis);
            System.out.println("\n El Alumnos¿ con el salario más alto es: ");
            System.out.println(alumnis[PromedioAlto].mostrarDatosAlumnos());
        
    }
}
    

