package contadornumerotres;

public class Contadornumerotres {

    public static void main(String[] args) {
        
        for (int i = 0; i <= 9; i++) { //Primer bucle para el primer espacio 00001
            for (int j = 0; j <= 9; j++) { //Segundo bucle para el segundo espacio 00010
                for (int k = 0; k <= 9; k++) { //Tercer bucle para el tercer espacio 00100
                    for (int l = 0; l <= 9; l++) { //Cuarto bucle para el cuarto espacio 01000
                        for (int m = 0; m <= 9; m++) { //Quinto bucle para el quinto espacio 100000
                             System.out.print(i != 3 ? i : "E"); //Cambiar para este bucle números iguales o similares a 3 con la letra E
                             System.out.print(j != 3 ? j : "E");
                             System.out.print(k != 3 ? k : "E");
                             System.out.print(l != 3 ? l : "E");
                             System.out.println(m != 3 ? m : "E");                                           
                        }
                    }
                }
            }
        }
    }   
}
