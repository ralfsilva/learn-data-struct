import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        int[] A = new int[15];
        int[] B = new int[15]; // Ctrl + Shift + Alt para duplicar linha

        Random rand = new Random();

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(20);
            B[i] = A[i] * A[i]; // Quadrado
        }

        for (int AOutput : A){
            System.out.println("A: " + AOutput);
        }

        for (int BOutput : B) {
            System.out.println("B: " + BOutput);
        }

    }
}
