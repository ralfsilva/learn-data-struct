public class App {
    public static void main(String[] args) throws Exception {
        
        double[] vetorA = new double[10];
        int countZero = 0;
        int countOne = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);
            
            if (vetorA[i] == 0) {
                countZero++;
            }
            else {
                countOne++;
            }
        }

        //   10   - 100%
        // countz - x
        // 10x = (countz * 100)
        // x = (countz * 100) / 10

        double percentageZero = (countZero * 100) / vetorA.length;
        double percentageOne = (countOne * 100) / vetorA.length;

        System.out.println("countZero: " + countZero + " - countOne: " + countOne);
        System.out.println("Percentage Zero: " + percentageZero + "%\nPercentage One: " + percentageOne + "%");

    }
}
