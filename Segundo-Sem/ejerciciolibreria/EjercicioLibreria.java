package ejerciciolibreria;

import java.util.Scanner;

public class EjercicioLibreria {
    
    //nombre titulo estado 
    //pedir libros (3 libros por ejemplo) y imprimir los que estan libres
    
    public static int estado (){ 
        return 0;
    }
    
    
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner (System.in); //digitaliza el scanner
       
       String nombre;
       String titulo;
       boolean estado1;
       int numeroLibros;
       int estado;
      
       
        System.out.println("Digita el número de libros que quieres: ");
        numeroLibros = entrada.nextInt();
        
        Libro[] libros= new Libro [numeroLibros]; //max de libros que se pueden meter en el array
        
        for(int i=0; i<libros.length;i++){  //Para que se repita el que nos pida número de libros
            entrada.nextLine();
            System.out.println("Ingresa la información de el libro "+(i+1)+";"); //ingresa la info del libro
            System.out.println("Ingresa el nombre del autor: ");
            nombre= entrada.nextLine();//pq es string
            System.out.println("Ingresa el título: ");
            titulo = entrada.nextLine();
            System.out.println("Ingresa el estado: ");
            estado1 = entrada.nextBoolean();
            
            libros[i] = new Libro (nombre, titulo, estado1); //nueva instancia de la clase new crea objetos, crear una variable de tipo libro
            //guardar los libros en una posicion en especifico
        }
        
        System.out.println("\n Los libros solicitados son: ");
            System.out.println("-------------------------------");         
                   
        for(int i=0; i<libros.length; i++){ //donde incias , como acabas y como avanzas
            
            if (libros[i].getEstado() == true){ //todos los métodos llevan parentesis por que son funicones
                 System.out.println(libros[i].datos());
            }
        }
         
    }
    
}
