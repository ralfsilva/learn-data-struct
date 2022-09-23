public class App {
    public static void main(String[] args) throws Exception {
        
        int[] vectorA = new int[10];

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) Math.round(Math.random() * 10);
        }

        
        boolean divisivel = true;
        String div = "";

        for (int i = 0; i < vectorA.length; i++) {
            System.out.print("Divisiveis de " + vectorA[i] + ": ");

            for (int j = 1; j < vectorA[i]; j++) {

                if (vectorA[j] % j == 0){
                    System.out.print(j + ", ");
                }
            }
            System.out.println();
        }
    }
}
