/*
 CLASE triangulo y cuadrado
 abstract CalcularArea
area = lado x lado
area = (b*h)/2
 */
package figuraarea;
import java.util.Scanner;

public class FiguraArea {

    public static void main(String[] args) {
        double area;
        Triangulo t1= new Triangulo();
        Cuadrado c1= new Cuadrado();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la altura del triangulo: ");
        t1.setAltura(sc.nextDouble());
        
        System.out.println("Introduce la base del triangulo: ");
         t1.setBase(sc.nextDouble());
          
        System.out.println("Introduce el lado del cuadrado: ");
        c1.setLado(sc.nextDouble());
        
        t1.calcularArea();
        c1.calcularArea();
        
        System.out.println("El Area del Triangulo es: "+t1.getArea());
        System.out.println("El Area del Círculo es: "+c1.getArea());
    }
    
}
