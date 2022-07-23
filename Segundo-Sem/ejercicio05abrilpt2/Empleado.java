package ejercicio05abrilpt2;

import java.util.Comparator;

public class Empleado {
 
  public String name;
  public String key;
  public String job;
  public double salary;
  
  public Empleado(String name, String key, String job, double salary) {
  this.name = name;
  this.key = key;
  this.job = job;
  this.salary = salary;
}
  public static Empleado Default() {
  return new Empleado("", "", "", 0.0);
}
  
  public void printData() {
  System.out.printf(  
         "Nombre: %s\nClave: %s\nPuesto: %s\nSalario: $%f\n",
          this.name, this.key, this.job, this.salary );
}
  
}

class SortBySalary implements Comparator<Empleado> {
    
  public int compare(Empleado a, Empleado b) {
   return (int) (a.salary - b.salary);
   }
}

        


