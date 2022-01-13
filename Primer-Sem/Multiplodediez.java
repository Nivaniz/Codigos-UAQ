//PROGRAMA QUE LEA UN NÚMERO ENTERO Y MUESTRE SI ES MÚLTIPLO DE 10
package multiplodediez;
import java.util.Scanner;
public class Multiplodediez {
    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        //Declaración de mi variable
        int Y;
        
        //Solicitar ingrese el entero
        System.out.println("Ingresa un número entero");
        Y=numero.nextInt();
        
        //Proceso
        if(Y%10==0)
                System.out.println("Es multiplo de 10");
    }
}
