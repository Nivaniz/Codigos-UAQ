//1° PROGRAMA QUE LEA UN NÚMERO POR TRECLADO Y CALCULE SI ES PAR O IMPAR

package paroimparporteclado;
import java.util.Scanner;


public class Paroimparporteclado {

    public static void main(String[] args) {
       Scanner condicional = new Scanner (System.in);
       
       
       //DECLARACIÓN DE MI VARIABLE
       int X;
       
       //Solicitamos ingrese el numero entero
       System.out.print("Introduce un número ENTERO:  ");
       X=condicional.nextInt();
       
       
       //PROCESO
       if(X%2==0)
           System.out.println("Es par");
       else
           System.out.println("Es impar");
    }
    
}
