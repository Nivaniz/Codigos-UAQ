
package claseuno;
import java.util.*;

public class Claseuno {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int D, L, AUXILIAR;
        System.out.print("Introduzca el valor de D:");
        D=sc.nextInt();
        System.out.print("Introduzca el valor de L: ");
        L=sc.nextInt();
        System.out.println("Valores iniciales de D="+D+"L="+L);
       /* AUXILIAR=D;
        D=L;
        L=AUXILIAR; FORMA UNO*/
       D=D+L;
       L=D-L;
       D=D-L;
         System.out.println("Valores intercambiados de D="+D+"L="+L);
         
         // A=A+B FORMA DOS
         // B=A-B
         // A=A-B
    }
    
}
