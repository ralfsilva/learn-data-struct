import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int[] vectorA = new int[15];
        int[] vectorB = new int[vectorA.length];

        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("Entre com o valor da posição A: ");
            vectorA[i] = sc.nextInt();
        }

        for (int i = 0; i < vectorA.length; i++) {

            vectorB[i] = 1;
            for (int j = 1; j <= vectorA[i]; j++) {
                vectorB[i] *= j;
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print(vectorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print(vectorB[i] + " ");
        }

        

        sc.close();

    }
}
