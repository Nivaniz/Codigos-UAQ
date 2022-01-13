
package ejercicios;
import java.util.Scanner;

public class Ejercicios {
 
 
    public static void main(String[] args) {
        
        Scanner tecla = new Scanner (System.in);
        int numero ,inicial = 1 ,suma = 0,producto = 1;

        System.out.print("Introduce un numero: ");
        numero = tecla.nextInt();

        while(inicial < numero)
        {
            if(inicial%2==0)
            {
                suma = suma + inicial;
            }
            else
            {
                producto = producto * inicial;
            }
            inicial++;
        }
        System.out.println("\n El producto de los numeros impares es: "+producto);
        
 } // fin de main
 } // fin de la clase Imprimir

   

 
