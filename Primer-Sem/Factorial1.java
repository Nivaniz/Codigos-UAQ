package factorial1;
import java.util.Scanner;

public class Factorial1 {

    public static void main(String[] args) {
        int n2, n1, result1, result2; //
        Scanner scanner = new Scanner(System.in);

        // El ciclo do while se ejecuta al menos una vez,
        // y se ejecutará siempre que la condición sea true
        do {
            System.out.print("Introduce un número mayor a 0: ");
            n1 = scanner.nextInt();
            System.out.print("Introduce un número mayor a 0: ");
            n2 = scanner.nextInt();
        } while (n2 < 0 && n1 < 0);

        result1 = factorial(n1);
        result2 = factorial(n2);

        System.out.println("*****************************");
        System.out.printf("Factorial %d = %d \nFactorial %d = %d \nSuma de factoriales = %d", n1, result1, n2, result2, result1+result2);
    }

   // static method
   private static int factorial(int n) {
       int fact = 0;
       for (int i = 0; i <= n; i++) {
           fact = 1;
           for (int j = 1; j <=i; j++) {
               fact *= j;
           }// for j

       }// for i

       return fact;
    }
    
}
