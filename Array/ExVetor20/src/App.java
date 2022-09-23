import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        double[] cotacaoA = new double[20];
        
        double cotacaoDolar = 0;
        double cotacao = 0;

        System.out.println("Enter with value to convert Dolar in Real: ");
        cotacaoDolar = sc.nextDouble();

        for (int i = 0; i < cotacaoA.length; i++) {
            cotacao = cotacaoDolar * (i+1);
            
            cotacaoA[i] = cotacao;
        }

        for (int i = 0; i < cotacaoA.length; i++) {
            System.out.println((i+1) + " cotação: R$ " + cotacaoA[i]);
        }

        sc.close();
    }
}
