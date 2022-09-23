import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        Random rand = new Random();

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(10);
            B[i] = rand.nextInt(10);
            C[i] = A[i] + B[i];
        }

        for (int AOutput : A) {
            System.out.println("A[i]: " + AOutput);
        }

        for (int BOutput : B) {
            System.out.println("B[i]: " + BOutput);
        }

        for (int j = 0; j < C.length; j++) {
            System.out.printf("C[%d] = %d + %d: %d", j, A[j], B[j], C[j]);
            System.out.println();
        }

    }
}