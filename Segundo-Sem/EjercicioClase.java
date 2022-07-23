package ejercicioclase;

import java.util.ArrayList;

public class EjercicioClase {
  
    public static void main(String[] args) {
        ArrayList<String> listOfNames = new ArrayList<String>();
        listOfNames.add("Carlos");
        listOfNames.add("Luis");
        listOfNames.add("Kevin");
        listOfNames.add("Emilio");
        listOfNames.add("Sandra");
            
        listOfNames.replaceAll(name -> (name.toLowerCase())); //it is used to replace all the elements from the list with the specified element.
      
                for(String name : listOfNames)
                       System.out.println("Name from list = "+ name);
                System.out.println("**********************************");
        
         
        listOfNames.add("Xanax"); 
        System.out.println("Nombre agregado (6):");
        
        listOfNames.replaceAll(name -> (name.toLowerCase())); //it is used to replace all the elements from the list with the specified element.
      
                for(String name : listOfNames)
                       System.out.println("Name from list = "+ name);
                System.out.println("**********************************");
        
                System.out.println("Emilio esta en la posición: ");
        System.out.println(listOfNames.lastIndexOf("emilio")); //en que posicion se encuentra la ultima letra H
        System.out.println(listOfNames);
        System.out.println("**********************************");
    }
    
}
