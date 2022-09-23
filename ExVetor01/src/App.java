import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] A = new int[5];
        int[] B = new int[5];

        Random rand = new Random();

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(10);
            B[i] = A[i];
        }

        for (int transfer : A){
            System.out.println("A: " + transfer);
        }

        for (int transferred : B) {
            System.out.println("B: " + transferred);
        }

    }
}