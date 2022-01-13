
package gradoscentigrados;
import java.util.*;
public class GradosCentigrados {

  
    public static void main(String[] args) {
        
  
       /*
        //Volumen=(4/3)* pi* R^3
        Scanner vol = new Scanner (System.in);
        double radio, volumen;
        
        System.out.print("Introduce el radio de la esfera");
        radio=vol.nextDouble();
        
        System.out.println("Volumen de la esfera:"+radio+ "="+ (4.0/3)*Math.PI*Math.pow(radio,3));
        
        
        /* int x;
        double rand, y, z;
        float max;
        
        rand=Math.random(); //Número aleatorio
        x=Math.abs(-123); //Número absoluto
        y=Math.round(123.567); //Número redondeado
        z=Math.pow(2,4); //Dos elevado a la 4ta potencia, Número elevado a la potencia
        max=Math.max((float) 1e10,(float)3e9);
        
        System.out.println(rand);
            System.out.println(x);
                System.out.println(y);
                    System.out.println(z);
                        System.out.println(max);
        */
        /* Scanner sc = new Scanner (System.in);
        double cat1, cat2;
        System.out.print("Introduce la longitud del primer cateto: ");
        cat1=sc.nextDouble();
        System.out.print("Introduce la longitud del segundo cateto: ");
        cat2=sc.nextDouble();
        
        System.out.println("Hipotenusa ->"+Math.sqrt(Math.pow(cat1,2) +Math.pow(cat2,2)));
        
        */
        
        //Raíz de a2+b^2= c
        Scanner sc = new Scanner (System.in);
        double gradoC, gradoF;
        System.out.println("Introduce los grados centígrados");
        gradoC=sc.nextDouble();
        
        gradoF = 32+(9*gradoC/5);
        System.out.println(gradoC+"°C="+gradoF+"°F");
        
    }   
}
