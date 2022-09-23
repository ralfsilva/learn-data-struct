import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] vectorA = new int[10];
        int[] vectorB = new int[10];

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) Math.round(Math.random() * 10);
            
            if (vectorA[i] % 2 == 0) {
                vectorB[i] = 1;
            } else {
                vectorB[i] = 0;
            }
        }


        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("Vector A: " + vectorA[i] + ", Vector B: " + vectorB[i]);
        }

    }
}
