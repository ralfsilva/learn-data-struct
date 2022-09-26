import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] A = new int[10];

        Random rand = new Random();

        int sumSmallerFifteen = 0;
        int equalFifteen = 0;
        int countFifteenLarger = 0;
        int sumFifteenLarger = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(30);
            
            if (A[i] == 15) {
                equalFifteen++;
            }
            else if (A[i] < 15) {
                sumSmallerFifteen += A[i];
            } 
            else {
                countFifteenLarger++;
                sumFifteenLarger += A[i];
            }
        }

        double averageLargerFifteen = sumFifteenLarger/countFifteenLarger;
        
        System.out.printf("Sum of Numbers smaller that fifteen: %d %nElements with fifteen value: %d %nThe values average of the numbers larger that fifteen: %.1f%n", sumSmallerFifteen, equalFifteen, averageLargerFifteen);

    }
}
