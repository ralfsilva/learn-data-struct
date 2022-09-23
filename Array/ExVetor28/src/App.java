public class App {
    public static void main(String[] args) throws Exception {
        
        int[] vectorA = new int[10];
        int[] vectorB = new int[vectorA.length];

        // for (int i = 0; i < vectorA.length; i++) {
        //     vectorA[i] = (int) Math.round(Math.random() * 10);
        // }

        // first form
        // int j = 0;
        // for (int i = vectorA.length-1; i >= 0; i--) { 
        //     vectorB[i] = vectorA[j];
        //     j++;
        // }

        // second form
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) Math.round(Math.random() * 10);

            vectorB[vectorA.length - i - 1] = vectorA[i];
        }

        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("Vector A: " + vectorA[i] + ", Vector B: " + vectorB[i]);
        }

    }
}


// vectorA = 1 2 3
// vectorB = 3 2 1