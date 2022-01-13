//PROGRAMA QUE LEA UN CARÁCTER POR TECLADO Y COMPROBAR SI ES DÍGITO 
package caracter.dígito;
import java.io.IOException;
public class CaracterDígito {
  
    public static void main(String[] args) throws IOException {
        //variable
        char numero;
        
        //Solicitar introduzca caracter
        System.out.print("Introducir un solo carácter:  ");
        numero=(char)System.in.read(); //lee un carácter
        
        
        //Proceso uno
        if(Character.isDigit(numero))//utilizamos el método is Digit de la clase Character
            System.out.println("Es un numero");
        else
            System.out.println("No es un número");
    }
}
