//OTRA FORMA DE RESOLVER EL EJERCICIO ABRIL 5
package ejercicio05abrilpt2;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio05abrilpt2 {

    public static void main(String[] args) {
        final String escapeSignal = "N";
        ArrayList<Empleado> employees = new ArrayList<>();
        String input = "";
        Scanner scanner = new Scanner(System.in);
        
        while (!input.equals(escapeSignal)) {
           Empleado employee = Empleado.Default();
           System.out.print("Nombre del empleado: ");
           employee.name = scanner.next();
           System.out.print("Clave del empleado: ");
           employee.key = scanner.next();
           System.out.print("Puesto del empleado: ");
           employee.job = scanner.next();
           System.out.print("Salario del empleado: ");
           employee.salary = scanner.nextDouble();
           employees.add(employee);
           System.out.println("¡Empleado creado! \n¿Continuar?(Y/N)");
           input = scanner.next();
        }
        
        employees.sort(new SortBySalary());
        System.out.println("--------------------------------------------------------------");
        System.out.println("El empleado con mayor salario es");
        employees.get(employees.size()-1).printData();
    
}
}
    

