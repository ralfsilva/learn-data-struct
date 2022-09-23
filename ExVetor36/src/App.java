import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] vectorA = new int[11];

        Scanner sc = new Scanner(System.in);

        System.out.println("Potências Base 2 no vectorA[i]: ");

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = sc.nextInt();
            vectorA[i] = (int) Math.pow(2, vectorA[i]);
            
        }

        for (int i = 0; i < vectorA.length; i++) {
            System.out.printf("[%d]: 2^%d = %d%n", i, i, vectorA[i]);

        }

        sc.close();
    }
}
