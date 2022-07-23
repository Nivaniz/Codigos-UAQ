package arraylist;

import java.util.*;
        
public class ArrayLists {
   
    public static void main(String[] args) {
       ArrayList<String> arregloDinamico= new ArrayList <String>();
       
       //AGREGAR
        arregloDinamico.add("H");
        System.out.println(arregloDinamico);
         arregloDinamico.add("O");
         System.out.println(arregloDinamico);
         arregloDinamico.add("L");
         System.out.println(arregloDinamico);
         arregloDinamico.add("A");
         System.out.println(arregloDinamico);
         
        //REMOVER
        arregloDinamico.remove("L");
        System.out.println(arregloDinamico);
        arregloDinamico.remove(1);
        System.out.println(arregloDinamico);
       
        //MOSTRAR EL TAMAÑO DEL ARREGLO
        System.out.println("El tamaño del arreglo es:");
        System.out.println(arregloDinamico.size());

        //BUSQUEDA DE UNA VARIABLE
        /*
        La primera línea es para saber que dato tengo en la posición 0 e imprimirlo
        */
        System.out.println("El dato que tengo en 0 es:");
        System.out.println(arregloDinamico.get(0));
        System.out.println(arregloDinamico);
        
         //IDENTIFICAR LA POSICIÓN DE UNA VARIABLE
         System.out.println("H SE ENCUENTRA EN LA POSICIÓN: ");
        System.out.println(arregloDinamico.lastIndexOf("H"));
        
        // VACIAR EL ARREGLO
         arregloDinamico.clear();
         System.out.println(arregloDinamico);
       
    }
    
}

    

