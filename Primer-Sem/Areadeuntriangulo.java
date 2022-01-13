
package areadeuntriangulo;
import java.util.*;

public class Areadeuntriangulo {

    public static void main(String[] args) {
           // área=raiz2(p(p-a)(p-b)(p-c) donde p=(a+b+c)/2
          // 3 longitudes con la fórmula objeto, variables double, solicitar lados,sacar p, imprimir area
          
           Scanner area = new Scanner (System.in);
           double a, b, c, p, AR;
           double p1,p2,p3,p4,p5;
           
            System.out.print("Introduce la longitud a del triángulo");
            a=area.nextDouble();
            System.out.print("Introduce la longitud b del triángulo");
            b=area.nextDouble();
            System.out.print("Introduce la longitud c del triángulo");
            c=area.nextDouble();
            
            p=(a+b+c)/2;
            System.out.println("El valor de p es:"+p);
            
            p1=p-c;
            p2=p-b;
            p3=p-a;
            p4= p1*p2*p3*p;
            p5= Math.sqrt(p4);
            System.out.println("El valor del área final es: "+p5);
    }
    
}
