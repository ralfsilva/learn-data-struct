import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        int[] A = new int[15];
        int[] B = new int[15]; // O tipo pode ser double aqui, pois não é preciso ser int

        Random rand = new Random();

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(50);
            B[i] = (int) Math.sqrt(A[i]);
        }

        for (int AOutput : A) {
            System.out.println("A: " + AOutput);
        }

        for (int BOutput : B) {
            System.out.println("B SQRT: " + BOutput);
        }


    }
}
