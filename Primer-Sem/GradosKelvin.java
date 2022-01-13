package gradoskelvin;
import java.util.Scanner;

public class GradosKelvin {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double gradoC, gradoK;
        String bandera= "S"; //PARA LAS RESPUESTAS Y REPETICIÓN
        
        do{
            
            String opt;
            System.out.println("¿Quiéres ejecutar el programa? (S/N?); ");
            opt =scan.next();
            
            switch(opt){
                case "S":
                    System.out.println("USTED PRESIONO SI");
                    System.out.println("Introduce los grados centígrados");
                    gradoC=scan.nextDouble();
                    gradoK = gradoC+ 273;
                    System.out.println(gradoC+"°C="+gradoK+"°K");
                    break;
                case "N": //POR SI NO SE QUIERE EJECUTAR EL CÓDIGO
                    System.out.println("USTED PRESIONO NO");
                    System.out.println("VUELVA PRONTO!");
                    break;
                default:
                    System.out.println("Opción no valida");   
            }
           
        System.out.println("Necesitas repetir? (S/N?); ");
            bandera = scan.next();
        }while("S".equals(bandera)); //COMPARACIÓN DE STRINGS
    }
}
