import java.util.Random;
import java.lang.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] A = new int[10];

        Random rand = new Random();

        int count = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(10);
            if (A[i] % 2 == 0){
                count++;
            }
        }

        // int par = A.length - count;
        
        // - Regra de 3
        // A.length - 100%
        // count    - x

        // x*A.length = count * 100
        
        // x = (count * 100)/A.length


        double percentagePair = (count * 100)/A.length;

        double percentageOdd = percentagePair - 100;
        
        System.out.println("Pocentagem de par(es): " + percentagePair + "%" + "\nPorcentagem de impar(es): " + Math.abs(percentageOdd) + "%");

    }
}
