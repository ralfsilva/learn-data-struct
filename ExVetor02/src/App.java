import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        int[] A = new int[8];
        int[] B = new int[8];

        Random rand = new Random();

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(10);
            B[i] = A[i] * 2;
        }

        for (int AOutput : A){
            System.out.println("A: " + AOutput);
        }

        for (int BOutput : B) {
            System.out.println("B: " + BOutput);
        }

        

    }
}
