public class App {
    public static void main(String[] args) throws Exception {
        
        int[] vectorA = new int[10];

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) Math.round(Math.random() * 10);
        
            if (vectorA[i] % 2 == 0) {
                System.out.println(vectorA[i] + " - Par");
            }
        }

    }
}
