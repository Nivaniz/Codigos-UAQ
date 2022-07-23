
package examenmain;

public class ExamenMain {

 
    public static void main(String[] args) {
        //CATALOGO DE PERRERA
        
         Empleados empleado1=new Empleados ("CToño", "Alba", 57 , 5800); //Nombre, Apellido, Edad, Salario (OBJETO 1)
         Empleados empleado2=new Empleados ("Karla", "López", 45 ,2500); //(OBJETO 2)
         Empleados empleado3=new Empleados ("Omar", "Garcia",21 , 1800); //(OBJETO 3)
         Hospital perro1=new Hospital("Godolfredo","Chihuahua",8, 100); //(OBJETO 4)
         Hospital perro2=new Hospital("Hermenejildo","PitBull",5, 87); //(OBJETO 5)

        //Mostramos datos generales del empleado 1,2,3
        System.out.println(empleado1.MostrarInformacion("contraseña")); //por medio de get y palabra obtener variables privadas
        System.out.println("Mi raza favorita son los chihuahuas"); //valor público
        System.out.println("-----------------------------------");
        System.out.println(empleado2.MostrarInformacion("contraseña")); //por medio de get y palabra obtener variables privadas
        System.out.println("Mi raza favorita son los Pitbulls"); //valor público
        System.out.println("-----------------------------------");
        System.out.println(empleado3.MostrarInformacion("contraseña")); //por medio de get y palabra obtener variables privadas
        System.out.println("Mi raza favorita son los Gran Danés"); //valor público
        
        System.out.println("********************************************************+");
        System.out.println("Perros Existentes en la Perrera");
        System.out.println(perro1.MostrarInformacion("perritosbonitos")); //por medio de get y palabra obtener variables privadas
        System.out.println("Mi comida favorita es el pollo"); //valor público
        System.out.println("-----------------------------------");
        System.out.println(perro2.MostrarInformacion("perritosbonitos")); //por medio de get y palabra obtener variables privadas
         System.out.println("Tengo Rabia"); //valor público
    }
    
}
