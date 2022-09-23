import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] A = new int[10];

        Random rand = new Random();

        int ageThirtyFive = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(100);
            
            if (A[i] >= 35) {
                ageThirtyFive++;
            }
        }

        System.out.println("A quantidade de pessoas com 35 ano são: " + ageThirtyFive);

    }
}
