public class App {
    public static void main(String[] args) throws Exception {
        
        int[] vectorA = new int[20];
        int[] vectorB = new int[vectorA.length];

        int posPar = 0;

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) Math.round(Math.random() * 20);
        
            if (vectorA[i] % 2 == 0){
                vectorB[posPar] = vectorA[i];
                posPar++;
            }
        }

        for (int i = 0; i < vectorA.length; i++) {
            if (vectorA[i] % 2 != 0){
                vectorB[posPar] = vectorA[i];
                posPar++;
            }
        }

        // output
        for (int i = 0; i < vectorA.length; i++) {
            System.out.printf("[%d] = Vector A: %d, Vector B: %d %n", i, vectorA[i], vectorB[i]);
        }

    }
}
