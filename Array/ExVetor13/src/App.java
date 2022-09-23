import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] A = new int[10];

        Random rand = new Random();

        int j = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(50);
            if (A[i] % 5 == 0){
                j += A[i];
            }
        }

        System.out.println("Sum: " + j);

    }
}
