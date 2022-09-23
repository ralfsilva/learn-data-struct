public class App {
    public static void main(String[] args) throws Exception {
        
        int[] vectorA = new int[10];
        int[] vectorB = new int[10];
        int[] vectorC = new int[10];

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) Math.round(Math.random() * 10);
            vectorB[i] = (int) Math.round(Math.random() * 10);
        
            if (vectorA[i] > vectorB[i]) {
                vectorC[i] = 1;
            } else if (vectorA[i] == vectorB[i]) {
                vectorC[i] = 0;
            } else {
                vectorC[i] = -1;
            }

        }

        for (int i = 0; i < vectorA.length; i++) {
            System.out.printf("Vector A: %d, Vector B: %d, Vector C: %d%n", vectorA[i], vectorB[i], vectorC[i]);
        }

    }
}
