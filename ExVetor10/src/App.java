import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        int[] A = new int[10];
        int[] B = new int[10];

        Random rand = new Random();

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(20);
            B[i] = A[i] % 2;
        }

        for (int AOutPut : A){
            System.out.println("A: " + AOutPut);
        }

        for (int BOutPut : B) {
            System.out.println("B: " + BOutPut);
        }
    }
}
