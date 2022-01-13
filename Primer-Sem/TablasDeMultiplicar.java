//Crea un programa que dibuje en la pantalla las tablas de multiplicar del 1 al 10
package tablas.de.multiplicar;
import java.util.Scanner;

public class TablasDeMultiplicar {

    public static void main(String[] args) {
        Scanner obtenerNumero = new Scanner(System.in);
        int numero,i,j;
 
        System.out.print("indica la tabla de multiplicar: ");
        numero = obtenerNumero.nextInt();
 
        for(i = 1; i<=numero; i++)
        {
            for(j = 1; j <= 12; j++)
            {
                System.out.println(i + " X " + j + " = " + i*j);
            }
            System.out.println();
        }
    } 
}
