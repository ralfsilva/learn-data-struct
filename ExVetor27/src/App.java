public class App {
    public static void main(String[] args) throws Exception {
        
        int[] vectorA = new int[10];
        int[] vectorB = new int[10];
     

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) Math.round(Math.random() * 20);
            
            if (vectorA[i] < 7) {
                vectorB[i] = 'a';
            } else if (vectorA[i] == 7) {
                vectorB[i] = 'b';
            } else if (vectorA[i] > 7 && vectorA[i] < 10) {
                vectorB[i] = 'c';
            } else if (vectorA[i] == 10) {
                vectorB[i] = 'd';
            } else if (vectorA[i] > 10) {
                vectorB[i] = 'e';
            }
        }

        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("Vector A: " + vectorA[i] + ", Vector B: " + vectorB[i]);
        }

    }
}
