//Comparar enteros utilizando instrucciones if
//Operadores relacionalles y de igualdad
package tipooperadores;
import java.util.Scanner;

public class TipoOperadores {

 
    public static void main(String[] args) {
     //crear el objeto para ovtener la entrega de comandos
     Scanner entrada = new Scanner (System.in);
     
     int numero1;
     int numero2;
     
     System.out.print("Escribe el primer entero"); //indicador
     numero1=entrada.nextInt();
     
     System.out.print("Escribe el segundo entero");//indicador
     numero2=entrada.nextInt();
     //Operadores de igualdad
     if (numero1 == numero2)
         System.out.printf("%d == %d\n", numero1, numero2);
     if (numero1 != numero2)
         System.out.printf("%d != %d\n", numero1, numero2);
     //operadores relacionales
     if (numero1 < numero2)
         System.out.printf("%d < %d\n", numero1, numero2);
     if (numero1 > numero2)
         System.out.printf("%d > %d\n", numero1, numero2);
     if (numero1 >= numero2)
         System.out.printf("%d >= %d\n", numero1, numero2);
    }
    
}
