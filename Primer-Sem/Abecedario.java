package abecedario;
public class Abecedario {
    public static void main(String[] args) {
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i < abecedario.length(); i++) {
            for (int j = abecedario.length()-1 - i; j >= 0; j--) System.out.print(abecedario.charAt(j)); //FOR INVERSO
            //CHAR AT ES UN METODO 
            //J ES EL INDÍCE
            //VAYA DEL 0 HASTA EL TAMAÑO DE LA LISTA Y VAYA AUMENTANDO PARA EL PRIMER FOR
            System.out.println("");
        }
    }
}
