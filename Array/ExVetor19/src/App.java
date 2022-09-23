import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        double[] Notas1 = new double[10];
        double[] Notas2 = new double[Notas1.length];
        double[] Results = new double[Notas1.length];

        for (int i = 0; i < Notas1.length; i++) {
            System.out.println("Entre com a nota 1 do aluno " + (i+1));
            Notas1[i] = sc.nextDouble();
            System.out.println("Entre com a nota 2 do aluno " + (i+1));
            Notas2[i] = sc.nextDouble();

            Results[i] = (Notas1[i] + Notas2[i])/2;
        }
        System.out.println();
        for (int j = 0; j < Results.length; j++) {
            if (Results[j] >= 7.0) {
                System.out.println("Média do aluno " + (j+1) + ": " + Results[j] + " - Aprovado");
            } else {
                System.out.println("Média do aluno " + (j+1) + ": " + Results[j] + " - Reprovado");
            }
            }
        


        sc.close();
    }
}
