package clasepresencial;
import java.util.Scanner;
public class ClasePresencial {
    public static void main(String[] args) {
        int numero, exp, digito;
        double binario;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Dame un número entero =>0: ");
            numero=sc.nextInt();
        }while (numero<0);
        exp=0;
        binario=0;
        while(numero!=0){
            digito=numero%2;
            binario=binario+digito*Math.pow(10, exp);
            exp++;
            numero=numero/2;
        }
        System.out.printf("Binario: %f %n",binario);
    }
}
//Saca números binarios