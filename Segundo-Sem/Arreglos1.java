package arreglos1;
import java.util.*;

public class Arreglos1 {
   
    public static void main(String[] args) {
       ArrayList<String> arregloDinamico= new ArrayList <String>();
       
       
        arregloDinamico.add("H");
        System.out.println(arregloDinamico);
         arregloDinamico.add("O");
         System.out.println(arregloDinamico);
         arregloDinamico.add("L");
         System.out.println(arregloDinamico);
         arregloDinamico.add("A");
         System.out.println(arregloDinamico);
         arregloDinamico.add(2,"y");
         System.out.println(arregloDinamico);
         
         System.out.println(arregloDinamico.size());
         arregloDinamico.remove("y");
           System.out.println(arregloDinamico);
           arregloDinamico.remove(1);
       System.out.println(arregloDinamico);
       
       arregloDinamico.clear();
        System.out.println(arregloDinamico);
        System.out.println(arregloDinamico.isEmpty());
        
        /////////////////////////////////////
        arregloDinamico.add("H");
        arregloDinamico.add("l");
        arregloDinamico.add("H");
        System.out.println(arregloDinamico);
        
       /////////////////////////////////////
        
        System.out.println(arregloDinamico.contains("H")); //Por que está en 0
        System.out.println(arregloDinamico.get(0)); //dentro del arreglo quiero saber que dato tengo en posicion 0 e imprimirlo de una vez
        System.out.println(arregloDinamico.isEmpty());//tiene datos o esta vacio
        
        System.out.println(arregloDinamico.lastIndexOf("H")); //en que posicion se encuentra la ultima letra H
        System.out.println(arregloDinamico);
        
       
    }
    
}
