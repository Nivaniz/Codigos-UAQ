package empleadoprueba;
import java.util.Scanner;

public class Empleadoprueba {

    public static void main(String[] args) {
        
        Scanner entradadato = new Scanner(System.in);
       
        //Guardo los valores de empleados a registrar
        Empleado empleado1=new Empleado ("Carlos", "Alba",21 , 1800); //Nombre, Apellido, Edad, Salario
        Empleado empleado2=new Empleado ("", "López", 45 ,2500);
        
        //Mostramos datos generales del empleado 1 y 2 antes de cambiarlos
        System.out.println(empleado1.MostrarInformacion("contraseña")); //por medio de get y palabra obtener variables privadas
        System.out.println("-----------------------------------");
        System.out.println(empleado2.MostrarInformacion("contraseña")); //por medio de get y palabra obtener variables privadas
 
        //Si quisieramos modificar la edad del empleado1 aunque sea privado
        System.out.println("Se ha modificado la edad de empleado1");
        empleado1.setedad(43);
 
        //Mostramos la edad modificada
        System.out.println("La nueva edad del empleado1 es "+empleado1.getedad());
 
        //Si quisieramos modificar el nombre del empleado2 pero pidiendolo
        String respuesta;
        System.out.println("¿Cuál es el nombre correcto?: ");
        respuesta = entradadato.next();
        empleado2.setnombre(respuesta);
 
        //Mostramos el nombre
        System.out.println("El nuevo nombre del empleado2 es: "+empleado2.getnombre());
        
        //Mostramos toda la info ya cambiada la edad de empleado 1 y nombre de empleado 2
        System.out.println(empleado1.MostrarInformacion("contraseña")); 
        System.out.println("-----------------------------------");
        System.out.println(empleado2.MostrarInformacion("contraseña")); 
        
    }
    
}
