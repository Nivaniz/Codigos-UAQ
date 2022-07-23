package vehiculoprueba;

public class Vehiculoprueba {
 
    public static void main(String[] args) {
        
       notprincipal v1 = new notprincipal();
       v1.setcolor("verde"); //se puede cambiar aunque tenga valores diferentes la variable
       
        System.out.println(v1.getColor()); //aunque sea privado puedo tomarlo y modificarlo
        System.out.println(v1.MostrarInformacion("contraseña")); //por medio de get y palabra obtener variables privadas
                     
    }
    
}
