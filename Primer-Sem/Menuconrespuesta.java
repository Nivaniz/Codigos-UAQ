
package menuconrespuesta;

import java.util.*;

public class Menuconrespuesta {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String respuesta = ""; //Respuesta libre
        
        do{
            
            int opt=0;
            
            System.out.println("¿Qué opción necesitas?;");
            opt =scan.nextInt();
            
            switch(opt){
                case 1:
                    System.out.println("Caso 1");
                    break;
                case 2:
                    System.out.println("Caso 2");
                    break;
                case 3:
                    System.out.println("Caso 3");
                    break;
                case 4:
                    System.out.println("Caso 4");
                    break;
                case 5:
                    System.out.println("Caso 5");
                    break;
                case 6:
                    System.out.println("Caso 6");
                    break;
                default:
                    System.out.println("Default");
                    
            }
           
        }while (respuesta!="No");
        
    }
    
}
