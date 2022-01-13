//PROGRAMA QUE LEA UN CARÁCTER POR TECLADO Y COMPROBARA SI ES MAYÚSCULA (2 PROGRAMAS)
//POR DOS FORMAS
package caractermayuscula;

import java.io.IOException;
import java.util.Scanner;

public class CaracterMayuscula {

    
    public static void main(String[] args) throws IOException {
         //Declaración de la variable
        char caracter;
        
        //Solito ingreso de mi caractes
        System.out.print("Introducir un solo carácter:   ");
        caracter=(char)System.in.read(); //lee solo un carácter
        
        /*
        //proceso
        if(Character.isUpperCase(caracter)) //Utilizamos el método is uppercase de la clase Character
        {
        System.out.println("Es una MAYUSCULA  ");
        
        }else {
            System.out.println("NO ES MAYÚSCULA   ");
            }
        */
        
        
        if(caracter>='A' && caracter<='Z')
            System.out.println("Es una MAYUSCULA");
        else
            System.out.println("NO es mayuscula");
        
    }
    
}
