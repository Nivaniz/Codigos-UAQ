
package cajero;

import javax.swing.JOptionPane;

public class Cajero {

 
    public static void main(String[] args) {
        final int saldo_inicial = 1000; //saldo de la tarjeta
        int numSerie= 1878278; //cajero
        float saldoRetirado; 
        int opcion; //cajero
        String nombreT; //nombre metido por la persona
        
        int numeroTarjeta; //numero metido por la persona
        float ingreso, retiro; //procesos del cajero
        
        nombreT = JOptionPane.showInputDialog("Digite su nombre ");
        numeroTarjeta = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de su tarjeta"));
        
        Tarjeta cliente= new Tarjeta(nombreT,1000,numeroTarjeta); //mandando llamar al constructor
        Banco nombreBanco= new Banco("BANCOQUE");
        
        
        //imprima 
        JOptionPane.showMessageDialog(null,"BIENVENIDO A "+nombreBanco.nombreB+  cliente.nombreTitular+
                " ESTA EN EL CAJERO: \n "+numSerie+
                " Su tarjeta: "+cliente.numTarjeta+ 
                "Contiene la cantidad de: "+ cliente.saldoActual); 
      
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Escriba que quiere hacer\n"+
                "1. Ingresar dinero a la cuenta\n"+
                "2. Retirar dinero de la cuenta\n"+
                "3. Salir"));
        
        switch (opcion){
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar en cuenta: "));
                cliente.saldoActual = saldo_inicial + ingreso;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+cliente.saldoActual);
                break;
            case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar en cuenta: "));
                if (retiro > saldo_inicial){
                    JOptionPane.showMessageDialog(null, "RETIRO INCORRECTO\n"+
                            "CANTIDAD MAXIMA SOBREPASADA");
                }
                else{
                cliente.saldoActual = saldo_inicial - retiro;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+cliente.saldoActual);
                }
                break;
            case 3:                
                break; //PARA SALIR DEL PROGRAMA
            default:              
                JOptionPane.showMessageDialog(null,"OPCION INCORRECTA"); break;           
        }
        
        
    }
    
}
