package multiplosden;
import java.util.Scanner;

public class MultiplosdeN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;

        // CONDICIONES:
        //Lectura de dos números enteros N Y M
        //N y M deben ser positivos
        //N debe ser menor que M
        
        //CONDICIONALES
        do {
            System.out.print("Introduce un número: ");
            N = sc.nextInt(); //recibe el valor de N
            if(N<=0){
                System.out.println("Debe introducir un número positivo"); //Por si no lo pone positivo o es cero
            }
        }while(N<=0); //cuando sea mayor a 0 hace
        do {
            System.out.print("Introduce otro número mayor que " + N + ": ");   // Pide el número mayor a N         
            M = sc.nextInt();
            if(M<=0){ //Si M es menor que 0 pide que meta uno correcto
                System.out.println("Debe introducir un número positivo");
            }else if(N>=M){ //Si es N mayor o igual que M entonces pide que debe ser mayor a N
                System.out.println("Debe introducir un número mayor que " + N);
            }
        }while(M<=0 || N >=M); //Mientras M sea menor que 0 y N igual que M

        //Mostrar los múltiplos de N desde 1 hasta M
        System.out.println("\nMúltiplos de  " + N + " desde 1 hasta " + M + " : ");
        for (int i = 1; i <= M; i++) { //Va de 1 aumentando 
            if (i % N == 0) {
                System.out.println(i);
            }
        }
    }
}
 
