
package menucompuesto;

import java.util.*;

public class Menucompuesto {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int bandera=1;
        
        do{
            
            int opt=0;
            
            System.out.println("¿Que opción necesitas?");
            opt = scan.nextInt();
            
            
            switch(opt){
                case 1:
                    int arreglo[] = new int [10];
                    for(int i=0; i< arreglo.length;i++){
                        System.out.println("Ingresa el valor del espacio " + i);
                        arreglo[i]  = scan.nextInt();
                    }
                    System.out.println(Arrays.toString(arreglo));
                    break;
                case 2:
                    int edad;
                    System.out.println("Ingresa tu edad --> ");
                    edad = scan.nextInt();
                    
                    if(edad < 18){
                        System.out.println("no puedes pasar");
                    }else if (edad >= 80) {
                        System.out.println("Tienes 80 años");
                    }else{
                        System.out.println("Si puedes pasar");
                    }
                    break;
                case 3:
                    System.out.println("Caso 3");
                    break;
                case 4:
                    System.out.println("Caso 4");
                    break;
                default:
                    System.out.println("Default");
            }
            
            System.out.println("Necesitas repetir 1(SI) 2(NO) ");

            bandera = scan.nextInt();

        }while(bandera==1);
    }
    
}
