package ejerciciomarzo22;

public class EjercicioMarzo22 {

    public static void main(String[] args) {
         
         Alumnos alumno1 = new Alumnos("Jesus Alejandro","Avendaño Peña",178,"jesuson567@hotmail.com", "1688", 85, 256024,8 , "Diseño de Interfaces\nContabilidad financiera\nDeportes\nPrincipios de Electrónica y Circuitos Lógicos\nAlgebra Lineal\nDesarrollo Humano\nProgramación orientada a objetos ",2 );
         Alumnos alumno2 = new Alumnos("Nirvana Belen","González López",169,"nivaniz2019@outlook.com", "6584", 50, 282000, 10, "Diseño de Interfaces\nContabilidad financiera\nDeportes\nPrincipios de Electrónica y Circuitos Lógicos\nAlgebra Lineal\nDesarrollo Humano\nProgramación orientada a objetos ",2 );
         Alumnos alumno3 = new Alumnos("Juan Pedro","Pineda Rivera",163,"jpineda@gmail.com.com", "8545", 75, 276548,9, "Diseño de Interfaces\nContabilidad financiera\nDeportes\nPrincipios de Electrónica y Circuitos Lógicos\nAlgebra Lineal\nDesarrollo Humano\nProgramación orientada a objetos ",2 );
         
         alumno1.mostrarDatos();
         System.out.println("-------------------------");
          alumno2.mostrarDatos();
         System.out.println("-------------------------");
          alumno3.mostrarDatos();
         System.out.println("-------------------------");
         
         Profesor prof1 = new Profesor("Gaby", "Pacheco", 160, "gabypacheco5@gmail.com", "8794", 40, 257897); 
         System.out.println("--------------------------------------------------");
         prof1.mostrarDatosp();
}      
    
}
