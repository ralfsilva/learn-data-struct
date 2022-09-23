import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        int[] A = new int[10];

        Random rand = new Random();

        int j = 0;
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(50);
            if (A[i] % 2 == 1){
                j += A[i];
                count++;
            }
        }

        double media = j / count;

        System.out.println("Total: " + j);
        System.out.println("Odd values, average: " + media);

    }
}
