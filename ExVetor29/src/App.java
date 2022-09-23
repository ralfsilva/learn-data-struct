import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] vectorA = new int[10];
        int[] vectorB = new int[vectorA.length];
        int[] vectorC = new int[vectorA.length+vectorB.length];

        Random rand = new Random();

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = rand.nextInt(10);
            vectorB[i] = rand.nextInt(10);
        }

        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i];
            vectorC[vectorA.length+i] = vectorB[i];
        }

        // output
        for (int i = 0; i < vectorA.length; i++) {
            System.out.printf("[%d] = Vector A: %d, Vector B: %d, Vector C: %d%n", i+1, vectorA[i], vectorB[i], vectorC[i]);
        }

        for (int i = vectorA.length; i < vectorC.length; i++) {
            System.out.printf("[%d] = Vector C: %d%n", i+1, vectorC[i]);
        }

    }
}
