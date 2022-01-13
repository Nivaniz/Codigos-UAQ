 //PROGRAMA QUE LEA UN CARÁCTER POR TECLADO Y COMPROBAR SI ES DÍGITO 
package caracterdigitodos;
import java.io.IOException;
public class Caracterdigitodos {
  
    public static void main(String[] args) throws IOException {
        //variable
        char numero;
        
        //Solicitar introduzca caracter
        System.out.print("Introducir un solo carácter:  ");
        numero=(char)System.in.read(); //lee un carácter
       
        if(numero>= '0' && numero<='9')
             System.out.println("Es un numero");
        else
            System.out.println("No es un número"); 
    }
}
