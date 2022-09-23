public class App {
    public static void main(String[] args) throws Exception {

        int[] vectorA = new int[20];
        int[] vectorB = new int[vectorA.length];
        int[] vectorC = new int[vectorA.length];

        int posB = 0;
        int posC = 0;

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) Math.round(Math.random() * 20);

            if (vectorA[i] % 2 == 0) {
                vectorB[posB] = vectorA[i];
                posB++;
            } else {
                vectorC[posC] = vectorA[i];
                posC++;
            }
        }

        for (int i = 0; i < vectorA.length; i++) {
            System.out.printf("[%d] = Vector A: %d, Vector B: %d, Vector C: %d %n", i+1, vectorA[i], vectorB[i],
                    vectorC[i]);
        }

    }
}
